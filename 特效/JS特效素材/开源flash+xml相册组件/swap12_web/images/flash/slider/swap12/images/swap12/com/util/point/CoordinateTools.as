package com.util.point
{
    import flash.geom.*;

    public class CoordinateTools extends Object
    {

        public function CoordinateTools()
        {
            return;
        }// end function

        public static function localToLocal(param1, param2) : Point
        {
            var _myImage:Point = null;
            _myImage = new Point();
            _myImage = param1.localToGlobal(_myImage);
            _myImage = param2.globalToLocal(_myImage);
            return _myImage;
        }// end function

    }
}
