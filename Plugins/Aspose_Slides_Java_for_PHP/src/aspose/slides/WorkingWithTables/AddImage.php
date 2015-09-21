<?php
namespace Aspose\Slides\WorkingWithTables;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\PictureFillMode as PictureFillMode;
use com\aspose\slides\SaveFormat as SaveFormat;
use javax\imageio\ImageIO as ImageIO;
use java\io\File as File;

class AddImage{
    public static function run($dataDir=null){

        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Define co lumns with widths and rows with heights
        $dbl_cols = [150,150,150,150];
        $dbl_rows = [100,100,100,100,90];

        # Add table shape to slide
        $tbl = $sld->getShapes()->addTable(50, 50, $dbl_cols, $dbl_rows);

        # Creating a Buffered Image object to hold the image file
        $imageIO = new ImageIO();
        $image = $imageIO->read(new File($dataDir . "aspose-logo.jpg"));
        $imgx1 = $pres->getImages()->addImage($image);

        $fillType=new FillType();
        $pictureFillMode=new PictureFillMode();
        $tbl->get_Item(0,0)->getFillFormat()->setFillType($fillType->Picture);
        $tbl->get_Item(0,0)->getFillFormat()->getPictureFillFormat()->setPictureFillMode($pictureFillMode->Stretch);
        $tbl->get_Item(0,0)->getFillFormat()->getPictureFillFormat()->getPicture()->setImage($imgx1);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "AddImage.pptx", $save_format->Pptx);

        print "Added image, please check the output file.".PHP_EOL;
    }

}

?>