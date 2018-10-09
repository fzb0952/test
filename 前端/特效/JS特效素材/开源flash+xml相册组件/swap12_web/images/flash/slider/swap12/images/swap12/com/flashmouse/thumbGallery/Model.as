package com.flashmouse.thumbGallery
{
    import com.util.*;
    import flash.events.*;

    public class Model extends EventDispatcher
    {
        public var xmlOb:XML;
        public var itemArr:Array;
        public var curNum:Number = 0;
        private var main:Gallery;

        public function Model(param1:Gallery)
        {
            curNum = 0;
            itemArr = [];
            this.main = param1;
            return;
        }// end function

        public function update() : void
        {
            dispatchEvent(new Event(Event.CHANGE));
            return;
        }// end function

        public function nextImg() : void
        {
            var _myXml:* = curNum + 1;
            curNum = _myXml;
            if (curNum > (itemArr.length - 1))
            {
                if (main.loopImages)
                {
                    curNum = 0;
                }
                else
                {
                    curNum = itemArr.length - 1;
                }
            }
            update();
            return;
        }// end function

        public function updateImage(param1:Number) : void
        {
            curNum = param1;
            update();
            return;
        }// end function

        public function setXML(param1) : void
        {
            this.xmlOb = param1;
            setArray();
            return;
        }// end function

        private function setArray() : void
        {
            var _Position:uint = 0;
            _Position = 0;
            while (_Position < xmlOb.item.length())
            {
                
                itemArr.push(xmlOb.item[_Position]);
                _Position = _Position + 1;
            }
            if (main.randomImages == true)
            {
                itemArr = ArrayHelp.shuffle(itemArr);
            }
            return;
        }// end function

        public function clearAll() : void
        {
            itemArr = [];
            dispatchEvent(new Event("CLEAR_ALL"));
            return;
        }// end function

        public function prevImg() : void
        {
            var _myXml:* = curNum - 1;
            curNum = _myXml;
            if (curNum < 0)
            {
                curNum = 0;
            }
            update();
            return;
        }// end function

        public function stopAuto() : void
        {
            dispatchEvent(new Event("STOP_AUTO"));
            return;
        }// end function

        public function thumbClick() : void
        {
            dispatchEvent(new Event("THUMB_CLICK"));
            return;
        }// end function

        public function startAuto() : void
        {
            nextImg();
            dispatchEvent(new Event("START_AUTO"));
            return;
        }// end function

        public function resetTimer() : void
        {
            dispatchEvent(new Event("RESET_TIMER"));
            return;
        }// end function

        public function thumbRoll() : void
        {
            dispatchEvent(new Event("THUMB_ROLL"));
            return;
        }// end function

    }
}
