package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.MarkdownExportType;
import com.aspose.slides.MarkdownSaveOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class ConvertToMarkdown
{
    public static void main(String[] args)
    {
        //ExStart:ConvertToMarkdown
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Conversion() + "PresentationDemo.pptx";

        Presentation pres = new Presentation(presentationName);
        try {
            // Path and folder name for saving markdown data
            String outPath = RunExamples.getOutPath();

            // Create Markdown creation options
            MarkdownSaveOptions mdOptions = new MarkdownSaveOptions();
            // Set parameter for render all items (items that are grouped will be rendered together).
            mdOptions.setExportType(MarkdownExportType.Visual);
            // Set folder name for saving images
            mdOptions.setImagesSaveFolderName("md-images");
            // Set path for folder images
            mdOptions.setBasePath(outPath);

            // Save presentation in Markdown format
            pres.save(outPath + "pres.md", SaveFormat.Md, mdOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToMarkdown
    }
}
