<?php

namespace Aspose\Slides\WorkingWithPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\XpsOptions as XpsOptions;

class ConvertingToXps {

    public static function run($dataDir=null)
    {
        # Converting Presentation to TIFF with default size
        ConvertingToXps::convert_with_default_size($dataDir);

        # Converting Presentation to TIFF with custom size
        ConvertingToXps::convert_with_custom_size($dataDir);
    }

    public static function convert_with_default_size($dataDir=null)
    {

        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Aspose.pptx");

        # Saving the presentation to XPS format
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose.xps", $save_format->Xps);

        print "Document has been converted, please check the output file.";

    }

    public static function convert_with_custom_size($dataDir=null)
    {

        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Aspose.pptx");

        # Instantiate the TiffOptions class
        $opts = new XpsOptions();

        # Save MetaFiles as PNG
        $opts->SaveMetafilesAsPng = true;

        # Save the presentation to TIFF with specified image size
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose-Custom-Size.xps", $save_format->Xps, $opts);

        print "Document has been converted, please check the output file.";

    }

}