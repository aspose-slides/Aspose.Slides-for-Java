package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Html5Options;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

/*
This example demonstrates the saving presentation in HTML5 operation.
*/
public class ConvertToHtml5
{
    public static void main(String[] args)
    {
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Conversion();

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "Demo.html";

        //ExStart:ConvertToHtml5
        Presentation pres = new Presentation(dataDir + "Demo.pptx");
        try {
            // Export a presentation containing slides transitions, animations, and shapes animations to HTML5
            Html5Options options = new Html5Options();
            options.setAnimateShapes(true);
            options.setAnimateTransitions(true);

            // Save presentation
            pres.save(outFilePath, SaveFormat.Html5, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToHtml5
    }
}
