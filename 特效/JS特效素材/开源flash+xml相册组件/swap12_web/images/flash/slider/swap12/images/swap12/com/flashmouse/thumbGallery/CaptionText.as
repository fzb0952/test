package com.flashmouse.thumbGallery
{
    import flash.events.*;

    public class CaptionText extends Object
    {
        private var main:Gallery;
        private var model:Model;

        public function CaptionText(param1:Gallery, param2:Model)
        {
            this.model = param2;
            this.main = param1;
            param2.addEventListener(Event.CHANGE, update);
            return;
        }// end function

        private function update(event:Event) : void
        {
            var caption:String;
            var str:*;
            var arr:*;
            var leng:*;
            var tField:*;
            var e:* = event;
            caption = model.itemArr[model.curNum].caption;
            str = main.captionTextField;
            if (str != "")
            {
                arr = str.split(".");
                leng = arr.length;
                if (leng == 1)
                {
                    tField = main.parent[str];
                }
                if (leng == 2)
                {
                    tField = main.parent[arr[0]][arr[1]];
                }
                if (leng == 3)
                {
                    tField = main.parent[arr[0]][arr[1]][arr[2]];
                }
                if (leng == 4)
                {
                    tField = main.parent[arr[0]][arr[1]][arr[2]][arr[3]];
                }
                try
                {
                    tField.htmlText = caption;
                }
                catch (e:Event)
                {
                }
            }
            return;
        }// end function

    }
}
