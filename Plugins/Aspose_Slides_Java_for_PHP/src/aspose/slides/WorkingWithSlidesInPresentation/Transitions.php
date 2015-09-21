<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\TransitionType as TransitionType;


class Transitions {

    public static function run($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'demo.pptx');

        $transition_type = new TransitionType();

        # Apply circle type transition on slide 1
        $pres->getSlides()->get_Item(0)->getSlideShowTransition()->setType($transition_type->Circle);

        # Apply comb type transition on slide 2
        $pres->getSlides()->get_Item(1)->getSlideShowTransition()->setType($transition_type->Comb);

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "SimpleTransition.pptx", $save_format->Pptx);

        print "Done with simple transition, please check the output file." . PHP_EOL;

    }
}