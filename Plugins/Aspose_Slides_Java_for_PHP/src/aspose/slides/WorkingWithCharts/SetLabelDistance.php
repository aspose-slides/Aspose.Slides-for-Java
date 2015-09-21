<?php
namespace Aspose\Slides\WorkingWithCharts;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ChartType as ChartType;
use com\aspose\slides\SaveFormat as SaveFormat;

class SetLabelDistance{

    public static function run($dataDir = null){

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation();

        # Access first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Adding a chart on slide
        $chartType=new ChartType();
        $ch = $sld->getShapes()->addChart($chartType->ClusteredColumn, 20, 20, 500, 300);

        # Setting the position of label from axis
        $ch->getAxes()->getHorizontalAxis()->setLabelOffset(500);

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Position.pptx", $save_format->Pptx);

        print "Set label distance, please check the output file.".PHP_EOL;

    }
}