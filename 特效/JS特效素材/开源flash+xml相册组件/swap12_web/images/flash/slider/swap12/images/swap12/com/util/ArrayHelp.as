package com.util
{

    public class ArrayHelp extends Object
    {

        public function ArrayHelp()
        {
            return;
        }// end function

        public static function shuffle(param1:Array, param2:int = 0, param3:int = 0) : Array
        {
            var _myImage_small:int = 0;
            var _myImage_small_bg:int = 0;
            var _myImage_mc:* = undefined;
            if (param3 == 0)
            {
                param3 = param1.length - 1;
            }
            _myImage_small = param3;
            while (_myImage_small > param2)
            {
                
                _myImage_small_bg = Math.floor(Math.random() * param3) + param2;
                _myImage_mc = param1[_myImage_small];
                param1[_myImage_small] = param1[_myImage_small_bg];
                param1[_myImage_small_bg] = _myImage_mc;
                _myImage_small = _myImage_small - 1;
            }
            return param1;
        }// end function

        public static function findByIndexOf(param1:Array, param2:Object) : uint
        {
            var _myImage:int = 0;
            _myImage = param1.indexOf(param2);
            if (_myImage == -1)
            {
                trace("NOT FOUND");
                _myImage = -1;
            }
            else
            {
                trace("Found " + param2 + " at index: " + _myImage);
            }
            return _myImage;
        }// end function

    }
}
