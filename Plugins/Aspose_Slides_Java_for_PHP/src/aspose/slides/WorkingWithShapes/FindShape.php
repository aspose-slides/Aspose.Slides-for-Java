<?php

namespace Aspose\Slides\WorkingWithShapes;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class FindShape {

    public static function run($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation($dataDir . 'demo.pptx');

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        $shape = FindShape::find_shape($slide, "Shape1");

        print "Shape: " . $shape . PHP_EOL;
    }

    public static function find_shape($slide, $alttext)
    {

        #Iterating through all shapes inside the slide

        $i = 0;
        $slide_size = java_values($slide->getShapes()->size());

        while ($i < $slide_size) {
            # If the alternative text of the slide matches with the required one then return the shape
            if ($slide->getShapes()->get_Item($i)->getAlternativeText() == $alttext) {
                return $slide->getShapes()->get_Item($i);
            }
            $i++;
        }
        return nil;

    }

}