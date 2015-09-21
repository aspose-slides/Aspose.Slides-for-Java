<?php

namespace Aspose\Slides\IntroductionToPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\SaveFormat as SaveFormat;
use java\awt\Color as Color;

class HelloWorld {

    public static function run($dataDir=null)
    {

        # Instantiate Presentation
        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Add an AutoShape of Rectangle type
        $shape_type = new ShapeType();
        $ashp = $slide->getShapes()->addAutoShape($shape_type->Rectangle, 150, 75, 150, 50);

        # Add ITextFrame to the Rectangle
        $ashp->addTextFrame("Hello World");

        # Change the text color to Black (which is White by default)
        $fill_type = new FillType();
        $color = new Color();
        $ashp->getTextFrame()->getParagraphs()->get_Item(0)->getPortions()->get_Item(0)->getPortionFormat()->getFillFormat()->setFillType($fill_type->Solid);
        $ashp->getTextFrame()->getParagraphs()->get_Item(0)->getPortions()->get_Item(0)->getPortionFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLACK);

        # Change the line color of the rectangle to White
        $ashp->getShapeStyle()->getLineColor()->setColor($color->WHITE);

        # Remove any fill formatting in the shape
        $ashp->getFillFormat()->setFillType ($fill_type->NoFill);

        # Save the presentation to disk
        $save_format = new SaveFormat();
        $pres->save($dataDir . "HelloWorld.pptx", $save_format->Pptx);

        print "Document has been saved, please check the output file.";

    }

}