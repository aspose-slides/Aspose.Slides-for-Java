<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\SlideSizeType as SlideSizeType;
use com\aspose\slides\PdfOptions as PdfOptions;


class SizeAndLayout {

    public static function run($dataDir=null)
    {

        # Setting the Size and Type of a slide
        SizeAndLayout::set_size_and_type($dataDir);

        # Setting the page size when generating PDF
        SizeAndLayout::set_page_size_for_pdf($dataDir);

    }

    public static function set_size_and_type($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'demo.pptx');
        $aux_pres = new Presentation();

        $slide = $pres->getSlides()->get_Item(0);

        # Set the slide size of generated presentations to that of source
        $aux_pres->getSlideSize()->setType($pres->getSlideSize()->getType());
        $aux_pres->getSlideSize()->setSize($pres->getSlideSize()->getSize());

        # Clone required slide
        $aux_pres->getSlides()->addClone($pres->getSlides()->get_Item(0));
        $aux_pres->getSlides()->removeAt(0);

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Slide_Size_Type.pptx", $save_format->Pptx);

        print "Set slide size and type, please check the output file." . PHP_EOL;

    }

    public static function set_page_size_for_pdf($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation();

        # Set SlideSize.Type Property
        $slideSizeType = new SlideSizeType();
        $pres->getSlideSize()->setType($slideSizeType->A4Paper);

        # Set different properties of PDF Options
        $opts = new PdfOptions();
        $opts->setSufficientResolution(600);

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Export.pdf", $save_format->Pdf, $opts);

        print "Set page size for pdf, please check the output file." . PHP_EOL;

    }
}