package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class LineSpacing
{
    public static void main(String[] args)
    {
        //ExStart:LineSpacing

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation(dataDir + "Fonts.pptx");

        // Obtain a slide's reference by its index
        ISlide sld = presentation.getSlides().get_Item(0);

        // Access the TextFrame
        ITextFrame tf1 = ((IAutoShape) sld.getShapes().get_Item(0)).getTextFrame();

        // Access the Paragraph
        IParagraph para1 = tf1.getParagraphs().get_Item(0);

        // Set properties of Paragraph
        para1.getParagraphFormat().setSpaceWithin(80);
        para1.getParagraphFormat().setSpaceBefore(40);
        para1.getParagraphFormat().setSpaceAfter(40);
        // Save Presentation
        presentation.save(dataDir + "LineSpacing_out.pptx", SaveFormat.Pptx);
        //ExEnd:LineSpacing
    }
}
