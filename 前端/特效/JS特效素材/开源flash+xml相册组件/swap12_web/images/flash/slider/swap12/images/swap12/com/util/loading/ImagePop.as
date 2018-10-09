package com.util.loading
{
    import caurina.transitions.*;
    import com.flashmouse.thumbGallery.*;
    import com.util.events.*;
    import com.util.preloader.*;
    import fl.transitions.*;
    import fl.transitions.easing.*;
    import flash.display.*;
    import flash.filters.*;

    public class ImagePop extends Object
    {
        private var main:Gallery;
        private var spArr:Array;
        private var speed:Number;
        private var base:DisplayObjectContainer;
        private var loader:UtilityLoader;
        private var circAnim:CircleLoader;
        private var sp:MovieClip;
        private var loadAnimHolder:Sprite;
        private var prevImage:Object;

        public function ImagePop(param1:DisplayObjectContainer, param2:Gallery)
        {
            spArr = [];
            spArr = [];
            this.base = param1;
            this.main = param2;
            loadAnimHolder = new Sprite();
            loadAnimHolder.x = param2.imgWidth * 0.5;
            loadAnimHolder.y = param2.imgHeight * 0.5;
            param1.parent.addChild(loadAnimHolder);
            this.speed = param2.transitionSpeed;
            if (param2.showLoader)
            {
                circAnim = new CircleLoader(loadAnimHolder);
            }
            loader = new UtilityLoader();
            loader.addEventListener(UtilityLoader.COMPLETE, onComplete);
            return;
        }// end function

        private function removeIt(param1) : void
        {
            base.removeChild(param1);
            return;
        }// end function

        public function loadImage(param1:String) : void
        {
            if (main.showLoader)
            {
                circAnim.start();
            }
            sp = new MovieClip();
            spArr.push(sp);
            base.addChild(sp);
            loader.load(sp, param1);
            return;
        }// end function

        private function removePrev() : void
        {
            base.removeChild(spArr[0]);
            spArr.shift();
            return;
        }// end function

        private function fitImg(param1:Sprite) : void
        {
            var _myXml:* = undefined;
            var _myImage:* = undefined;
            var _myImage_small:* = undefined;
            var _myImage_small_bg:* = undefined;
            var _myImage_mc:* = undefined;
            var _myImage_small_mc:* = undefined;
            var _myImage_small_cor:* = undefined;
            _myXml = main.imgWidth;
            _myImage = main.imgHeight;
            if (main.scaleImage == "exactFit")
            {
                _myImage_small = param1.width / _myXml * 100;
                _myImage_small_bg = param1.height / _myImage * 100;
                if (_myImage_small > _myImage_small_bg)
                {
                    _myImage_mc = _myImage_small;
                }
                else
                {
                    _myImage_mc = _myImage_small_bg;
                }
                _myImage_small_mc = param1.width * (100 / _myImage_mc);
                _myImage_small_cor = param1.height * (100 / _myImage_mc);
                param1.width = Math.floor(_myImage_small_mc);
                param1.height = Math.floor(_myImage_small_cor);
            }
            else if (main.scaleImage == "noBorders")
            {
                if (param1.width != _myXml || param1.height != _myImage)
                {
                    _myImage_small = param1.width / _myXml * 100;
                    _myImage_small_bg = param1.height / _myImage * 100;
                    if (_myImage_small > _myImage_small_bg)
                    {
                        _myImage_mc = _myImage_small_bg;
                    }
                    else
                    {
                        _myImage_mc = _myImage_small;
                    }
                    _myImage_small_mc = param1.width * (100 / _myImage_mc);
                    _myImage_small_cor = param1.height * (100 / _myImage_mc);
                    param1.width = Math.floor(_myImage_small_mc);
                    param1.height = Math.floor(_myImage_small_cor);
                }
            }
            return;
        }// end function

        private function onComplete(param1:EventCustom) : void
        {
            var _myXml:* = undefined;
            var _myImage:BlurFilter = null;
            if (main.showLoader)
            {
                circAnim.destroy();
            }
            _myXml = param1.ob.container;
            fitImg(_myXml);
            _myXml.x = main.imgWidth * 0.5 - _myXml.width * 0.5;
            _myXml.y = main.imgHeight * 0.5 - _myXml.height * 0.5;
            if (main.transitionType == "fade")
            {
                TransitionManager.start(_myXml, {type:Fade, direction:Transition.IN, duration:speed, easing:None.easeNone});
            }
            if (main.transitionType == "blur")
            {
                _myImage = new BlurFilter();
                _myImage.blurX = 0;
                _myImage.blurY = 0;
                _myImage.quality = BitmapFilterQuality.MEDIUM;
                _myXml.filters = [_myImage];
                //Tweener.addTween(_myXml, {_blur_blurX:0, _blur_blurY:0, time:speed});
                TransitionManager.start(_myXml, {type:Fade, direction:Transition.IN, duration:speed, easing:None.easeNone});
            }
            if (main.transitionType == "zoom")
            {
                TransitionManager.start(_myXml, {type:Zoom, direction:Transition.IN, duration:speed, easing:Strong.easeOut});
            }
            if (main.transitionType == "squeeze")
            {
                TransitionManager.start(_myXml, {type:Squeeze, direction:Transition.IN, duration:speed, easing:Strong.easeInOut, dimension:0});
            }
            if (main.transitionType == "pixeldissolve")
            {
                TransitionManager.start(_myXml, {type:PixelDissolve, direction:Transition.IN, duration:speed, easing:Regular.easeIn, xSections:20, ySections:20});
            }
            if (main.transitionType == "blinds")
            {
                TransitionManager.start(_myXml, {type:Blinds, direction:Transition.IN, duration:speed, easing:Strong.easeOut, numStrips:20, dimension:1});
            }
            if (main.transitionType == "wipe")
            {
                TransitionManager.start(_myXml, {type:Wipe, direction:Transition.IN, duration:speed, easing:Strong.easeInOut, startPoint:4});
            }
            if (main.transitionType == "iris")
            {
                TransitionManager.start(_myXml, {type:Iris, direction:Transition.IN, duration:speed, easing:Strong.easeInOut, startPoint:5, shape:Iris.CIRCLE});
            }
            if (main.transitionType == "photo")
            {
                TransitionManager.start(_myXml, {type:Photo, direction:Transition.IN, duration:speed, easing:Strong.easeOut});
            }
            if (main.transitionType == "fly")
            {
                TransitionManager.start(_myXml, {type:Fly, direction:Transition.IN, duration:speed, easing:Strong.easeInOut, startPoint:4});
            }
            if (prevImage)
            {
                Tweener.addTween(prevImage, {alpha:0, time:0.25, delay:speed - 0.1, transition:"linear", onComplete:removeIt, onCompleteParams:[prevImage]});
            }
            prevImage = _myXml;
            return;
        }// end function

    }
}
