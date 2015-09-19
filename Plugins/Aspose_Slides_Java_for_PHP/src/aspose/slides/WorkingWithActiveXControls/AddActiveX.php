<?php
namespace Aspose\Slides\WorkingWithActiveXControls;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ControlType as ControlType;
use com\aspose\slides\SaveFormat as SaveFormat;

class AddActiveX{

    public static function run($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Adding the Media Player ActiveX control
        $controlType = new ControlType();
        $pres->getSlides()->get_Item(0)->getControls()->addControl($controlType->WindowsMediaPlayer, 100, 100, 400, 400);

        # Access the Media Player ActiveX control and set the video path
        $pres->getSlides()->get_Item(0)->getControls()->get_Item(0)->getProperties()->set_Item("URL" ,  $dataDir . "Wildlife.mp4");

        # Write the presentation as a PPTX file
        $saveFormat = new SaveFormat();
        $pres->save($dataDir . "AddActiveX.pptx", $saveFormat->Pptx);

        print "Added ActiveX control, please check the output file.".PHP_EOL;
    }

}