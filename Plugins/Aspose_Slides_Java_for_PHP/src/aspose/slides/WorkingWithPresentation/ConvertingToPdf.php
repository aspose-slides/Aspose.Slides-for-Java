<?php

namespace Aspose\Slides\WorkingWithPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class ConvertingToPdf {

    public static function run($dataDir=null)
    {
        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Aspose.pptx");

        # Saving the PPTX presentation to Pdf format
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose.pdf", $save_format->Pdf);

        print "Document has been converted, please check the output file.";
    }

}