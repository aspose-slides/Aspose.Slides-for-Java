<?php

namespace Aspose\Slides\WorkingWithPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

class PptToPptx {

    public static function run($dataDir=null)
    {
        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Presentation1.ppt");

        # Saving the PPTX presentation to PPTX format
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose.pptx", $save_format->Pptx);

        print "Document has been converted, please check the output file.";
    }

}