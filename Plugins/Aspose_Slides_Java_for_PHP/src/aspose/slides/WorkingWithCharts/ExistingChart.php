<?php

namespace Aspose\Slides\WorkingWithCharts;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\ChartType as ChartType;
use com\aspose\slides\LineDashStyle as LineDashStyle;
use com\aspose\slides\LineArrowheadLength as LineArrowheadLength;
use com\aspose\slides\LineArrowheadStyle as LineArrowheadStyle;
use com\aspose\slides\PresetColor as PresetColor;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\NullableBool as NullableBool;
use com\aspose\slides\MarkerStyleType as MarkerStyleType;
use java\awt\Color as Color;


class ExistingChart
{
    public static function run($dataDir = null)
    {
        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . "AsposeChart.pptx");

        # Access first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add chart with default data
        $chart = $sld->getShapes()->get_Item(0);

        # Setting the index of chart data sheet
        $defaultWorksheetIndex = 0;

        # Getting the chart data worksheet
        $fact = $chart->getChartData()->getChartDataWorkbook();

        # Changing chart Category Name
        $fact->getCell($defaultWorksheetIndex, 1, 0, "Modified Category 1");
        $fact->getCell($defaultWorksheetIndex, 2, 0, "Modified Category 2");


        # Take first chart series
        $series = $chart->getChartData()->getSeries()->get_Item(0);

        # Now updating series data
        $fact->getCell($defaultWorksheetIndex, 0, 1, "New_Series1"); # modifying series name
        $series->getDataPoints()->get_Item(0)->getValue()->setData(90);
        $series->getDataPoints()->get_Item(1)->getValue()->setData(123);
        $series->getDataPoints()->get_Item(2)->getValue()->setData(44);

        # Take Second chart series
        $series = $chart->getChartData()->getSeries()->get_Item(1);

        # Now updating series data
        $fact->getCell($defaultWorksheetIndex, 0, 2, "New_Series2"); #modifying series name
        $series->getDataPoints()->get_Item(0)->getValue()->setData(23);
        $series->getDataPoints()->get_Item(1)->getValue()->setData(67);
        $series->getDataPoints()->get_Item(2)->getValue()->setData(99);


        # Now, Adding a new series
        $chart->getChartData()->getSeries()->add($fact->getCell($defaultWorksheetIndex, 0, 3, "Series 3"), $chart->getType());

        # Take 3rd chart series
        $series = $chart->getChartData()->getSeries()->get_Item(2);

        # Now populating series data
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 1, 3, 20));
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 2, 3, 50));
        $series->getDataPoints()->addDataPointForBarSeries($fact->getCell($defaultWorksheetIndex, 3, 3, 30));

        $chartType=new ChartType();
        $chart->setType($chartType->ClusteredCylinder);


        # Saving the presentation to HTML format
        $save_format = new SaveFormat();
        $pres->save($dataDir . "AsposeChartModified.pptx", $save_format->Pptx);

        print "Updated chart, please check the output file.".PHP_EOL;

    }

}