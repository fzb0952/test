package com.util.scroll
{
    import flash.display.*;
    import flash.events.*;
    import flash.geom.*;

    public class MouseScroll extends Sprite
    {
        private var thumbHitArea:DisplayObjectContainer;
        private var scrollW:Number;
        private var speed:Number;
        private var halfWidth:Number;
        private var base:DisplayObjectContainer;
        private var velocity:Number;

        public function MouseScroll(param1:DisplayObjectContainer, param2:DisplayObjectContainer, param3:Number = 0.04)
        {
            base = param1;
            this.thumbHitArea = param2;
            this.velocity = param3;
            return;
        }// end function

        public function start() : void
        {
            scrollWidth = thumbHitArea.width;
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
            base.x = base.x - speed;
            _Position = -(base.width - scrollW);
            if (base.x < _Position)
            {
                base.x = _Position;
            }
            return;
        }// end function

        private function startScroll(event:Event) : void
        {
            var _myXml:Point = null;
            var _myImage:* = undefined;
            if (base.width > scrollW)
            {
                _myXml = new Point(mouseX, mouseY);
                if (thumbHitArea.hitTestPoint(_myXml.x, _myXml.y))
                {
                    _myImage = thumbHitArea.parent.globalToLocal(_myXml);
                    speed = Math.abs(_myImage.x - halfWidth) * velocity;
                    if (_myImage.x < halfWidth)
                    {
                        moveRight();
                    }
                    if (_myImage.x > halfWidth)
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
            base.x = base.x + speed;
            _Position = thumbHitArea.x;
            if (base.x > _Position)
            {
                base.x = _Position;
            }
            return;
        }// end function

        public function set scrollWidth(param1:Number) : void
        {
            scrollW = param1;
            halfWidth = param1 / 2;
            return;
        }// end function

        public function destroy()
        {
            thumbHitArea.removeEventListener(Event.ENTER_FRAME, startScroll);
            return;
        }// end function

    }
}
