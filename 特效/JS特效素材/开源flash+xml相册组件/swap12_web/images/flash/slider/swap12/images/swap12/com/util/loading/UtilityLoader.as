package com.util.loading
{
    import com.util.events.*;
    import flash.display.*;
    import flash.events.*;
    import flash.net.*;
    import flash.system.*;

    public class UtilityLoader extends EventDispatcher
    {
        private var multiLoader:Boolean = false;
        private var multiItems:Number;
        public var loader:Loader;
        private var mc:DisplayObjectContainer;
        private var initCallBack:Function;
        private var count:Number = 0;
        public var loaderBMP:Loader;
        private var checkPolicyFile:Boolean;
        private var progressCallBack:Function;
        private var multiPer:Number = 1;
        public static const MULTIPROGRESS:String = "multiprogress";
        public static const ERROR:String = "error";
        public static const PROGRESS:String = "progress";
        public static const INIT:String = "init";
        public static const COMPLETE:String = "complete";
        public static const MULTICOMPLETE:String = "multicomplete";

        public function UtilityLoader(param1:Boolean = false)
        {
            count = 0;
            multiLoader = false;
            multiPer = 1;
            this.checkPolicyFile = param1;
            return;
        }// end function

        public function loadMulti(param1:Array, param2:Array) : void
        {
            var _myImage:uint = 0;
            multiLoader = true;
            count = 0;
            multiItems = param1.length;
            _myImage = 0;
            while (_myImage < multiItems)
            {
                
                load(param1[_myImage], param2[_myImage]);
                _myImage = _myImage + 1;
            }
            return;
        }// end function

        private function progressListener(event:ProgressEvent) : void
        {
            var _myXml:* = undefined;
            var _myImage:* = undefined;
            var _myImage_small:* = undefined;
            _myXml = Math.round(event.bytesLoaded / event.bytesTotal * 100);
            _myImage = {};
            _myImage.percent = _myXml;
            _myImage_small = new EventCustom(UtilityLoader.PROGRESS, false, false, _myImage);
            dispatchEvent(_myImage_small);
            if (multiLoader)
            {
                multiProgress(_myXml);
            }
            return;
        }// end function

        private function multiComplete() : void
        {
            var _Position:* = undefined;
            _Position = new EventCustom(UtilityLoader.MULTICOMPLETE, false, false, {});
            dispatchEvent(_Position);
            return;
        }// end function

        private function completeListener(event:Event) : void
        {
            var _myXml:* = undefined;
            var _myImage:* = undefined;
            var _myImage_small:Bitmap = null;
            _myXml = {};
            _myXml.content = event.currentTarget.content;
            _myXml.container = event.currentTarget.content.parent.parent;
            if (_myXml.content is Bitmap)
            {
                _myImage_small = event.currentTarget.content as Bitmap;
                _myImage_small.smoothing = true;
                _myXml.bitmapData = Bitmap(event.currentTarget.content).bitmapData;
            }
            _myImage = new EventCustom(UtilityLoader.COMPLETE, false, false, _myXml);
            dispatchEvent(_myImage);
            if (multiLoader)
            {
                var _myImage_mc:* = count + 1;
                count = _myImage_mc;
                if (count == multiItems)
                {
                    multiComplete();
                }
            }
            return;
        }// end function

        public function bitmapLoader(param1:String, param2) : void
        {
            var ob:*;
            var target:*;
            var path:* = param1;
            var ref:* = param2;
            loaderBMP = new Loader();
            ob;
            target;
            target.ref = ref;
            ob.complete = function (event:Event)
            {
                var _myXml:* = undefined;
                trace("DONE");
                target.bitmapData = Bitmap(event.currentTarget.content).bitmapData;
                _myXml = new EventCustom(UtilityLoader.COMPLETE, false, false, target);
                dispatchEvent(_myXml);
                return;
            }// end function
            ;
            loaderBMP.load(new URLRequest(path));
            loaderBMP.contentLoaderInfo.addEventListener(Event.COMPLETE, ob.complete);
            return;
        }// end function

        private function multiProgress(param1:Number) : void
        {
            return;
        }// end function

        public function load(param1:DisplayObjectContainer, param2:String, param3 = null, param4 = null) : void
        {
            var lc:LoaderContext;
            var mc:* = param1;
            var path:* = param2;
            var initCallBack:* = param3;
            var progressCallBack:* = param4;
            createLoader();
            mc.addChild(loader);
            try
            {
                if (checkPolicyFile)
                {
                    lc = new LoaderContext();
                    lc.checkPolicyFile = true;
                    loader.load(new URLRequest(path), lc);
                }
                else
                {
                    loader.load(new URLRequest(path));
                }
            }
            catch (e:SecurityError)
            {
                trace(e);
            }
            return;
        }// end function

        private function ioErrorListener(event:IOErrorEvent) : void
        {
            var _myXml:* = undefined;
            trace("LOAD ERROR: " + event.text);
            _myXml = new EventCustom(UtilityLoader.ERROR, false, false, {});
            dispatchEvent(_myXml);
            return;
        }// end function

        private function createLoader() : void
        {
            loader = new Loader();
            loader.contentLoaderInfo.addEventListener(ProgressEvent.PROGRESS, progressListener);
            loader.contentLoaderInfo.addEventListener(Event.COMPLETE, completeListener);
            loader.contentLoaderInfo.addEventListener(Event.INIT, initListener);
            loader.contentLoaderInfo.addEventListener(IOErrorEvent.IO_ERROR, ioErrorListener);
            loader.contentLoaderInfo.addEventListener(HTTPStatusEvent.HTTP_STATUS, httpStatusListener);
            return;
        }// end function

        private function httpStatusListener(event:HTTPStatusEvent) : void
        {
            return;
        }// end function

        private function initListener(event:Event) : void
        {
            var _myXml:* = undefined;
            var _myImage:* = undefined;
            _myXml = {};
            _myXml.content = event.currentTarget.content;
            _myXml.container = event.currentTarget.content.parent.parent;
            _myImage = new EventCustom(UtilityLoader.INIT, false, false, _myXml);
            dispatchEvent(_myImage);
            return;
        }// end function

    }
}
