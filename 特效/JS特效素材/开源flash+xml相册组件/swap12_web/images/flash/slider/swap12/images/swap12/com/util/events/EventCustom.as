package com.util.events
{
    import flash.events.*;

    public class EventCustom extends Event
    {
        public var ob:Object;
        public static const CHANGE:String = "change";

        public function EventCustom(param1:String, param2:Boolean = false, param3:Boolean = false, param4 = null)
        {
            super(param1, param2, param3);
            this.ob = param4;
            return;
        }// end function

        override public function toString() : String
        {
            return formatToString("EventCustom", "type", "bubbles", "cancelable", "eventPhase", "ob");
        }// end function

        override public function clone() : Event
        {
            return new EventCustom(type, bubbles, cancelable, ob);
        }// end function

    }
}
