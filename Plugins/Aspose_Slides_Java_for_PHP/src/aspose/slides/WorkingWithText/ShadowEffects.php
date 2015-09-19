<?php
namespace Aspose\Slides\WorkingWithText;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\RectangleAlignment as RectangleAlignment;
use com\aspose\slides\SaveFormat as SaveFormat;
use java\awt\Color as Color;

class ShadowEffects{

    public static function run($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Add an AutoShape of Rectangle type
        $shapeType=new ShapeType();
        $shp = $slide->getShapes()->addAutoShape($shapeType->Rectangle, 150, 75, 150, 50);

        # Add TextFrame to the Rectangle
        $shp->addTextFrame("Aspose TextBox");

        # Disable shape fill in case we want to get shadow of text
        $fillType=new FillType();
        $shp->getFillFormat()->setFillType($fillType->NoFill);

        # Add outer shadow and set all necessary parameters
        $shp->getEffectFormat()->enableOuterShadowEffect();
        $shadow = $shp->getEffectFormat()->getOuterShadowEffect();
        $shadow->setBlurRadius(4.0);
        $shadow->setDirection(45);
        $shadow->setDistance(3);

        $rectangleAlignment=new RectangleAlignment();

        $color=new Color();

        $shadow->setRectangleAlign($rectangleAlignment->TopLeft);
        $shadow->getShadowColor()->setColor($color->black);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "OutShadow.pptx", $save_format->Pptx);

        print "Applied shadow effects on text, please check the output file.".PHP_EOL;
    }

}