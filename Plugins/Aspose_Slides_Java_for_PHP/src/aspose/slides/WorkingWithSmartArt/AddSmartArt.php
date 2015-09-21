<?php
namespace Aspose\Slides\WorkingWithSmartArt;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SmartArtLayoutType as SmartArtLayoutType;
use com\aspose\slides\SaveFormat as SaveFormat;

class AddSmartArt{

    public static function run($dataDir=null){

        AddSmartArt::create_smartart_shape($dataDir);
    }

    public static function create_smartart_shape($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Add Smart Art Shape
        $smartArtLayoutType=new SmartArtLayoutType();
        $smart = $slide->getShapes()->addSmartArt(0, 0, 400, 400, $smartArtLayoutType->BasicBlockList);

        # Write the presentation as a PPTX file
        $saveFormat=new SaveFormat();
        $pres->save($dataDir . "SimpleSmartArt.pptx", $saveFormat->Pptx);

        print "Created smartart shape, please check the output file.".PHP_EOL;
    }
}