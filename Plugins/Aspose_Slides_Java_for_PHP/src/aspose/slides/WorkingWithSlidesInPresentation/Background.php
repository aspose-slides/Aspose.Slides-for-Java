<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\BackgroundType as BackgroundType;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\PictureFillMode as PictureFillMode;
use java\awt\Color as Color;
use java\io\FileInputStream as FileInputStream;
use java\io\File as File;


class Background {

    public static function run($dataDir=null)
    {

        # Setting the Background Color of a Master Slide
        Background::set_background_color_of_master_slide($dataDir);

        # Setting the Background Color of a Normal Slide
        Background::set_background_color_of_normal_slide($dataDir);

        # Setting the Slide Background to an Image
        Background::set_image_as_background_color($dataDir);

    }

    public static function set_background_color_of_master_slide($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation();

        # Set the background color of the Master Slide to Forest Green
        $backgroundType = new BackgroundType();
        $fillType = new FillType();
        $color = new Color();

        $pres->getMasters()->get_Item(0)->getBackground()->setType($backgroundType->OwnBackground);
        $pres->getMasters()->get_Item(0)->getBackground()->getFillFormat()->setFillType($fillType->Solid);
        $pres->getMasters()->get_Item(0)->getBackground()->getFillFormat()->getSolidFillColor()->setColor($color->GREEN);

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "MasterBG.pptx", $save_format->Pptx);

        print "Set background color of master slide, please check the output file." . PHP_EOL;

    }

    public static function set_background_color_of_normal_slide($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation();

        # Set the background color of the Normal slide to Blue

        $backgroundType = new BackgroundType();
        $fillType = new FillType();
        $color = new Color();

        $pres->getSlides()->get_Item(0)->getBackground()->setType($backgroundType->OwnBackground);
        $pres->getSlides()->get_Item(0)->getBackground()->getFillFormat()->setFillType($fillType->Solid);
        $pres->getSlides()->get_Item(0)->getBackground()->getFillFormat()->getSolidFillColor()->setColor($color->BLUE);

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "ContentBG.pptx", $save_format->Pptx);

        print "Set background color of normal slide, please check the output file." . PHP_EOL;

    }

    public static function set_image_as_background_color($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation();

        # Set the background with Image

        $backgroundType = new BackgroundType();
        $fillType = new FillType();
        $pictureFillMode = new PictureFillMode();

        $pres->getSlides()->get_Item(0)->getBackground()->setType($backgroundType->OwnBackground);
        $pres->getSlides()->get_Item(0)->getBackground()->getFillFormat()->setFillType($fillType->Picture);
        $pres->getSlides()->get_Item(0)->getBackground()->getFillFormat()->getPictureFillFormat()->setPictureFillMode($pictureFillMode->Stretch);

        # Set the picture
        $imgx = $pres->getImages()->addImage(new FileInputStream(new File($dataDir . 'night.jpg')));

        # Image imgx = pres.getImages().addImage(image);
        # Add image to presentation's images collection

        $pres->getSlides()->get_Item(0)->getBackground()->getFillFormat()->getPictureFillFormat()->getPicture()->setImage($imgx);

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "ContentBG_Image.pptx", $save_format->Pptx);

        print "Set image as background, please check the output file." . PHP_EOL;

    }

}