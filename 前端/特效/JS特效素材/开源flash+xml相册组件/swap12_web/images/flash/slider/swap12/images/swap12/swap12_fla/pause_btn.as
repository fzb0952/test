package swap12_fla
{
    import flash.display.*;

    dynamic public class pause_btn extends MovieClip
    {
        public var outline:MovieClip;

        public function pause_btn()
        {
            addFrameScript(0, frame1);
            return;
        }// end function

        function frame1()
        {
            stop();
            return;
        }// end function

    }
}
