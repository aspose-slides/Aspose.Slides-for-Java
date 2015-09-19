<?php
namespace Aspose\Slides\WorkingWithText;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\ColorType as ColorType;
use com\aspose\slides\SchemeColor as SchemeColor;
use com\aspose\slides\SaveFormat as SaveFormat;

class WordArt{

    public static function run($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Add an AutoShape of Rectangle type
        $shapeType=new ShapeType();
        $fillType=new FillType();
        $ashp = $slide->getShapes()->addAutoShape($shapeType->Rectangle, 150, 75, 400, 300);
        $ashp->getFillFormat()->setFillType($fillType->NoFill);

        # Add TextFrame to the Rectangle
        $ashp->addTextFrame("Aspose TextBox");
        $port = $ashp->getTextFrame()->getParagraphs()->get_Item(0)->getPortions()->get_Item(0);
        $pf = $port->getPortionFormat();
        $pf->setFontHeight(50);

        # Enable InnerShadowEffect
        $ef = $pf->getEffectFormat();
        $ef->enableInnerShadowEffect();

        # Set all necessary parameters
        $ef->getInnerShadowEffect()->setBlurRadius(8.0);
        $ef->getInnerShadowEffect()->setDirection(90);
        $ef->getInnerShadowEffect()->setDistance(6.0);
        $ef->getInnerShadowEffect()->getShadowColor()->setB(189);

        # Set ColorType as Scheme
        $colorType=new ColorType();
        $ef->getInnerShadowEffect()->getShadowColor()->setColorType($colorType->Scheme);

        # Set Scheme Color
        $schemeColor=new SchemeColor();
        $ef->getInnerShadowEffect()->getShadowColor()->setSchemeColor($schemeColor->Accent1);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "WordArt.pptx", $save_format->Pptx);

        print "Done with word art, please check the output file.".PHP_EOL;
    }

}