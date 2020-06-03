package com.aspose.slides.examples.text;

import com.aspose.slides.AutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextHighlightingOptions;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class HighlightTextusingRegex
{
    public static void main(String[] args)
    {

        //ExStart:HighlightTextUsingRegx
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        Presentation presentation = new Presentation(dataDir + "SomePresentation.pptx");
        TextHighlightingOptions options = new TextHighlightingOptions();
        ((AutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightRegex("\\b[^\\s){5,}\\b", Color.BLUE, options); // highlighting all words with 10 symbols or longer
        presentation.save(dataDir + "SomePresentation-out.pptx", SaveFormat.Pptx);

        //ExEnd:HighlightTextUsingRegx
    }
}

