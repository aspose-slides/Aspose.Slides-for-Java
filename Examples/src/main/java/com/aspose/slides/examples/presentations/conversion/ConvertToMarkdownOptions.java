package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Flavor;
import com.aspose.slides.HandleRepeatedSpaces;
import com.aspose.slides.MarkdownExportType;
import com.aspose.slides.MarkdownSaveOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

/*
This example demonstrates how to save presentation to Markdown format using some convertion options.
*/
public class ConvertToMarkdownOptions
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Conversion() + "PresentationDemo.pptx";

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "pres-out.md";

        //ExStart:ConvertToMarkdownOptions
        Presentation pres = new Presentation(presentationName);
        try {
            MarkdownSaveOptions options = new MarkdownSaveOptions();
            options.setRemoveEmptyLines(true);
            options.setHandleRepeatedSpaces(HandleRepeatedSpaces.AlternateSpacesToNbsp);
            options.setSlideNumberFormat("## Slide {0} -");
            options.setShowSlideNumber(true);
            options.setExportType(MarkdownExportType.TextOnly);
            options.setFlavor(Flavor.Default);

            // Save presentation in Markdown format
            pres.save(outFilePath, SaveFormat.Md, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToMarkdownOptions
    }
}
