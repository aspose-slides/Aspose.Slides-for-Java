package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideUtil;
import com.aspose.slides.examples.RunExamples;

import java.io.ByteArrayOutputStream;
import java.io.File;

public class ToSaveFormatExample
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();
        String presentationPath = dataDir + "Presentation.pptm";

        //ExStart:ToSaveFormatExample
        Presentation sourcePresentation = new Presentation(presentationPath);
        try {
            // Modify the presentation as you need
            sourcePresentation.getSlides().addClone(sourcePresentation.getSlides().get_Item(0));

            // Save the presentation to the stream in its original format
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            sourcePresentation.save(stream, SlideUtil.toSaveFormat(sourcePresentation.getSourceFormat()));
        }
        finally
        {
            if (sourcePresentation != null) sourcePresentation.dispose();
        }
        //ExEnd:ToSaveFormatExample
    }
}
