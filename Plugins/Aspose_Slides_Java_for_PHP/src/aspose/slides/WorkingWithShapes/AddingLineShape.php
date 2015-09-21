<?php

namespace Aspose\Slides\WorkingWithShapes;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\LineStyle as LineStyle;
use com\aspose\slides\LineDashStyle as LineDashStyle;
use com\aspose\slides\LineArrowheadLength as LineArrowheadLength;
use com\aspose\slides\LineArrowheadStyle as LineArrowheadStyle;
use com\aspose\slides\PresetColor as PresetColor;
use com\aspose\slides\FillType as FillType;
use java\awt\Color as Color;


class AddingLineShape {

    public static function run($dataDir=null)
    {

        # Adding Plain Line to Slide
        AddingLineShape::add_plain_line($dataDir);

        # Adding Arrow Shaped Line to Slide
        AddingLineShape::add_arrow_line($dataDir);

    }

    public static function add_plain_line($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add an autoshape of type line
        $shapeType = new ShapeType();
        $sld->getShapes()->addAutoShape($shapeType->Line, 50, 150, 300, 0);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "LineShape.pptx", $save_format->Pptx);

        print "Added plain line to slide, please check the output file." . PHP_EOL;

    }

    public static function add_arrow_line($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add an autoshape of type line
        $shapeType = new ShapeType();
        $shp = $sld->getShapes()->addAutoShape($shapeType->Line, 50, 150, 300, 0);

        # Apply some formatting on the line
        $lineStyle = new LineStyle();
        $shp->getLineFormat()->setStyle($lineStyle->ThickBetweenThin);
        $shp->getLineFormat()->setWidth(10);

        $lineDashStyle = new LineDashStyle();
        $shp->getLineFormat()->setDashStyle($lineDashStyle->DashDot);

        $lineArrowheadLength = new LineArrowheadLength();
        $lineArrowheadStyle = new LineArrowheadStyle();
        $fillType = new FillType();
        $color = new Color();
        $presetColor = new PresetColor();

        $shp->getLineFormat()->setBeginArrowheadLength($lineArrowheadLength->Short);
        $shp->getLineFormat()->setBeginArrowheadStyle($lineArrowheadStyle->Oval);

        $shp->getLineFormat()->setEndArrowheadLength($lineArrowheadLength->Long);
        $shp->getLineFormat()->setEndArrowheadStyle($lineArrowheadStyle->Triangle);

        $shp->getLineFormat()->getFillFormat()->setFillType($fillType->Solid);
        $shp->getLineFormat()->getFillFormat()->getSolidFillColor()->setColor(new Color($presetColor->Maroon));


        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "ArrowShape.pptx", $save_format->Pptx);

        print "Added arrow shape line to slide, please check the output file." . PHP_EOL;

    }

}