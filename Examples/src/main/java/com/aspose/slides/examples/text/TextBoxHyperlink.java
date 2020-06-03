package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class TextBoxHyperlink
{
    public static void main(String[] args)
    {
        //ExStart:TextBoxHyperlink
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate a Presentation class that represents a PPTX
        Presentation pptxPresentation = new Presentation();

        // Get first slide
        ISlide slide = pptxPresentation.getSlides().get_Item(0);

        // Add an AutoShape of Rectangle Type
        IShape pptxShape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 150, 150, 150, 50);

        // Cast the shape to AutoShape
        IAutoShape pptxAutoShape = (IAutoShape) pptxShape;

        // Access ITextFrame associated with the AutoShape
        pptxAutoShape.addTextFrame("");

        ITextFrame ITextFrame = pptxAutoShape.getTextFrame();

        // Add some text to the frame
        ITextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).setText("Aspose.Slides");

        // Set Hyperlink for the portion text
        IHyperlinkManager HypMan = ITextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getHyperlinkManager();
        HypMan.setExternalHyperlinkClick("http://www.aspose.com");
        // Save the PPTX Presentation
        pptxPresentation.save(dataDir + "hLinkPPTX_out.pptx", SaveFormat.Pptx);
        //ExEnd:TextBoxHyperlink
    }
}
