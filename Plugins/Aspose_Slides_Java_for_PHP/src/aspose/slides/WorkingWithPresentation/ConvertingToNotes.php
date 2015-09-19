<?php

namespace Aspose\Slides\WorkingWithPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class ConvertingToNotes {

    public static function run($dataDir=null)
    {

        # Converting Presentation to TIFF Notes
        ConvertingToNotes::convert_to_tiff_notes($dataDir);

        # Converting Presentation to TIFF Notes
        ConvertingToNotes::convert_to_pdf_notes($dataDir);

    }

    public static function convert_to_tiff_notes($dataDir=null)
    {

        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Aspose.pptx");

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Notes.tiff", $save_format->TiffNotes);

        print "Document has been converted, please check the output file.";

    }

    public static function convert_to_pdf_notes($dataDir=null)
    {

        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Aspose.pptx");

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Notes.pdf", $save_format->pdf);

        print "Document has been converted, please check the output file.";

    }

}