<?php
namespace Aspose\Slides\WorkingWithText;
use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\FontData as FontData;
use com\aspose\slides\NullableBool as NullableBool;
use com\aspose\slides\FillType as FillType;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\TextUnderlineType as TextUnderlineType;
use com\aspose\slides\LoadOptions as LoadOptions;
use com\aspose\slides\LoadFormat as LoadFormat;
use java\awt\Color as Color;

Class TextFont{

    public static function run($dataDir=null){

        # Managing Font Related Properties
        TextFont::font_properties($dataDir);

        # Managing Font Family of Text
        TextFont::font_family_of_text($dataDir);

        # Using Default Fonts for Rendering Presentation
        TextFont::set_default_font_for_rendering($dataDir);

    }

    public static function font_properties($dataDir=null){

        # Create an instance of Presentation class
        $pres = new Presentation($dataDir . 'Welcome.pptx');

        # Get the first slide
        $slide = $pres->getSlides()->get_Item(0);

        # Accessing the first and second placeholder in the slide and typecasting it as AutoShape
        $tf1 = $slide->getShapes()->get_Item(0)->getTextFrame();
        $tf2 = $slide->getShapes()->get_Item(1)->getTextFrame();

        # Accessing the first Paragraph
        $para1 = $tf1->getParagraphs()->get_Item(0);
        $para2 = $tf2->getParagraphs()->get_Item(0);

        # Accessing the first portion
        $port1 = $para1->getPortions()->get_Item(0);
        $port2 = $para2->getPortions()->get_Item(0);

        # Define new fonts
        $fd1 = new FontData("Elephant");
        $fd2 = new FontData("Castellar");

        # Assign new fonts to portion
        $port1->getPortionFormat()->setLatinFont($fd1);
        $port2->getPortionFormat()->setLatinFont($fd2);

        # Set font to Bold
        $nullableBool=new NullableBool();
        $port1->getPortionFormat()->setFontBold($nullableBool->True);
        $port2->getPortionFormat()->setFontBold($nullableBool->True);

        # Set font to Italic
        $port1->getPortionFormat()->setFontItalic($nullableBool->True);
        $port2->getPortionFormat()->setFontItalic($nullableBool->True);

        # Set font color
        $fillType=new FillType();
        $color=new Color();
        $port1->getPortionFormat()->getFillFormat()->setFillType($fillType->Solid);
        $port1->getPortionFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLUE);
        $port2->getPortionFormat()->getFillFormat()->setFillType($fillType->Solid);
        $port2->getPortionFormat()->getFillFormat()->getSolidFillColor()->setColor($color->GREEN);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "WelcomeFont.pptx", $save_format->Pptx);

        print "Done with font properties, please check the output file.".PHP_EOL;

    }

    public static function font_family_of_text($dataDir=null){


        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sld = $pres->getSlides()->get_Item(0);

        # Add an AutoShape of Rectangle type
        $shapeType=new ShapeType();
        $ashp = $sld->getShapes()->addAutoShape($shapeType->Rectangle, 50, 50, 200, 50);

        # Remove any fill style associated with the AutoShape
        $fillType=new FillType();
        $ashp->getFillFormat()->setFillType($fillType->NoFill);

        # Access the TextFrame associated with the AutoShape
        $tf = $ashp->getTextFrame();
        $tf->setText("Aspose TextBox");

        # Access the Portion associated with the TextFrame
        $port = $tf->getParagraphs()->get_Item(0)->getPortions()->get_Item(0);

        # Set the Font for the Portion
        $port->getPortionFormat()->setLatinFont(new FontData("Times New Roman"));

        # Set Bold property of the Font
        $nullableBool=new NullableBool();
        $port->getPortionFormat()->setFontBold($nullableBool->True);

        # Set Italic property of the Font
        $port->getPortionFormat()->setFontItalic($nullableBool->True);

        # Set Underline property of the Font
        $textUnderlineType=new TextUnderlineType();
        $port->getPortionFormat()->setFontUnderline($textUnderlineType->Single);

        # Set the Height of the Font
        $port->getPortionFormat()->setFontHeight(25);

        # Set the color of the Font
        $color=new Color();
        $port->getPortionFormat()->getFillFormat()->setFillType($fillType->Solid);
        $port->getPortionFormat()->getFillFormat()->getSolidFillColor()->setColor($color->BLUE);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "FontFamilyOfText.pptx", $save_format->Pptx);

        print "Done with font family for text, please check the output file.".PHP_EOL;
    }

    public static function set_default_font_for_rendering($dataDir=null){

        # Use load options to define the default regualr and asian fonts

        $loadFormat = new LoadFormat();
        $lo = new LoadOptions($loadFormat->Auto);
        $lo->setDefaultRegularFont("Wingdings");
        $lo->setDefaultAsianFont("Wingdings");

        # Create an instance of Presentation class
        $pres = new Presentation($dataDir . 'input.pptx');

        # Generate PDF
        $save_format = new SaveFormat();
        $pres->save($dataDir . "output.pdf", $save_format->Pdf);

        print "Done with font family for text, please check the output file.".PHP_EOL;

    }
}