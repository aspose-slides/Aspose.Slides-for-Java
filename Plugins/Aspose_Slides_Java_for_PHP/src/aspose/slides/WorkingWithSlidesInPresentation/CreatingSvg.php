<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use java\io\FileOutputStream as FileOutputStream;

class CreatingSvg {

    public static function run($dataDir=null)
    {
        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'demo.pptx');

        # Getting last slide index
        $last_slide_position = java_values($pres->getSlides()->size());

        #Iterating through every presentation slide and generating SVG image
        $i = 0;
        while ($i < $last_slide_position){

            # Accessing Slides
            $slide = $pres->getSlides()->get_Item($i);

            # Getting and saving the slide SVG image
            $slide->writeAsSvg(new FileOutputStream($dataDir . "SvgImage#{$i}.svg"));

            $i++;

        }

        print "Created SVG images, please check output files." . PHP_EOL;
    }
}