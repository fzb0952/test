package com.flashmouse.thumbGallery
{
    import com.util.*;
    import com.util.loading.*;
    import flash.display.*;
    import flash.events.*;

    public class Display extends Object
    {
        private var model:Model;
        private var imgPop:ImagePop;
        private var imgHolder:Sprite;
        private var window:String;
        private var base:Gallery;
        private var pos:String;
        private var imgLink:String;

        public function Display(param1:Gallery, param2:Model)
        {
            this.model = param2;
            param2.addEventListener("CLEAR_ALL", onClearAll);
            this.base = param1;
            return;
        }// end function

        private function onClick(event:MouseEvent) : void
        {
            if (window != "")
            {
            }
            Web.getURL(imgLink, window);
            return;
        }// end function

        private function onClearAll(event:Event) : void
        {
            model.removeEventListener(Event.CHANGE, update);
            if (imgHolder)
            {
                base.removeChild(imgHolder);
            }
            return;
        }// end function

        public function init() : void
        {
            var _Position:Shape = null;
            pos = base.thumbPosition;
            imgHolder = new MovieClip();
            if (pos == "bottom" || pos == "right")
            {
                imgHolder.x = base.backgroundBorder;
                imgHolder.y = base.backgroundBorder;
            }
            if (pos == "left")
            {
                imgHolder.x = base.backgroundBorder + (base.thumbWidth + base.thumbRowGap) + base.thumbBorder * 2;
                imgHolder.y = base.backgroundBorder;
            }
            if (pos == "top")
            {
                imgHolder.x = base.backgroundBorder;
                imgHolder.y = base.backgroundBorder + (base.thumbHeight + base.thumbRowGap) + base.thumbBorder * 2;
            }
            base.addChild(imgHolder);
            imgPop = new ImagePop(imgHolder, base);
            _Position = new Shape();
            _Position.x = imgHolder.x;
            _Position.y = imgHolder.y;
            _Position.graphics.beginFill(base.bgColor);
            _Position.graphics.drawRoundRect(0, 0, base.imgWidth, base.imgHeight, base.imgCorner, base.imgCorner);
            _Position.graphics.endFill();
            base.addChild(_Position);
            imgHolder.mask = _Position;
            model.addEventListener(Event.CHANGE, update);
            return;
        }// end function

        private function update(event:Event) : void
        {
            var _myXml:String = null;
            var _myImage:String = null;
            _myXml = model.xmlOb.setup.@path;
            _myImage = model.itemArr[model.curNum].img;
            imgLink = model.itemArr[model.curNum].imgLink;
            window = model.itemArr[model.curNum].imgLink.@window;
            imgPop.loadImage(_myXml + _myImage);
            imgHolder.buttonMode = false;
            imgHolder.removeEventListener(MouseEvent.CLICK, onClick);
            if (imgLink && imgLink != "")
            {
                imgHolder.buttonMode = true;
                imgHolder.addEventListener(MouseEvent.CLICK, onClick);
            }
            return;
        }// end function

    }
}
