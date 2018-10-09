package com.flashmouse.thumbGallery
{
    import caurina.transitions.*;
    import com.util.display.*;
    import com.util.loading.*;
    import com.util.point.*;
    import com.util.scroll.*;
    import flash.display.*;
    import flash.events.*;

    public class Thumbs extends Object
    {
        private var scroll:Object;
        private var prevImg:Object;
        private var base:Gallery;
        private var loader:UtilityLoader;
        private var pos:String;
        private var isOver:Boolean = false;
        private var thumbHolder:Sprite;
        private var prevThumb:Object;
        private var clickStopped:Boolean = false;
        private var thumbMask:Sprite;
        private var thumbArr:Array;
        private var model:Model;
        private var curThumb:Object;

        public function Thumbs(param1:Gallery, param2:Model)
        {
            thumbArr = [];
            isOver = false;
            clickStopped = false;
            this.model = param2;
            param2.addEventListener("CLEAR_ALL", onClearAll);
            this.base = param1;
            loader = new UtilityLoader();
            return;
        }// end function

        private function onClearAll(event:Event) : void
        {
            var i:uint;
            var mc:*;
            var e:* = event;
            model.removeEventListener(Event.CHANGE, update);
            try
            {
                scroll.destroy();
            }
            catch (e:Error)
            {
            }
            i;
            while (i < thumbArr.length)
            {
                
                mc = thumbArr[i];
                try
                {
                    thumbHolder.removeChild(mc);
                }
                catch (e:Error)
                {
                }
                i = (i + 1);
            }
            if (thumbHolder)
            {
                base.removeChild(thumbHolder);
                base.removeChild(thumbMask);
            }
            return;
        }// end function

        private function update(event:Event) : void
        {
            var bg:*;
            var img:*;
            var e:* = event;
            bg = thumbArr[model.curNum].getChildByName("bg");
            img = thumbArr[model.curNum].getChildByName("empty");
            curThumb = thumbArr[model.curNum];
            img.alpha = 1;
            if (prevThumb != bg)
            {
                Color.setColor(bg, base.thumbActiveColor);
                try
                {
                    Color.setColor(prevThumb, base.thumbColor);
                }
                catch (e:Error)
                {
                }
            }
            if (prevImg != img)
            {
                try
                {
                    prevImg.alpha = base.thumbAlpha;
                }
                catch (e:Error)
                {
                }
            }
            prevImg = img;
            prevThumb = bg;
            if (!isOver && !clickStopped)
            {
                checkOutOfBounds();
            }
            return;
        }// end function

        public function init() : void
        {
            clickStopped = false;
            pos = base.thumbPosition;
            thumbArr = [];
            thumbHolder = new Sprite();
            if (pos == "bottom")
            {
                thumbHolder.x = base.backgroundBorder;
                thumbHolder.y = base.imgHeight + base.backgroundBorder + base.thumbRowGap;
            }
            if (pos == "top")
            {
                thumbHolder.x = base.backgroundBorder;
                thumbHolder.y = base.backgroundBorder;
            }
            if (pos == "left")
            {
                thumbHolder.x = base.backgroundBorder;
                thumbHolder.y = base.backgroundBorder;
            }
            if (pos == "right")
            {
                thumbHolder.x = base.imgWidth + base.backgroundBorder + base.thumbRowGap;
                thumbHolder.y = base.backgroundBorder;
            }
            base.addChild(thumbHolder);
            model.addEventListener(Event.CHANGE, update);
            createThumbs();
            return;
        }// end function

        private function makeThumbMask() : void
        {
            var _Position:Shape = null;
            _Position = new Shape();
            _Position.graphics.beginFill(16711680);
            if (pos == "bottom" || pos == "top")
            {
                _Position.graphics.drawRoundRect(0, 0, base.imgWidth, base.thumbHeight + base.thumbBorder * 2, base.thumbMaskCorner, base.thumbMaskCorner);
            }
            if (pos == "left" || pos == "right")
            {
                _Position.graphics.drawRoundRect(0, 0, base.thumbWidth + base.thumbBorder * 2, base.imgHeight, base.thumbMaskCorner, base.thumbMaskCorner);
            }
            _Position.graphics.endFill();
            thumbMask = new Sprite();
            thumbMask.addChild(_Position);
            base.addChild(thumbMask);
            thumbHolder.mask = thumbMask;
            thumbMask.x = thumbHolder.x;
            thumbMask.y = thumbHolder.y;
            if (base.autoPlay > 0)
            {
                base.removeEventListener(Event.ENTER_FRAME, checkHit);
                base.addEventListener(Event.ENTER_FRAME, checkHit);
            }
            return;
        }// end function

        private function checkOutOfBounds() : void
        {
            var _Position:* = undefined;
            var _myXml:* = undefined;
            _Position = CoordinateTools.localToLocal(curThumb, thumbHolder.parent);
            if (pos == "bottom" || pos == "top")
            {
                if (_Position.x < 0 + base.backgroundBorder)
                {
                    _myXml = thumbHolder.x - _Position.x + base.backgroundBorder;
                    Tweener.addTween(thumbHolder, {x:_myXml, time:0.5, transition:"easeInOutCirc"});
                }
                if (_Position.x > base.imgWidth - base.thumbWidth)
                {
                    _myXml = base.imgWidth - curThumb.x - base.thumbWidth;
                    Tweener.addTween(thumbHolder, {x:_myXml, time:0.5, transition:"easeInOutCirc"});
                }
            }
            if (pos == "left" || pos == "right")
            {
                if (_Position.y < 0 + base.backgroundBorder)
                {
                    _myXml = thumbHolder.y - _Position.y + base.backgroundBorder;
                    Tweener.addTween(thumbHolder, {y:_myXml, time:0.5, transition:"easeInOutCirc"});
                }
                if (_Position.y > base.imgHeight - base.thumbHeight)
                {
                    _myXml = base.imgHeight - curThumb.y - base.thumbHeight;
                    Tweener.addTween(thumbHolder, {y:_myXml, time:0.5, transition:"easeInOutCirc"});
                }
            }
            return;
        }// end function

        private function onDown(event:MouseEvent) : void
        {
            var _myXml:* = undefined;
            _myXml = event.currentTarget;
            model.updateImage(_myXml.num);
            model.resetTimer();
            if (base.stopAutoOnClick)
            {
                clickStopped = true;
                model.stopAuto();
            }
            model.thumbClick();
            return;
        }// end function

        private function onOut(event:MouseEvent) : void
        {
            var _myXml:* = undefined;
            var _myImage:* = undefined;
            var _myImage_small:* = undefined;
            _myXml = event.currentTarget;
            _myImage = _myXml.getChildByName("bg");
            _myImage_small = _myXml.getChildByName("empty");
            if (prevThumb != _myImage)
            {
                Color.setColor(_myImage, base.thumbColor);
                _myImage_small.alpha = base.thumbAlpha;
            }
            return;
        }// end function

        private function checkHit(event:Event) : void
        {
            if (thumbMask.hitTestPoint(base.stage.mouseX, base.stage.mouseY))
            {
                isOver = true;
            }
            else
            {
                isOver = false;
            }
            return;
        }// end function

        private function onOver(event:MouseEvent) : void
        {
            var _myXml:* = undefined;
            var _myImage:* = undefined;
            var _myImage_small:* = undefined;
            _myXml = event.currentTarget;
            _myImage = _myXml.getChildByName("bg");
            _myImage_small = _myXml.getChildByName("empty");
            if (prevThumb != _myImage)
            {
                Color.setColor(_myImage, base.thumbRollColor);
                _myImage_small.alpha = 1;
                model.thumbRoll();
            }
            return;
        }// end function

        private function createThumbs() : void
        {
            var _Position:* = undefined;
            var _myXml:String = null;
            var _myImage:uint = 0;
            var _myImage_small:String = null;
            var _myImage_small_bg:* = undefined;
            var _myImage_mc:* = undefined;
            var _myImage_small_mc:Shape = null;
            var _myImage_small_cor:Number = NaN;
            var _myImage_small_cor_bg:Shape = null;
            var _myStage:Sprite = null;
            _Position = model.itemArr;
            _myXml = model.xmlOb.setup.@path;
            _myImage = 0;
            while (_myImage < _Position.length)
            {
                
                _myImage_small = _Position[_myImage].thumb;
                _myImage_small_bg = _myXml + _myImage_small;
                _myImage_mc = new MovieClip();
                _myImage_small_mc = new Shape();
                _myImage_small_mc.graphics.beginFill(base.thumbColor);
                _myImage_small_cor = base.thumbCorner - base.thumbBorder;
                if (_myImage_small_cor < 0)
                {
                    _myImage_small_cor = 0;
                }
                _myImage_small_mc.graphics.drawRoundRect(0, 0, base.thumbWidth, base.thumbHeight, _myImage_small_cor, _myImage_small_cor);
                _myImage_small_mc.graphics.endFill();
                _myImage_small_cor_bg = new Shape();
                _myImage_small_cor_bg.graphics.beginFill(base.thumbColor);
                _myImage_small_cor_bg.graphics.drawRoundRect(0, 0, base.thumbWidth + base.thumbBorder * 2, base.thumbHeight + base.thumbBorder * 2, base.thumbCorner, base.thumbCorner);
                _myImage_small_cor_bg.graphics.endFill();
                _myImage_small_cor_bg.name = "bg";
                _myStage = new Sprite();
                _myStage.alpha = base.thumbAlpha;
                _myStage.name = "empty";
                _myStage.mask = _myImage_small_mc;
                var _Position1:* = base.thumbBorder;
                _myImage_small_mc.y = base.thumbBorder;
                //var _Position1:* = _Position1;
                _myImage_small_mc.x = _Position1;
                //var _Position1:* = _Position1;
                _myStage.y = _Position1;
                _myStage.x = _Position1;
                _myImage_mc.addChild(_myImage_small_cor_bg);
                _myImage_mc.addChild(_myStage);
                _myImage_mc.addChild(_myImage_small_mc);
                loader.load(_myStage, _myImage_small_bg);
                if (pos == "bottom" || pos == "top")
                {
                    _myImage_mc.x = _myImage * (base.thumbWidth + base.thumbSpace + base.thumbBorder * 2);
                }
                else if (pos == "left" || "right")
                {
                    _myImage_mc.y = _myImage * (base.thumbHeight + base.thumbSpace + base.thumbBorder * 2);
                }
                thumbHolder.addChild(_myImage_mc);
                thumbArr.push(_myImage_mc);
                _myImage_mc.buttonMode = true;
                _myImage_mc.num = _myImage;
                _myImage_mc.mouseChildren = false;
                _myImage_mc.addEventListener(MouseEvent.MOUSE_DOWN, onDown);
                _myImage_mc.addEventListener(MouseEvent.MOUSE_OVER, onOver);
                _myImage_mc.addEventListener(MouseEvent.MOUSE_OUT, onOut);
                _myImage = _myImage + 1;
            }
            makeThumbMask();
            if (pos == "bottom" || pos == "top")
            {
                scroll = new MouseScroll(thumbHolder, thumbMask, base.scrollSpeed * 0.01);
                scroll.start();
            }
            if (pos == "left" || pos == "right")
            {
                scroll = new MouseScrollVert(thumbHolder, thumbMask, base.scrollSpeed * 0.01);
                scroll.start();
            }
            return;
        }// end function

    }
}
