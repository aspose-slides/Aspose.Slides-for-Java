package com.aspose.slides.examples.text;


import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextSearchOptions;
import com.aspose.slides.examples.RunExamples;


/*
This example demonstrates how to use TextSearchOptions to allows including text
contained in slide notes when performing text replacement method.
*/

public class FindTextOptions
{
    public static void main(String[] args)
    {
        String presentationName = RunExamples.getDataDir_Text() + "TextOptionsExample.pptx";
        String outPath = RunExamples.getOutPath() + "TextOptionsExample-out.pptx";

        //ExStart:FindTextOptions
        Presentation pres = new Presentation(presentationName);
        try {
            // Set text search options
            TextSearchOptions options = new TextSearchOptions();
            options.setIncludeNotes(true);
            options.setCaseSensitive(true);

            // Replace test
            pres.replaceText("old", "new", options, null);

            // Save result
            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FindTextOptions
    }
}
