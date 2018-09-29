package com.flashmouse.thumbGallery
{
    import flash.events.*;
    import flash.utils.*;

    public class AutoPlay extends Object
    {
        private var myTimer:Timer;
        private var model:Model;
        private var main:Gallery;

        public function AutoPlay(param1:Gallery, param2:Model)
        {
            this.main = param1;
            this.model = param2;
            param2.addEventListener("RESET_TIMER", resetTimer);
            param2.addEventListener("STOP_AUTO", stopAuto);
            param2.addEventListener("START_AUTO", resetTimer);
            param2.addEventListener("CLEAR_ALL", destroy);
            return;
        }// end function

        private function timerHandler(event:TimerEvent) : void
        {
            model.nextImg();
            return;
        }// end function

        public function init() : void
        {
            var interval:Number;
            interval = main.autoPlay * 1000;
            try
            {
                myTimer.stop();
            }
            catch (e:Error)
            {
            }
            myTimer = new Timer(interval, 0);
            myTimer.removeEventListener("timer", timerHandler);
            myTimer.addEventListener("timer", timerHandler);
            if (main.autoPlay > 0)
            {
                myTimer.start();
            }
            return;
        }// end function

        private function stopAuto(event:Event) : void
        {
            myTimer.stop();
            return;
        }// end function

        private function resetTimer(event:Event) : void
        {
            var _myXml:Number = NaN;
            if (main.autoPlay > 0)
            {
                _myXml = main.autoPlay * 1000;
                myTimer.stop();
                myTimer = new Timer(_myXml, 0);
                myTimer.removeEventListener("timer", timerHandler);
                myTimer.addEventListener("timer", timerHandler);
                myTimer.start();
            }
            return;
        }// end function

        private function destroy(event:Event) : void
        {
            myTimer.stop();
            return;
        }// end function

    }
}
