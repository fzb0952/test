package com.util
{
    import flash.net.*;

    public class Web extends Object
    {

        public function Web()
        {
            return;
        }// end function

        public static function getURL(param1:String, param2:String = null) : void
        {
            var req:URLRequest;
            var url:* = param1;
            var window:* = param2;
            req = new URLRequest(url);
            try
            {
                navigateToURL(req, "_blank");
            }
            catch (e:Error)
            {
                trace("Navigate to URL failed", e.message);
            }
            return;
        }// end function

    }
}
