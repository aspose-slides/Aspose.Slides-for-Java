<?php
namespace Aspose\Slides\WorkingWithTables;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\TextAnchorType as TextAnchorType;
use com\aspose\slides\TextVerticalType as TextVerticalType;
use com\aspose\slides\SaveFormat as SaveFormat;
use java\awt\Color as Color;

class AlignText{

    public static function run($dataDir=null){

        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Define columns with widths and rows with heights
        $dbl_cols = [120, 120, 120, 120];
        $dbl_rows = [100, 100, 100, 100];

        # Add table shape to slide
        $tbl = $slide->getShapes()->addTable(100, 50, $dbl_cols, $dbl_rows);

        # Add text to the merged cell
        $tbl->getRows()->get_Item(0)->get_Item(1)->getTextFrame()->setText("10");
        $tbl->getRows()->get_Item(0)->get_Item(2)->getTextFrame()->setText("20");
        $tbl->getRows()->get_Item(0)->get_Item(3)->getTextFrame()->setText("30");

        # Accessing the text frame
        $txt_frame = $tbl->getRows()->get_Item(0)->get_Item(0)->getTextFrame();

        # Create the Paragraph object for text frame
        $para = $txt_frame->getParagraphs()->get_Item(0);

        # Create Portion object for paragraph

        $fillType=new FillType();
        $color=new Color();

        $portion = $para->getPortions()->get_Item(0);
        $portion->setText("Text here");
        $portion->getPortionFormat()->getFillFormat()->setFillType($fillType->Solid);
        $portion->getPortionFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLACK);

        # Aligning the text vertically
        $textVerticalType=new TextVerticalType();
        $cell = $tbl->getRows()->get_Item(0)->get_Item(0);
        $textAnchorType=new TextAnchorType();
        $cell->setTextAnchorType($textAnchorType->Center);
        $cell->setTextVerticalType($textVerticalType->Vertical270);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "AlignText.pptx", $save_format->Pptx);

        print "Aligned Text, please check the output file.".PHP_EOL;
    }
}

?>