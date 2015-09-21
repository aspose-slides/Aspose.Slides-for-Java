<?php
namespace Aspose\Slides\WorkingWithText;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\TextAutofitType as TextAutofitType;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\TextAnchorType as TextAnchorType;
use com\aspose\slides\TextVerticalType as TextVerticalType;
use java\awt\Color as Color;

class ManageText{

    public static function run($dataDir=null){

        # Setting the AutofitType property of text frame
        ManageText::set_autofittype_of_text($dataDir);

        # Setting the anchor of TextFrame
        ManageText::set_anchor_of_text($dataDir);

        # Rotating the text
        ManageText::rotate_text($dataDir);
    }

    public static function set_autofittype_of_text($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Add an AutoShape of Rectangle type
        $shapeType=new ShapeType();
        $ashp = $slide->getShapes()->addAutoShape($shapeType->Rectangle, 150, 75, 350, 350);

        # Add TextFrame to the Rectangle
        $fillType=new FillType();
        $ashp->addTextFrame(" ");
        $ashp->getFillFormat()->setFillType($fillType->NoFill);

        # Accessing the text frame
        $txt_frame = $ashp->getTextFrame();

        # Setting text autofit type
        $textAutofitType=new TextAutofitType();
        $txt_frame->getTextFrameFormat()->setAutofitType($textAutofitType->Shape);

        # Create the Paragraph object for text frame
        $para = $txt_frame->getParagraphs()->get_Item(0);

        # Create Portion object for paragraph
        $color=new Color();
        $portion = $para->getPortions()->get_Item(0);
        $portion->setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.");
        $portion->getPortionFormat()->getFillFormat()->setFillType($fillType->Solid);
        $portion->getPortionFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLACK);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "formatText.pptx", $save_format->Pptx);

        print "Set autofittype of text, please check the output file.".PHP_EOL;
    }

    public static function set_anchor_of_text($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Add an AutoShape of Rectangle type
        $shapeType=new ShapeType();
        $ashp = $slide->getShapes()->addAutoShape($shapeType->Rectangle, 150, 75, 350, 350);

        # Add TextFrame to the Rectangle
        $fillType=new FillType();
        $ashp->addTextFrame(" ");
        $ashp->getFillFormat()->setFillType($fillType->NoFill);

        # Accessing the text frame
        $txt_frame = $ashp->getTextFrame();

        # Setting text anchoring to bottom
        $textAnchorType=new TextAnchorType();
        $txt_frame->getTextFrameFormat()->setAnchoringType($textAnchorType->Bottom);

        # Create the Paragraph object for text frame
        $para = $txt_frame->getParagraphs()->get_Item(0);

        # Create Portion object for paragraph
        $color=new Color();
        $portion = $para->getPortions()->get_Item(0);
        $portion->setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.");
        $portion->getPortionFormat()->getFillFormat()->setFillType($fillType->Solid);
        $portion->getPortionFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLACK);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "AnchorText.pptx", $save_format->Pptx);

        print "Set anchor of text, please check the output file.".PHP_EOL;
    }

    public static function rotate_text($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Add an AutoShape of Rectangle type
        $shapeType=new ShapeType();
        $ashp = $slide->getShapes()->addAutoShape($shapeType->Rectangle, 150, 75, 350, 350);

        # Add TextFrame to the Rectangle
        $fillType=new FillType();
        $ashp->addTextFrame(" ");
        $ashp->getFillFormat()->setFillType($fillType->NoFill);

        # Accessing the text frame
        $txt_frame = $ashp->getTextFrame();

        # Setting text Vertical type
        $textVerticalType=new TextVerticalType();
        $txt_frame->getTextFrameFormat()->setTextVerticalType($textVerticalType->Vertical270);

        # Create the Paragraph object for text frame
        $para = $txt_frame->getParagraphs()->get_Item(0);

        # Create Portion object for paragraph
        $portion = $para->getPortions()->get_Item(0);
        $color=new Color();
        $portion->setText("A quick brown fox jumps over the lazy dog. A quick brown fox jumps over the lazy dog.");
        $portion->getPortionFormat()->getFillFormat()->setFillType($fillType->Solid);
        $portion->getPortionFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLACK);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "VerticleText.pptx", $save_format->Pptx);

        print "Done with text rotation, please check the output file.".PHP_EOL;
    }
}