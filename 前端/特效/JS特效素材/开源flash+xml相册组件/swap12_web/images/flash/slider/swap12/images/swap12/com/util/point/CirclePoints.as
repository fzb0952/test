package com.util.point
{

    public class CirclePoints extends Object
    {
        private static var angle:Number = 0;
        private static var pointArray:Array;
        private static var count:Number;

        public function CirclePoints()
        {
            return;
        }// end function

        public static function degToRad(param1)
        {
            return param1 * (Math.PI / 180);
        }// end function

        public static function getPointsOnCircle(param1:Number, param2:Number) : Array
        {
            var _myImage:* = undefined;
            var _myImage_small:uint = 0;
            var _myImage_small_bg:* = undefined;
            var _myImage_mc:* = undefined;
            pointArray = [];
            _myImage = 360 / param1;
            count = 0;
            _myImage_small = 0;
            while (_myImage_small < param1)
            {
                
                _myImage_small_bg = Math.cos(degToRad(angle)) * param2;
                _myImage_mc = Math.sin(degToRad(angle)) * param2;
                angle = angle + _myImage;
                pointArray.push({x:_myImage_small_bg, y:_myImage_mc});
                _myImage_small = _myImage_small + 1;
            }
            return pointArray;
        }// end function

    }
}
