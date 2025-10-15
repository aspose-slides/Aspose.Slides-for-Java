package com.aspose.slides.examples.text;

import com.aspose.slides.AutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextHighlightingOptions;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.util.regex.Pattern;


public class HighlightTextusingRegex
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Path to output file
        String outFileName = RunExamples.getOutPath() + "omePresentation-out.pptx";

        //ExStart:HighlightTextUsingRegx
        Presentation presentation = new Presentation(dataDir + "SomePresentation.pptx");
        try {
            Pattern regex = Pattern.compile("\\b[^\\s]{5,}\\b");
            ((AutoShape)presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightRegex(regex, Color.BLUE, null);
            presentation.save(outFileName, SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:HighlightTextUsingRegx
    }
}

