package com.flashmouse.thumbGallery
{
    import flash.events.*;
    import flash.media.*;
    import flash.utils.*;

    public class Sounds extends Object
    {
        private var rollSound:Sound;
        private var base:Gallery;
        private var model:Model;

        public function Sounds(param1:Gallery, param2:Model)
        {
            this.model = param2;
            param2.addEventListener("THUMB_ROLL", thumbRoll);
            param2.addEventListener("THUMB_CLICK", thumbClick);
            this.base = param1;
            return;
        }// end function

        private function thumbRoll(event:Event) : void
        {
            var _myXml:Class = null;
            var _myImage:Object = null;
            if (base.soundThumbRoll && base.soundThumbRoll != "")
            {
                _myXml = getDefinitionByName(base.soundThumbRoll) as Class;
                _myImage = new _myXml;
                _myImage.play();
            }
            return;
        }// end function

        private function thumbClick(event:Event) : void
        {
            var ClassReference:Class;
            var e:* = event;
            if (base.soundThumbClick && base.soundThumbClick != "")
            {
                ClassReference = getDefinitionByName(base.soundThumbClick) as Class;
                try
                {
                    rollSound.close();
                }
                catch (e:Error)
                {
                }
                rollSound = new ClassReference;
                rollSound.play();
            }
            return;
        }// end function

    }
}
