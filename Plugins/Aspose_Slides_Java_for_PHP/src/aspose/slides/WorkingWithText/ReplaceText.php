<?php
namespace Aspose\Slides\WorkingWithText;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat;

class ReplaceText{

    public static function run($dataDir=null){
        # Create an instance of Presentation class
        $pres = new Presentation($dataDir . 'Welcome.pptx');

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Change the text of each placeholder
        $shp = $sld->getShapes()->get_Item(0);
        $shp->getTextFrame()->setText("This is Placeholder");

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Welcome_PH.pptx", $save_format->Pptx);

        print "Replaced text, please check the output file.".PHP_EOL;
    }


}