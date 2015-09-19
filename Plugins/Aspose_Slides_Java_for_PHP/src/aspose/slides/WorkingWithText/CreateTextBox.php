<?php
namespace Aspose\Slides\WorkingWithText;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\SaveFormat as SaveFormat;


class CreateTextBox{

    public static function run($dataDir=null){

        # Creating a TextBox on Slide
        CreateTextBox::create_textbox($dataDir);

        # Creating a TextBox with Hyperlink
        CreateTextBox::create_textbox_with_hyperlink($dataDir);

    }

    public static function create_textbox($dataDir=null){
        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add autoshape of rectangle type
        $shapeType=new ShapeType();
        $shp = $sld->getShapes()->addAutoShape($shapeType->Rectangle, 150, 75, 150, 50);

        # Add TextFrame to the Rectangle
        $shp->addTextFrame(" ");

        # Accessing the text frame
        $txt_frame = $shp->getTextFrame();

        # Create the Paragraph object for text frame
        $para = $txt_frame->getParagraphs()->get_Item(0);

        # Create Portion object for paragraph
        $portion = $para->getPortions()->get_Item(0);

        # Set Text
        $portion->setText("Aspose TextBox");

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "TextBox.pptx", $save_format->Pptx);

        print "Created TextBox, please check the output file.".PHP_EOL;
    }


    public static function create_textbox_with_hyperlink(){

        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add autoshape of rectangle type
        $shapeType=new ShapeType();
        $pptxShape = $sld->getShapes()->addAutoShape($shapeType->Rectangle, 150, 150, 150, 50);

        # Cast the shape to AutoShape
        $pptxAutoShape = $pptxShape;

        # Access ITextFrame associated with the AutoShape
        $pptxAutoShape->addTextFrame("");

        $text_frame = $pptxAutoShape->getTextFrame();

        # Add some text to the frame
        $text_frame->getParagraphs()->get_Item(0)->getPortions()->get_Item(0)->setText("Aspose.Slides");

        #Set Hyperlink for the portion text
        $hypman = $text_frame->getParagraphs()->get_Item(0)->getPortions()->get_Item(0)->getPortionFormat()->getHyperlinkManager();
        $hypman->setExternalHyperlinkClick("http://www.aspose.com");

        # Write the presentation as a PPTX file
        $save_format =new SaveFormat();
        $pres->save(data_dir + "hLinkPPTX.pptx", $save_format->Pptx);

        print "Created TextBox with Hyperlink, please check the output file.".PHP_EOL;

    }

}