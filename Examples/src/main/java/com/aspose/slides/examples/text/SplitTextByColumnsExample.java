package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class SplitTextByColumnsExample
{
    public static void main(String[] args)
    {
        //Path for source presentation
        String presentationName = RunExamples.getDataDir_Text() + "MultiColumnText.pptx";

        //ExStart:JavaScriptLinkExample
        Presentation pres = new Presentation(presentationName);
        try {
            // Get the first shape on the slide
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            // Get textFrame
            ITextFrame textFrame = shape.getTextFrame();
            // Split the text frame content into columns
            String[] columnsText = textFrame.splitTextByColumns();
            // Print each column's text to the console
            for (String column : columnsText)
                System.out.println(column + '\n');
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:JavaScriptLinkExample
    }
}
