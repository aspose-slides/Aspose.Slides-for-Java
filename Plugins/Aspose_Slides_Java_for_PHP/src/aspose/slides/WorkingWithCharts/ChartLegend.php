<?php

namespace Aspose\Slides\WorkingWithCharts;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\ChartType as ChartType;
use com\aspose\slides\LineDashStyle as LineDashStyle;
use com\aspose\slides\LineArrowheadLength as LineArrowheadLength;
use com\aspose\slides\LineArrowheadStyle as LineArrowheadStyle;
use com\aspose\slides\PresetColor as PresetColor;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\NullableBool as NullableBool;
use com\aspose\slides\MarkerStyleType as MarkerStyleType;
use java\awt\Color as Color;


class ChartLegend
{

    public static function run($dataDir = null)
    {
        # Setting Custom Location and Size for Chart legend
        ChartLegend::set_location_and_size($dataDir);

    }

    public static function set_location_and_size($dataDir=null){

        # Creating empty presentation
        $pres = new Presentation();

        # Get reference of the slide
        $slide = $pres->getSlides()->get_Item(0);

        # Add a clustered column chart on the slide

        $chartType=new ChartType();

        $chart = $slide->getShapes()->addChart($chartType->ClusteredColumn, 50, 50, 500, 500);

        # Set Legend Properties
        $chart->getLegend()->setX(50 / $chart->getWidth());
        $chart->getLegend()->setY (50 / $chart->getHeight());
        $chart->getLegend()->setWidth(100 / $chart->getWidth());
        $chart->getLegend()->setHeight(100 / $chart->getHeight());

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Legend.pptx", $save_format->Pptx);

        print "Set custom location and size of chart legend, please check the output file.".PHP_EOL;
    }
}