package com.util.preloader
{
    import caurina.transitions.*;
    import com.util.point.*;
    import flash.display.*;

    public class CircleLoader extends Object
    {
        private var arr:Array;
        private var delay:Object = 0.09;
        private var dot:Shape;
        private var holder:Object;

        public function CircleLoader(param1) : void
        {
            delay = 0.09;
            this.holder = param1;
            arr = CirclePoints.getPointsOnCircle(10, 15);
            return;
        }// end function

        function funcName2(param1)
        {
            Tweener.addTween(param1, {alpha:0.8, time:0.4, transition:"linear", onComplete:funcName, onCompleteParams:[param1]});
            return;
        }// end function

        public function start() : void
        {
            var _Position:* = undefined;
            deleteClips();
            holder.alpha = 1;
            _Position = 0;
            while (_Position < arr.length)
            {
                
                dot = new Shape();
                dot.graphics.beginFill(16777215);
                dot.graphics.lineStyle(1, 6710886);
                dot.graphics.drawCircle(4, 4, 4);
                dot.graphics.endFill();
                dot.x = arr[_Position].x;
                dot.y = arr[_Position].y;
                holder.addChild(dot);
                dot.alpha = 0.1;
                Tweener.addTween(dot, {alpha:0.8, time:0.4, delay:_Position * delay, transition:"linear", onComplete:funcName, onCompleteParams:[dot]});
                _Position = _Position + 1;
            }
            return;
        }// end function

        function funcName(param1)
        {
            Tweener.addTween(param1, {alpha:0.1, time:0.4, transition:"linear", onComplete:funcName2, onCompleteParams:[param1]});
            return;
        }// end function

        public function destroy()
        {
            Tweener.addTween(holder, {alpha:0, time:0.4, transition:"linear", onComplete:deleteClips});
            return;
        }// end function

        private function deleteClips() : void
        {
            var _Position:* = undefined;
            var _myXml:* = undefined;
            _Position = 0;
            while (_Position < holder.numChildren)
            {
                
                Tweener.removeTweens(holder.getChildAt(_Position));
                _Position = _Position + 1;
            }
            _myXml = holder.numChildren;
            _Position = 0;
            while (_Position < _myXml)
            {
                
                holder.removeChildAt(0);
                _Position = _Position + 1;
            }
            return;
        }// end function

    }
}
