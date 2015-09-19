<?php

namespace Aspose\Slides\WorkingWithPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\TiffOptions as TiffOptions;
use com\aspose\slides\TiffCompressionTypes as TiffCompressionTypes;
use java\awt\Dimension as Dimension;

class ConvertingToTiff {

    public static function run($dataDir=null)
    {
        # Converting Presentation to TIFF with default size
        ConvertingToTiff::convert_with_default_size($dataDir);

        # Converting Presentation to TIFF with custom size
        ConvertingToTiff::convert_with_custom_size($dataDir);
    }

    public static function convert_with_default_size($dataDir=null)
    {

        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Aspose.pptx");

        # Saving the PPTX presentation to Tiff format
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose.tiff", $save_format->Tiff);

        print "Document has been converted, please check the output file.";

    }

    public static function convert_with_custom_size($dataDir=null)
    {

        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Aspose.pptx");

        # Instantiate the TiffOptions class
        $opts = new TiffOptions();

        # Setting compression type
        $tiff_compression_types = new TiffCompressionTypes;
        $opts->setCompressionType ($tiff_compression_types->Default);

        # Compression Types
        #Default - Specifies the default compression scheme (LZW).
        #None - Specifies no compression.
        #CCITT3
        #CCITT4
        #LZW
        #RLE

        # Depth – depends on the compression type and cannot be set manually.
        # Resolution unit – is always equal to “2” (dots per inch)

        #Setting image DPI
        $opts->setDpiX(200);
        $opts->setDpiY(100);

        # Set Image Size
        $opts->setImageSize(new Dimension(1728, 1078));

        # Save the presentation to TIFF with specified image size
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose-Custom-Size.tiff", $save_format->Tiff,$opts);

        print "Document has been converted, please check the output file.";

    }
}