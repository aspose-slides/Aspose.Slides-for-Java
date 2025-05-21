package com.aspose.slides.examples.presentations.conversion;


import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

/*
This example shows how to export a presentation in the Handout layout to HTML5 document.
*/
public class ConvertToHtml5Handout
{
    public static void main(String[] args)
    {
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Conversion();

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "HandoutExample.html";

        //ExStart:ConvertToHtml5Handout
        Presentation pres = new Presentation(dataDir + "HandoutExample.pptx");
        try {
            // Set convertion options
            HandoutLayoutingOptions handoutLayoutingOptions = new HandoutLayoutingOptions();
            handoutLayoutingOptions.setHandout(HandoutType.Handouts4Horizontal);

            Html5Options options = new Html5Options();
            options.setSlidesLayoutOptions(handoutLayoutingOptions);

            // Save result
            pres.save(outFilePath, SaveFormat.Html5, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToHtml5Handout
    }
}
