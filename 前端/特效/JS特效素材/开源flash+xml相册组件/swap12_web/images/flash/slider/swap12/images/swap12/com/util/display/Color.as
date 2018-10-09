package com.util.display
{
    import flash.display.*;
    import flash.geom.*;

    public class Color extends Object
    {

        public function Color()
        {
            return;
        }// end function

        public static function setColor(param1:DisplayObject, param2:Number) : void
        {
            var _myImage:ColorTransform = null;
            _myImage = param1.transform.colorTransform;
            _myImage.color = param2;
            param1.transform.colorTransform = _myImage;
            return;
        }// end function

        public static function hsv2hex(param1:Number, param2:Number, param3:Number) : Number
        {
            var _myImage_small:Object = null;
            _myImage_small = Color.hsv2rgb(param1, param2, param3);
            return Color.rgb2hex(_myImage_small.r, _myImage_small.g, _myImage_small.b);
        }// end function

        public static function hex2hsv(param1:Number) : Object
        {
            var _myXml:Object = null;
            _myXml = Color.hex2rgb(param1);
            return Color.rgb2hsv(_myXml.r, _myXml.g, _myXml.b);
        }// end function

        public static function hsv2rgb(param1:Number, param2:Number, param3:Number) : Object
        {
            var _myImage_small:* = undefined;
            var _myImage_small_bg:* = undefined;
            var _myImage_mc:* = undefined;
            var _myImage_small_mc:* = undefined;
            var _myImage_small_cor:* = undefined;
            var _myImage_small_cor_bg:* = undefined;
            var _Position0:* = undefined;
            var _Position1:* = undefined;
            param1 = param1 % 360;
            if (param3 == 0)
            {
                return {r:0, g:0, b:0};
            }
            param2 = param2 / 100;
            param3 = param3 / 100;
            param1 = param1 / 60;
            _myImage_small_mc = Math.floor(param1);
            _myImage_small_cor = param1 - _myImage_small_mc;
            _myImage_small_cor_bg = param3 * (1 - param2);
            _Position0 = param3 * (1 - param2 * _myImage_small_cor);
            _Position1 = param3 * (1 - param2 * (1 - _myImage_small_cor));
            if (_myImage_small_mc == 0)
            {
                _myImage_small = param3;
                _myImage_small_bg = _Position1;
                _myImage_mc = _myImage_small_cor_bg;
            }
            else if (_myImage_small_mc == 1)
            {
                _myImage_small = _Position0;
                _myImage_small_bg = param3;
                _myImage_mc = _myImage_small_cor_bg;
            }
            else if (_myImage_small_mc == 2)
            {
                _myImage_small = _myImage_small_cor_bg;
                _myImage_small_bg = param3;
                _myImage_mc = _Position1;
            }
            else if (_myImage_small_mc == 3)
            {
                _myImage_small = _myImage_small_cor_bg;
                _myImage_small_bg = _Position0;
                _myImage_mc = param3;
            }
            else if (_myImage_small_mc == 4)
            {
                _myImage_small = _Position1;
                _myImage_small_bg = _myImage_small_cor_bg;
                _myImage_mc = param3;
            }
            else if (_myImage_small_mc == 5)
            {
                _myImage_small = param3;
                _myImage_small_bg = _myImage_small_cor_bg;
                _myImage_mc = _Position0;
            }
            _myImage_small = Math.floor(_myImage_small * 255);
            _myImage_small_bg = Math.floor(_myImage_small_bg * 255);
            _myImage_mc = Math.floor(_myImage_mc * 255);
            return {r:_myImage_small, g:_myImage_small_bg, b:_myImage_mc};
        }// end function

        public static function hex2rgb(param1:Number) : Object
        {
            var _myXml:Number = NaN;
            var _myImage:Number = NaN;
            var _myImage_small:Number = NaN;
            var _myImage_small_bg:Number = NaN;
            _myXml = param1 >> 16;
            _myImage = param1 - (_myXml << 16);
            _myImage_small = _myImage >> 8;
            _myImage_small_bg = _myImage - (_myImage_small << 8);
            return {r:_myXml, g:_myImage_small, b:_myImage_small_bg};
        }// end function

        public static function resetColor(param1:DisplayObject) : void
        {
            var _myXml:* = undefined;
            _myXml = new ColorTransform(1, 1, 1, 1, 0, 0, 0, 0);
            param1.transform.colorTransform = _myXml;
            return;
        }// end function

        public static function rgb2hex(param1:Number, param2:Number, param3:Number) : Number
        {
            return param1 << 16 | param2 << 8 | param3;
        }// end function

        public static function rgb2hsv(param1:Number, param2:Number, param3:Number) : Object
        {
            var _myImage_small:* = undefined;
            var _myImage_small_bg:* = undefined;
            var _myImage_mc:* = undefined;
            var _myImage_small_mc:* = undefined;
            var _myImage_small_cor:* = undefined;
            var _myImage_small_cor_bg:* = undefined;
            param1 = param1 / 255;
            param2 = param2 / 255;
            param3 = param3 / 255;
            _myImage_small = Math.min(Math.min(param1, param2), param3);
            _myImage_small_bg = Math.max(Math.max(param1, param2), param3);
            if (_myImage_small == _myImage_small_bg)
            {
                return {h:0, s:0, v:_myImage_small_bg * 100};
            }
            _myImage_mc = param1 == _myImage_small ? (param2 - param3) : (param2 == _myImage_small ? (param3 - param1) : (param1 - param2));
            _myImage_small_mc = param1 == _myImage_small ? (3) : (param2 == _myImage_small ? (5) : (1));
            _myImage_small_cor = Math.floor((_myImage_small_mc - _myImage_mc / (_myImage_small_bg - _myImage_small)) * 60) % 360;
            _myImage_small_cor_bg = Math.floor((_myImage_small_bg - _myImage_small) / _myImage_small_bg * 100);
            _myImage_small_bg = Math.floor(_myImage_small_bg * 100);
            return {h:_myImage_small_cor, s:_myImage_small_cor_bg, v:_myImage_small_bg};
        }// end function

    }
}
