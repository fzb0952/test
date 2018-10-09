package com.flashmouse.thumbGallery
{
    import com.util.*;
    import com.util.xml.*;
    import flash.display.*;
    import flash.events.*;
    import flash.utils.*;

    public class Gallery extends MovieClip
    {
        public var thumbRowGap:Number = 10;
        public var bgColor:Object = "#333333";
        public var bgAlpha:Number = 1;
        public var scaleImage:String = "none";
        public var transitionType:String = "blur";
        public var loopImages:Boolean = true;
        private var xmlOb:XML;
        public var thumbActiveColor:Object = "#FF0000";
        public var captionTextField:String = "";
        public var thumbHeight:Number = 30;
        private var display:Object;
        public var imgHeight:Number = 300;
        public var thumbSpace:Number = 4;
        public var showControls:Boolean;
        public var thumbMaskCorner:Number = 8;
        public var stopAutoOnClick:Boolean = false;
        public var xmlPath:String = "xml/swap12.xml";
        public var totalWidth:Number;
        public var areaMC:MovieClip;
        public var backgroundBorder:Number = 8;
        private var xmlLoader:XMLLoader;
        public var randomImages:Boolean = false;
        public var backgroundCorner:Number = 15;
        public var thumbPosition:String = "bottom";
        private var model:Model;
        public var soundThumbRoll:String = "";
        public var thumbColor:Object = "#999999";
        public var thumbAlpha:Number = 0.5;
        public var captionPosition:Boolean;
        private var thumbs:Object;
        public var showLoader:Boolean = true;
        public var scrollSpeed:Number = 4;
        public var autoPlay:Number = 3;
        public var totalHeight:Number;
        public var thumbWidth:Number = 40;
        private var shape:Shape;
        public var thumbBorder:Number = 2;
        private var auto:Object;
        public var thumbRollColor:Object = "#FF0000";
        public var soundThumbClick:String = "";
        public var imgWidth:Number = 400;
        public var thumbCorner:Number = 8;
        public var transitionSpeed:Number = 1;
        public var imgCorner:Number = 6;
        public static const GALLERY_COMPLETE:String = "GALLERY_COMPLETE";

        public function Gallery(param1:String = null)
        {
            var _myXml:* = undefined;
            var _myImage:* = undefined;
            xmlPath = "xml/swap12.xml";
            captionTextField = "";
            imgWidth = 400;
            imgHeight = 300;
            backgroundCorner = 15;
            thumbCorner = 8;
            thumbMaskCorner = 8;
            thumbBorder = 2;
            bgColor = "#333333";
            bgAlpha = 1;
            imgCorner = 6;
            thumbPosition = "bottom";
            backgroundBorder = 8;
            thumbSpace = 4;
            thumbWidth = 40;
            thumbHeight = 30;
            thumbRowGap = 10;
            scrollSpeed = 4;
            autoPlay = 3;
            thumbColor = "#999999";
            thumbRollColor = "#FF0000";
            thumbActiveColor = "#FF0000";
            transitionType = "blur";
            scaleImage = "none";
            soundThumbRoll = "";
            soundThumbClick = "";
            showLoader = true;
            loopImages = true;
            randomImages = false;
            stopAutoOnClick = false;
            transitionSpeed = 1;
            thumbAlpha = 0.5;
            this.scaleX = 1;
            this.scaleY = 1;
            this.removeChild(areaMC);
            model = new Model(this);
            model.addEventListener("CLEAR_ALL", onClearAll);
            display = new Display(this, model);
            thumbs = new Thumbs(this, model);
            auto = new AutoPlay(this, model);
            _myXml = new Sounds(this, model);
            _myImage = new CaptionText(this, model);
            if (param1 != null)
            {
                this.xmlPath = param1;
            }
            setTimeout(init, 100);
            return;
        }// end function

        public function startAutoPlay() : void
        {
            model.startAuto();
            return;
        }// end function

        public function loadImage(param1:Number) : void
        {
            model.updateImage((param1 - 1));
            return;
        }// end function

        private function setBG() : void
        {
            var _Position:Number = NaN;
            var _myXml:Number = NaN;
            var _myImage:Number = NaN;
            var _myImage_small:Number = NaN;
            _Position = thumbWidth + thumbBorder * 2;
            _myXml = thumbHeight + thumbBorder * 2;
            shape = new Shape();
            shape.graphics.beginFill(bgColor);
            if (thumbPosition == "bottom" || thumbPosition == "top")
            {
                _myImage = imgWidth + backgroundBorder * 2;
                _myImage_small = imgHeight + backgroundBorder * 2 + thumbRowGap + _myXml;
                totalWidth = _myImage;
                totalHeight = _myImage_small;
            }
            if (thumbPosition == "left" || thumbPosition == "right")
            {
                _myImage = imgWidth + backgroundBorder * 2 + thumbRowGap + _Position;
                _myImage_small = imgHeight + backgroundBorder * 2;
                totalWidth = _myImage;
                totalHeight = _myImage_small;
            }
            shape.graphics.drawRoundRect(0, 0, _myImage, _myImage_small, backgroundCorner, backgroundCorner);
            shape.graphics.endFill();
            this.addChild(shape);
            shape.alpha = bgAlpha;
            return;
        }// end function

        public function nextImage() : void
        {
            model.resetTimer();
            model.nextImg();
            return;
        }// end function

        public function createGallery(param1:String) : void
        {
            var xmlFile:* = param1;
            try
            {
            }
            catch (e:Error)
            {
            }
            setTimeout(doCreate, 110, xmlFile);
            return;
        }// end function

        public function prevImage() : void
        {
            model.resetTimer();
            model.prevImg();
            return;
        }// end function

        private function overRideProps() : void
        {
            var _Position:* = undefined;
            var _myXml:uint = 0;
            var _myImage:* = undefined;
            var _myImage_small:* = undefined;
            _Position = xmlOb.setup;
            _myXml = 0;
            while (_myXml < _Position.children().length())
            {
                
                _myImage = _Position.children()[_myXml].name();
                _myImage_small = _Position.children()[_myXml];
                if (_myImage_small == "true")
                {
                    _myImage_small = true;
                }
                if (_myImage_small == "false")
                {
                    _myImage_small = false;
                }
                this[_myImage] = _myImage_small;
                _myXml = _myXml + 1;
            }
            bgColor = StringHelp.replace(bgColor, "#", "0x");
            thumbColor = StringHelp.replace(thumbColor, "#", "0x");
            thumbRollColor = StringHelp.replace(thumbRollColor, "#", "0x");
            thumbActiveColor = StringHelp.replace(thumbActiveColor, "#", "0x");
            return;
        }// end function

        private function init() : void
        {
            xmlPath = xmlPath //+ ("?noCache=" + Math.random() * 1000);
            xmlLoader = new XMLLoader(xmlPath);
            xmlLoader.addEventListener(XMLLoader.XML_READY, onXMLLoaded);
            return;
        }// end function

        private function onClearAll(event:Event) : void
        {
            if (shape)
            {
                this.removeChild(shape);
            }
            return;
        }// end function

        public function reset()
        {
            model.clearAll();
            onXMLLoaded();
            return;
        }// end function

        private function doCreate(param1:String) : void
        {
            xmlLoader.removeEventListener(XMLLoader.XML_READY, onXMLLoaded);
            this.xmlPath = param1 //+ ("?noCache=" + Math.random() * 1000);
            model.clearAll();
            xmlLoader = new XMLLoader(xmlPath);
            xmlLoader.addEventListener(XMLLoader.XML_READY, onXMLLoaded);
            return;
        }// end function

        public function stopAutoPlay() : void
        {
            model.stopAuto();
            return;
        }// end function

        public function onXMLLoaded(event:Event = null) : void
        {
            this.xmlOb = xmlLoader.xmlData;
            overRideProps();
            setBG();
            model.setXML(xmlOb);
            display.init();
            thumbs.init();
            auto.init();
            model.update();
            dispatchEvent(new Event(Gallery.GALLERY_COMPLETE));
            return;
        }// end function

        public function destroy() : void
        {
            model.clearAll();
            return;
        }// end function

    }
}
