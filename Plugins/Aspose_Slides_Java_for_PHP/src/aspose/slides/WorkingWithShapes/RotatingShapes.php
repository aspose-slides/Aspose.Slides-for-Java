<?php

namespace Aspose\Slides\WorkingWithShapes;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\ShapeType as ShapeType;

class RotatingShapes {

    public static function run($dataDir=null)
    {
        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add autoshape of rectangle type
        $shapeType = new ShapeType();
        $shp = $sld->getShapes()->addAutoShape($shapeType->Rectangle, 50, 150, 75, 150);

        # Rotate the shape to 90 degree
        $shp->setRotation(90);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "RectShpRot.pptx", $save_format->Pptx);

        print "Rotated shape, please check the output file." . PHP_EOL;
    }

}