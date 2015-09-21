<?php
namespace Aspose\Slides\WorkingWithTables;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;

Class RemoveRowColumn{

    public static function run($dataDir= null){

        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        $col_width = [100, 50, 30];
        $row_height = [30, 50, 30];

        $table = $slide->getShapes()->addTable(100, 100, $col_width, $row_height);

        $table->getRows()->removeAt(1, false);
        $table->getColumns()->removeAt(1, false);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "RemoveRowColumn.pptx", $save_format->Pptx);

        print "Removed Row & Column from table, please check the output file.".PHP_EOL;
    }
}
?>