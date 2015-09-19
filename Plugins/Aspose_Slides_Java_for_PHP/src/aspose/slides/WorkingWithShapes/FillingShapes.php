<?php

namespace Aspose\Slides\WorkingWithShapes;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\PatternStyle as PatternStyle;
use com\aspose\slides\PictureFillMode as PictureFillMode;
use java\awt\Color as Color;
use java\io\File as File;
use java\io\FileInputStream as FileInputStream;


class FillingShapes {

    public static function run($dataDir=null)
    {

        # Filling Shapes with Pattern
        FillingShapes::fill_shapes_with_pattern($dataDir);

        # Filling Shapes with Picture
        FillingShapes::fill_shapes_with_picture($dataDir);

        # Filling Shapes with Solid Color
        FillingShapes::fill_shapes_with_solid_color($dataDir);

    }

    public static function fill_shapes_with_pattern($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add autoshape of rectangle type
        $shapeType = new ShapeType();
        $shp = $sld->getShapes()->addAutoShape($shapeType->Rectangle, 50, 150, 75, 150);

        # Set the fill type to Pattern
        $fillType = new FillType();
        $shp->getFillFormat()->setFillType($fillType->Pattern);

        # Set the pattern style
        $patternStyle = new PatternStyle();
        $shp->getFillFormat()->getPatternFormat()->setPatternStyle($patternStyle->Trellis);

        # Set the pattern back and fore colors
        $color = new Color();
        $shp->getFillFormat()->getPatternFormat()->getBackColor()->setColor($color->LIGHT_GRAY);
        $shp->getFillFormat()->getPatternFormat()->getForeColor()->setColor($color->YELLOW);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "RectShpPatt.pptx", $save_format->Pptx);

        print "Filled shapes with Pattern, please check the output file." . PHP_EOL;

    }

    public static function fill_shapes_with_picture($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add autoshape of rectangle type
        $shapeType = new ShapeType();
        $shp = $sld->getShapes()->addAutoShape($shapeType->Rectangle, 50, 150, 75, 150);

        # Set the fill type to Picture
        $fillType = new FillType();
        $shp->getFillFormat()->setFillType($fillType->Picture);

        # Set the picture fill mode
        $pictureFillMode = new PictureFillMode();
        $shp->getFillFormat()->getPictureFillFormat()->setPictureFillMode($pictureFillMode->Tile);

        # Set the picture
        $imgx = $pres->getImages()->addImage(new FileInputStream(new File($dataDir . "night.jpg")));

        $shp->getFillFormat()->getPictureFillFormat()->getPicture()->setImage($imgx);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "RectShpPic.pptx", $save_format->Pptx);

        print "Filled shapes with Picture, please check the output file." . PHP_EOL;

    }

    public static function fill_shapes_with_solid_color($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add autoshape of rectangle type
        $shapeType = new ShapeType();
        $shp = $sld->getShapes()->addAutoShape($shapeType->Rectangle, 50, 150, 75, 150);

        # Set the fill type to Solid
        $fillType = new FillType();
        $shp->getFillFormat()->setFillType($fillType->Solid);

        # Set the color of the rectangle
        $color = new Color();
        $shp->getFillFormat()->getSolidFillColor()->setColor($color->YELLOW);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "RectShpSolid.pptx", $save_format->Pptx);

        print "Filled shapes with Solid Color, please check the output file.";

    }

}