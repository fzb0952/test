package com.util.xml
{
    import flash.events.*;
    import flash.net.*;

    public class XMLLoader extends EventDispatcher
    {
        private var urlLoader:URLLoader;
        private var returnFunc:Function;
        private var _xmlData:XML;
        public static const XML_READY:String = "xml_ready";

        public function XMLLoader(param1:String, param2:Function = null) : void
        {
            var _myImage:URLRequest = null;
            if (param2 != null)
            {
                this.returnFunc = param2;
            }
            _myImage = new URLRequest(param1);
            urlLoader = new URLLoader();
            urlLoader.addEventListener(Event.COMPLETE, onLoad);
            urlLoader.addEventListener(IOErrorEvent.IO_ERROR, ioErrorListener);
            urlLoader.load(_myImage);
            return;
        }// end function

        public function get xmlData() : XML
        {
            return _xmlData;
        }// end function

        private function ioErrorListener(event:IOErrorEvent) : void
        {
            trace("LOAD ERROR: " + event.text);
            return;
        }// end function

        private function onLoad(event:Event) : void
        {
            var _myXml:XML = null;
            _myXml = new XML(urlLoader.data);
            _xmlData = _myXml;
            if (returnFunc != null)
            {
                trace("wawa");
                returnFunc(_myXml);
                returnFunc = null;
                _xmlData = null;
                urlLoader = null;
            }
            dispatchEvent(new Event(XMLLoader.XML_READY));
            if (urlLoader && urlLoader.hasEventListener(Event.COMPLETE))
            {
                urlLoader.removeEventListener(Event.COMPLETE, onLoad);
            }
            return;
        }// end function

    }
}
