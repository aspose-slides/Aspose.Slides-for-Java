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


class CreateChart {

    public static function run($dataDir=null)
    {
        # Creating Normal Charts
        CreateChart::create_normal_chart($dataDir);

        # Creating Scattered Chart with multiple series and different series markers
        CreateChart::create_scatter_chart($dataDir);
    }

    public static function create_normal_chart($dataDir=null){
        $pres = new Presentation();

        # Access first slide
        $sld = $pres->getSlides()->get_Item(0);

        $chartType=new ChartType();
        # Add chart with default data
        $chart = $sld->getShapes()->addChart($chartType->ClusteredColumn, 0, 0, 500, 500);

        $nullableBool=new NullableBool();

        # Setting chart Title
        # chart.ChartTitle.TextFrameForOverriding.Text = "Sample Title";
        $chart->getChartTitle()->addTextFrameForOverriding("Sample Title");
        $chart->getChartTitle()->getTextFrameForOverriding()->getTextFrameFormat()->setCenterText($nullableBool->True);
        $chart->getChartTitle()->setHeight (20);
        $chart->hasTitle(true);

        # Set first series to Show Values
        $chart->getChartData()->getSeries()->get_Item(0)->getLabels()->getDefaultDataLabelFormat()->setShowValue(true);

        # Setting the index of chart data sheet
        $defaultWorksheetIndex = 0;

        # Getting the chart data worksheet
        $fact = $chart->getChartData()->getChartDataWorkbook();

        # Delete default generated series and categories
        $chart->getChartData()->getSeries()->clear();
        $chart->getChartData()->getCategories()->clear();
        $s = $chart->getChartData()->getSeries()->size();
        $s = $chart->getChartData()->getCategories()->size();

        # Adding new series
        $chart->getChartData()->getSeries()->add($fact->getCell($defaultWorksheetIndex, 0, 1, "Series 1"), $chart->getType());
        $chart->getChartData()->getSeries()->add($fact->getCell($defaultWorksheetIndex, 0, 2, "Series 2"), $chart->getType());

        # Adding new categories
        $chart->getChartData()->getCategories()->add($fact->getCell($defaultWorksheetIndex, 1, 0, "Caetegoty 1"));
        $chart->getChartData()->getCategories()->add($fact->getCell($defaultWorksheetIndex, 2, 0, "Caetegoty 2"));
        $chart->getChartData()->getCategories()->add($fact->getCell($defaultWorksheetIndex, 3, 0, "Caetegoty 3"));

        # Take first chart series
        $series = $chart->getChartData()->getSeries()->get_Item(0);

        # Now populating series data
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 1, 1, 20));
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 2, 1, 50));
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 3, 1, 30));

        # Setting fill color for series
        $fillType=new FillType();
        $color=new Color();


        $series->getFormat()->getFill()->setFillType($fillType->Solid);
        $series->getFormat()->getFill()->getSolidFillColor()->setColor($color->RED);


        # Take second chart series
        $series = $chart->getChartData()->getSeries()->get_Item(1);

        # Now populating series data
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 1, 2, 30));
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 2, 2, 10));
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 3, 2, 60));

        # Setting fill color for series

        $fillType1=new FillType();
        $color1=new Color();

        $series->getFormat()->getFill()->setFillType($fillType1->Solid);
        $series->getFormat()->getFill()->getSolidFillColor()->setColor($color1->GREEN);

        # create custom labels for each of categories for new series
        # first label will be show Category name
        $lbl = $series->getDataPoints()->get_Item(0)->getLabel();
        $lbl->getDataLabelFormat()->setShowCategoryName(true);

        $lbl = $series->getDataPoints()->get_Item(1)->getLabel();
        $lbl->getDataLabelFormat()->setShowSeriesName(true);

        # Show value for third label
        $lbl = $series->getDataPoints()->get_Item(2)->getLabel();
        $lbl->getDataLabelFormat()->setShowValue(true);
        $lbl->getDataLabelFormat()->setShowSeriesName(true);
        $lbl->getDataLabelFormat()->setSeparator ("/");

        # Save presentation with chart
        $save_format = new SaveFormat();
        $pres->save($dataDir . "NormalChart.pptx", $save_format->Pptx);

        print "Created normal chart, please check the output file.".PHP_EOL;
    }

    public static function create_scatter_chart($dataDir=null){
        $pres = new Presentation();

        $slide = $pres->getSlides()->get_Item(0);

        $chartType=new ChartType();

        # Creating the default chart
        $chart = $slide->getShapes()->addChart($chartType->ScatterWithSmoothLines, 0, 0, 400, 400);

        # Getting the default chart data worksheet index
        $defaultWorksheetIndex = 0;

        # Getting the chart data worksheet
        $fact = $chart->getChartData()->getChartDataWorkbook();

        # Delete demo series
        $chart->getChartData()->getSeries()->clear();

        # Add new series
        $chart->getChartData()->getSeries()->add($fact->getCell($defaultWorksheetIndex, 1, 1, "Series 1"), $chart->getType());
        $chart->getChartData()->getSeries()->add($fact->getCell($defaultWorksheetIndex, 1, 3, "Series 2"), $chart->getType());

        # Take first chart series
        $series = $chart->getChartData()->getSeries()->get_Item(0);

        # Add new point (1:3) there.
        $series->getDataPoints()->addDataPointForScatterSeries($fact->getCell($defaultWorksheetIndex, 2, 1, 1), $fact->getCell($defaultWorksheetIndex, 2, 2, 3));

        # Add new point (2:10)
        $series->getDataPoints()->addDataPointForScatterSeries($fact->getCell($defaultWorksheetIndex, 3, 1, 2), $fact->getCell($defaultWorksheetIndex, 3, 2, 10));

        # Edit the type of series
        $chartType=new ChartType();
        $series->setType($chartType->ScatterWithStraightLinesAndMarkers);

        # Changing the chart series marker

        $markerStyleType=new MarkerStyleType();
        $series->getMarker()->setSize(10);
        $series->getMarker()->setSymbol($markerStyleType->Star);

        # Take second chart series
        $series = $chart->getChartData()->getSeries()->get_Item(1);

        # Add new point (5:2) there.
        $series->getDataPoints()->addDataPointForScatterSeries($fact->getCell($defaultWorksheetIndex, 2, 3, 5), $fact->getCell($defaultWorksheetIndex, 2, 4, 2));

        # Add new point (3:1)
        $series->getDataPoints()->addDataPointForScatterSeries($fact->getCell($defaultWorksheetIndex, 3, 3, 3), $fact->getCell($defaultWorksheetIndex, 3, 4, 1));

        # Add new point (2:2)
        $series->getDataPoints()->addDataPointForScatterSeries($fact->getCell($defaultWorksheetIndex, 4, 3, 2), $fact->getCell($defaultWorksheetIndex, 4, 4, 2));

        # Add new point (5:1)
        $series->getDataPoints()->addDataPointForScatterSeries($fact->getCell($defaultWorksheetIndex, 5, 3, 5), $fact->getCell($defaultWorksheetIndex, 5, 4, 1));

        # Changing the chart series marker

        $markerStyleType1=new MarkerStyleType();

        $series->getMarker()->setSize(10);
        $series->getMarker()->setSymbol($markerStyleType1->Circle);

        $save_format = new SaveFormat();
        $pres->save($dataDir . "AsposeScatterChart.pptx", $save_format->Pptx);

        print "Created scatter chart, please check the output file." .PHP_EOL;
    }

}