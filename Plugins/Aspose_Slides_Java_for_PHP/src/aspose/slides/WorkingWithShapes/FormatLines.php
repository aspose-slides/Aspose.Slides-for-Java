<?php

namespace Aspose\Slides\WorkingWithShapes;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\LineStyle as LineStyle;
use com\aspose\slides\LineDashStyle as LineDashStyle;
use com\aspose\slides\LineJoinStyle as LineJoinStyle;

use java\awt\Color as Color;


class FormatLines {

    public static function run($dataDir=null)
    {
        # Formatting the Lines of Shapes
        FormatLines::format_lines($dataDir);

        # Formatting the Join Styles
        FormatLines::format_join_styles($dataDir);

    }

    public static function format_lines($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add autoshape of rectangle type
        $shapeType = new ShapeType();
        $shp = $sld->getShapes()->addAutoShape($shapeType->Rectangle, 50, 150, 75, 150);

        # Set the fill color of the rectangle shape
        $fillType = new FillType();
        $color = new Color();
        $shp->getFillFormat()->setFillType($fillType->Solid);
        $shp->getFillFormat()->getSolidFillColor()->setColor($color->WHITE);

        # Apply some formatting on the line of the rectangle

        $lineStyle = new LineStyle();
        $shp->getLineFormat()->setStyle($lineStyle->ThickThin);
        $shp->getLineFormat()->setWidth(7);

        $lineDashStyle = new LineDashStyle();
        $shp->getLineFormat()->setDashStyle($lineDashStyle->Dash);

        # set the color of the line of rectangle
        $shp->getLineFormat()->getFillFormat()->setFillType($fillType->Solid);
        $shp->getLineFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLUE);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "RectShpLn.pptx", $save_format->Pptx);

        print "Formatted lines, please check the output file." . PHP_EOL;

    }

    public static function format_join_styles($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add three autoshapes of rectangle type
        $shape_type = new ShapeType();
        $shp1 = $sld->getShapes()->addAutoShape($shape_type->Rectangle, 50, 100, 150, 75);
        $shp2 = $sld->getShapes()->addAutoShape($shape_type->Rectangle, 300, 100, 150, 75);
        $shp3 = $sld->getShapes()->addAutoShape($shape_type->Rectangle, 50, 250, 150, 75);

        # Set the fill color of the rectangle shape
        $fill_type = new FillType();
        $color = new Color();
        $shp1->getFillFormat()->setFillType($fill_type->Solid);
        $shp1->getFillFormat()->getSolidFillColor()->setColor($color->BLACK);
        $shp2->getFillFormat()->setFillType($fill_type->Solid);
        $shp2->getFillFormat()->getSolidFillColor()->setColor($color->BLACK);
        $shp3->getFillFormat()->setFillType($fill_type->Solid);
        $shp3->getFillFormat()->getSolidFillColor()->setColor($color->BLACK);

        # Set the line width
        $shp1->getLineFormat()->setWidth(15);
        $shp2->getLineFormat()->setWidth(15);
        $shp3->getLineFormat()->setWidth (15);

        # Set the color of the line of rectangle
        $shp1->getLineFormat()->getFillFormat()->setFillType($fill_type->Solid);
        $shp1->getLineFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLUE);
        $shp2->getLineFormat()->getFillFormat()->setFillType($fill_type->Solid);
        $shp2->getLineFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLUE);
        $shp3->getLineFormat()->getFillFormat()->setFillType($fill_type->Solid);
        $shp3->getLineFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLUE);

        # Set the Join Style
        $line_join_style = new LineJoinStyle();
        $shp1->getLineFormat()->setJoinStyle($line_join_style->Miter);
        $shp2->getLineFormat()->setJoinStyle($line_join_style->Bevel);
        $shp3->getLineFormat()->setJoinStyle($line_join_style->Round);

        # Add text to each rectangle
        $shp1->getTextFrame()->setText ("This is Miter Join Style");
        $shp2->getTextFrame()->setText( "This is Bevel Join Style");
        $shp3->getTextFrame()->setText ("This is Round Join Style");

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "RectShpLnJoin.pptx", $save_format->Pptx);

        print "Formatted join styles, please check the output file." . PHP_EOL;

    }

}