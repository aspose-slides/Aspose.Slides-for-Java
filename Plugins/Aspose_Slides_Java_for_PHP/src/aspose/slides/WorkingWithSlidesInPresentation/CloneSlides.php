<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class CloneSlides {

    public static function run($dataDir=null)
    {

        # Within the Same Presentation from One Position to the End
        CloneSlides::clone_to_end_of_presentation($dataDir);

        # From One Position to Anther within the Same Presentation
        CloneSlides::clone_to_aonther_position($dataDir);

        # In Another Presentation at the End of the Existing Slides
        CloneSlides::clone_to_other_presentation_at_end_of_existing_slide($dataDir);

    }

    public static function clone_to_end_of_presentation($dataDir=null)
    {
        # Instantiate Presentation class that represents the presentation file

        $pres = new Presentation($dataDir . 'Aspose.pptx');

        # Clone the desired slide to the end of the collection of slides in the same presentation
        $slides = $pres->getSlides();
        $slides->addClone($pres->getSlides()->get_Item(0));

        # Saving the presentation file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose_Cloned.pptx", $save_format->Pptx);

        print "Slide has been cloned, please check the output file." . PHP_EOL;

    }

    public static function clone_to_aonther_position($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'Aspose.pptx');

        # Clone the desired slide to the end of the collection of slides in the same presentation
        $slides = $pres->getSlides();

        # Clone the desired slide to the specified index in the same presentation
        $slides->insertClone(2, $pres->getSlides()->get_Item(1));

        # Saving the presentation file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose_Cloned.pptx", $save_format->Pptx);

        print "Slide has been cloned, please check the output file." . PHP_EOL;

    }

    public static function clone_to_other_presentation_at_end_of_existing_slide($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $src_pres = new Presentation($dataDir . 'Aspose.pptx');

        # Instantiate Presentation class for destination PPTX (where slide is to be cloned)
        $dest_pres = new Presentation();

        # Clone the desired slide from the source presentation to the end of the collection of slides in destination presentation
        $slds = $dest_pres->getSlides();

        $slds->addClone($src_pres->getSlides()->get_Item(0));

        # Saving the presentation file
        $save_format = new SaveFormat();
        $dest_pres->save($dataDir . "Aspose_dest2.pptx", $save_format->Pptx);

        print "Slide has been cloned, please check the output file." . PHP_EOL;

    }

}