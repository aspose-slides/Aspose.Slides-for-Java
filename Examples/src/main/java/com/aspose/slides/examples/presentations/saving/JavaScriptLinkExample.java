package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.PptxOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class JavaScriptLinkExample
{
    public static void main(String[] args)
    {
        //Path for source presentation
        String pptxFile = RunExamples.getDataDir_PresentationSaving() + "JavaScriptLink.pptx";
        //Out path
        String resultPath = RunExamples.getOutPath() +  "JavaScriptLink-out.pptx";

        //ExStart:JavaScriptLinkExample
        Presentation pres = new Presentation(pptxFile);
        try {
            PptxOptions pptxOptions = new PptxOptions();
            pptxOptions.setSkipJavaScriptLinks(true);
            pres.save(resultPath, SaveFormat.Pptx, pptxOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:JavaScriptLinkExample
    }
}
