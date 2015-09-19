<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class AddSlides {

    public static function run($dataDir=null)
    {
        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation();

        # Instantiate SlideCollection calss
        $slides = $pres->getSlides();

        $i = 0;
        while ($i < $pres->getLayoutSlides()->size()) {

            # Add an empty slide to the Slides collection
            $slides->addEmptySlide($pres->getLayoutSlides()->get_Item($i));
            $i+=1;

        }

        #Do some work on the newly added slide

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "EmptySlide.pptx", $save_format->Pptx);

        print "Document has been created, please check the output file.";
    }

}