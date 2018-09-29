package com.util.scroll
{
    import flash.display.*;
    import flash.events.*;
    import flash.geom.*;

    public class MouseScrollVert extends Sprite
    {
        private var thumbHitArea:DisplayObjectContainer;
        private var scrollW:Number;
        private var halfHeight:Number;
        private var speed:Number;
        private var base:DisplayObjectContainer;
        private var velocity:Number;

        public function MouseScrollVert(param1:DisplayObjectContainer, param2:DisplayObjectContainer, param3:Number = 0.04)
        {
            base = param1;
            this.thumbHitArea = param2;
            this.velocity = param3;
            return;
        }// end function

        public function start() : void
        {
            scrollHeight = thumbHitArea.height;
            try
            {
            }
            catch (e:Error)
            {
            }
            thumbHitArea.addEventListener(Event.ENTER_FRAME, startScroll);
            return;
        }// end function

        private function moveLeft() : void
        {
            var _Position:Number = NaN;
            base.y = base.y - speed;
            _Position = -(base.height - scrollW);
            if (base.y < _Position)
            {
                base.y = _Position;
            }
            return;
        }// end function

        public function set scrollHeight(param1:Number) : void
        {
            scrollW = param1;
            halfHeight = param1 / 2;
            return;
        }// end function

        private function startScroll(event:Event) : void
        {
            var _myXml:Point = null;
            var _myImage:* = undefined;
            if (base.height > scrollW)
            {
                _myXml = new Point(mouseX, mouseY);
                if (thumbHitArea.hitTestPoint(_myXml.x, _myXml.y))
                {
                    _myImage = thumbHitArea.parent.globalToLocal(_myXml);
                    speed = Math.abs(_myImage.y - halfHeight) * velocity;
                    if (_myImage.y < halfHeight)
                    {
                        moveRight();
                    }
                    if (_myImage.y > halfHeight)
                    {
                        moveLeft();
                    }
                }
            }
            return;
        }// end function

        private function moveRight() : void
        {
            var _Position:Number = NaN;
            base.y = base.y + speed;
            _Position = thumbHitArea.y;
            if (base.y > _Position)
            {
                base.y = _Position;
            }
            return;
        }// end function

        public function destroy()
        {
            thumbHitArea.removeEventListener(Event.ENTER_FRAME, startScroll);
            return;
        }// end function

    }
}
