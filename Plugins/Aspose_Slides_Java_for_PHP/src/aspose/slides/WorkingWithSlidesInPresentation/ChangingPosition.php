<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class ChangingPosition {

    public static function run($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'Aspose.pptx');

        # Get the slide whose position is to be changed
        $slide = $pres->getSlides()->get_Item(0);

        # Set the new position for the slide
        $slide->setSlideNumber(2);

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose_Position.pptx", $save_format->Pptx);

        print "Changes slide position, please check the output file." . PHP_EOL;

    }


}