<?php

namespace Aspose\Slides\WorkingWithPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class Zoom {

    public static function run($dataDir=null)
    {
        # Create an instance of Presentation class
        $pres = new Presentation();

        # Setting View Properties of Presentation
        #pres.getViewProperties().getSlideViewProperties().setScale(50) # zoom value in percentages for slide view
        $pres->getViewProperties()->getNotesViewProperties()->setScale(50); # .Scale = 50; //zoom value in percentages for notes view

        # Save the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Zoom.pptx", $save_format->Pptx);

        print "Set zoom value, please check the output file.";
    }

}