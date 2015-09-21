<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class RemoveSlides {

    public static function run($dataDir=null)
    {

        # Using Slides Collection to Remove Slide by Index
        RemoveSlides::remove_slide_by_index($dataDir);

        # Using Slides Collection to Remove Slide by ID
        RemoveSlides::remove_slide_by_id($dataDir);

    }

    public static function remove_slide_by_index($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'Aspose.pptx');

        # Accessing a slide using its slide index
        $slide = $pres->getSlides()->get_Item(0);

        # Removing a slide using its reference
        $pres->getSlides()->remove($slide);

        # Saving the presentation file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Modified.pptx", $save_format->Pptx);

        print "Removed slide by Index, please check the output file." . PHP_EOL;

    }

    public static function remove_slide_by_id($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'Aspose.pptx');

        # Removing a slide using its slide index
        $pres->getSlides()->removeAt(1);

        # Saving the presentation file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Modified.pptx", $save_format->Pptx);

        print "Removed slide by ID, please check the output file." . PHP_EOL;


    }

}