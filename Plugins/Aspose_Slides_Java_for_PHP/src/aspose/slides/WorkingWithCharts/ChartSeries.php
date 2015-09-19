<?php
namespace Aspose\Slides\WorkingWithCharts;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ChartType as ChartType;
use com\aspose\slides\SaveFormat as SaveFormat;

class ChartSeries{

    public static function run($dataDir = null){
        # Adding Chart Series Overlap for Charts
        ChartSeries::add_overlap_for_chart($dataDir);
    }

    public static function add_overlap_for_chart($dataDir=null)
    {
        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation();

        # Adding chart
        $chartType = new ChartType();

        $chart = $pres->getSlides()->get_Item(0)->getShapes()->addChart($chartType->ClusteredColumn, 50, 50, 600, 400, true);

        $series = $chart->getChartData()->getSeries();
        if ($series->get_Item(0)->getOverlap() == 0) {
        # Setting series overlap
            $series -> get_Item(0) -> getParentSeriesGroup()->setOverlap(-30);
        }

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Overlap.pptx", $save_format->Pptx);

        print "Added chart series overlap for charts, please check the output file.".PHP_EOL;
    }

}