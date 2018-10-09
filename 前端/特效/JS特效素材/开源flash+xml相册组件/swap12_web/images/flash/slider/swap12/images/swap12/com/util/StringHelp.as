package com.util
{

    public class StringHelp extends Object
    {

        public function StringHelp()
        {
            return;
        }// end function

        public static function replace(param1:String, param2:String, param3:String) : String
        {
            var _myImage_small:* = undefined;
            var _myImage_small_bg:* = undefined;
            _myImage_small = param2;
            _myImage_small_bg = param3;
            return param1.split(_myImage_small).join(_myImage_small_bg);
        }// end function

    }
}
