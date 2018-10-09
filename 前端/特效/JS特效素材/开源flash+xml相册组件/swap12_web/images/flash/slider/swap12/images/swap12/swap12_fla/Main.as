package swap12_fla
{
    import com.flashmouse.thumbGallery.*;
    import flash.display.*;
    import flash.events.*;
    import flash.text.*;
    import flash.utils.*;

    dynamic public class Main extends MovieClip
    {
        public var myGallery:Gallery;
        public var next:MovieClip;
        public var prev:MovieClip;
        public var __setPropDict:Dictionary;
        public var captionTextField:TextField;
        public var isPlaying:Object;
        public var controls:MovieClip;

        public function Main()
        {
            __setPropDict = new Dictionary(true);
            addFrameScript(0, frame2);
            return;
        }// end function

        public function onDone(event:Event)
        {
            next.visible = true;
            prev.visible = true;
            return;
        }// end function

        public function onBackOut(event:MouseEvent) : void
        {
            event.currentTarget.gotoAndStop(1);
            return;
        }// end function

        public function onPause(event:MouseEvent)
        {
            if (isPlaying)
            {
                myGallery.stopAutoPlay();
                controls.pause_btn.gotoAndStop(2);
                isPlaying = false;
            }
            else
            {
                myGallery.startAutoPlay();
                controls.pause_btn.gotoAndStop(1);
                isPlaying = true;
            }
            return;
        }// end function

        public function onBackOver(event:MouseEvent) : void
        {
            event.currentTarget.gotoAndStop(2);
            return;
        }// end function

        public function onBack(event:MouseEvent)
        {
            myGallery.prevImage();
            return;
        }// end function

        public function onNextOver(event:MouseEvent) : void
        {
            event.currentTarget.gotoAndStop(2);
            return;
        }// end function

        public function onPauseOut(event:MouseEvent)
        {
            event.currentTarget.outline.gotoAndStop(1);
            return;
        }// end function

        public function onNextOut(event:MouseEvent) : void
        {
            event.currentTarget.gotoAndStop(1);
            return;
        }// end function

        public function onNext(event:MouseEvent)
        {
            myGallery.nextImage();
            return;
        }// end function

        function __setProp_myGallery_Scene1_galery_2()
        {
            try
            {
                myGallery["componentInspectorSetting"] = true;
            }
            catch (e:Error)
            {
            }
            myGallery.imgHeight = 200;
            myGallery.imgWidth = 390;
            myGallery.thumbHeight = 30;
            myGallery.thumbWidth = 40;
            myGallery.xmlPath = "images/flash/slider/swap12/images/swap12/xml/swap12.xml";
            myGallery.autoPlay = 2;
            myGallery.backgroundBorder = 8;
            myGallery.bgAlpha = 1;
            myGallery.captionTextField = "captionTextField";
            myGallery.bgColor = 51;
            myGallery.thumbActiveColor = 16737792;
            myGallery.thumbColor = 16777215;
            myGallery.thumbRollColor = 16776960;
            myGallery.backgroundCorner = 15;
            myGallery.imgCorner = 6;
            myGallery.thumbMaskCorner = 8;
            myGallery.thumbCorner = 8;
            myGallery.loopImages = true;
            myGallery.randomImages = false;
            myGallery.scaleImage = "noBorders";
            myGallery.scrollSpeed = 4;
            myGallery.showLoader = true;
            myGallery.soundThumbClick = "";
            myGallery.soundThumbRoll = "";
            myGallery.stopAutoOnClick = false;
            myGallery.thumbAlpha = 0.5;
            myGallery.thumbBorder = 2;
            myGallery.thumbPosition = "right";
            myGallery.thumbRowGap = 10;
            myGallery.transitionSpeed = 1;
            myGallery.transitionType = "wipe";
            myGallery.thumbSpace = 4;
            try
            {
                myGallery["componentInspectorSetting"] = false;
            }
            catch (e:Error)
            {
            }
            return;
        }// end function

        public function onOver(event:MouseEvent)
        {
            event.target.alpha = 1;
            return;
        }// end function

        function frame2()
        {
            if (__setPropDict[myGallery] == undefined || int(__setPropDict[myGallery]) != 2)
            {
                __setPropDict[myGallery] = currentFrame;
                __setProp_myGallery_Scene1_galery_2();
            }
            controls.back_btn.buttonMode = true;
            controls.next_btn.buttonMode = true;
            controls.pause_btn.buttonMode = true;
            controls.next_btn.addEventListener(MouseEvent.CLICK, onNext);
            controls.back_btn.addEventListener(MouseEvent.CLICK, onBack);
            controls.back_btn.addEventListener(MouseEvent.CLICK, onBack);
            controls.next_btn.addEventListener(MouseEvent.MOUSE_OVER, onNextOver);
            controls.back_btn.addEventListener(MouseEvent.MOUSE_OVER, onBackOver);
            controls.next_btn.addEventListener(MouseEvent.MOUSE_OUT, onNextOut);
            controls.back_btn.addEventListener(MouseEvent.MOUSE_OUT, onBackOut);
            controls.pause_btn.addEventListener(MouseEvent.CLICK, onPause);
            controls.pause_btn.addEventListener(MouseEvent.MOUSE_OVER, onPauseOver);
            controls.pause_btn.addEventListener(MouseEvent.MOUSE_OUT, onPauseOut);
            isPlaying = true;
            return;
        }// end function

        public function onPauseOver(event:MouseEvent)
        {
            event.currentTarget.outline.gotoAndStop(2);
            return;
        }// end function

        public function onOut(event:MouseEvent)
        {
            event.target.alpha = 0.7;
            return;
        }// end function

    }
}
