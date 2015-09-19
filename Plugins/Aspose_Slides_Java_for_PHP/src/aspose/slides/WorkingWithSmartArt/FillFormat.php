<?php
namespace Aspose\Slides\WorkingWithSmartArt;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SmartArtLayoutType as SmartArtLayoutType;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\SaveFormat as SaveFormat;
use java\awt\Color as Color;

class FillFormat{

    public static function run($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Adding SmartArt shape and nodes
        $smartArtLayoutType=new SmartArtLayoutType();
        $chevron = $slide->getShapes()->addSmartArt(10, 10, 800, 60, $smartArtLayoutType->ClosedChevronProcess);
        $node = $chevron->getAllNodes()->addNode();
        $node->getTextFrame()->setText("Some text");

        # Setting node fill color
        $color=new Color();
        $fillType=new FillType();
        $item = $node->getShapes()->get_Item(0);
        $item->getFillFormat()->setFillType($fillType->Solid);
        $item->getFillFormat()->getSolidFillColor()->setColor($color->RED);

        # Write the presentation as a PPTX file
        $saveFormat=new SaveFormat();
        $pres->save($dataDir . "FillFormat.pptx", $saveFormat->Pptx);

        print "Set fill format for smartart node, please check the output file.".PHP_EOL;
    }

}