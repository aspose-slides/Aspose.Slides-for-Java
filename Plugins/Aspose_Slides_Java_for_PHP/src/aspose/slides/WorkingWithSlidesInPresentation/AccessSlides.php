<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class AccessSlides {

    public static function run($dataDir=null)
    {

        # Using Slides Collection to Access Slide by Index
        AccessSlides::get_slide_by_index($dataDir);

        # Using Slides Collection to Access Slide by ID
        AccessSlides::get_slide_by_id($dataDir);
    }

    public static function get_slide_by_index($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'Aspose.pptx');

        # Accessing a slide using its slide index
        $slide = $pres->getSlides()->get_Item(0);

        print "Slide: " . $slide . PHP_EOL;

    }

    public static function get_slide_by_id($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'Aspose.pptx');

        # Getting Slide ID
        $id = $pres->getSlides()->get_Item(0)->getSlideId();

        # Accessing Slide by ID
        $slide = $pres->getSlideById($id);

        print "Slide: " . $slide . PHP_EOL;

    }

}