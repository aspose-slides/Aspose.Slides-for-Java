package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class AccessOpenDoc
{
    public static void main(String[] args)
    {
        //ExStart:AccessOpenDoc
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

        // Open the ODP file
        Presentation pres = new Presentation(dataDir + "AccessOpenDoc.odp");

        // Saving the ODP presentation to PPTX format
        pres.save(dataDir + "AccessOpenDoc_out.pptx", SaveFormat.Pptx);
        //ExEnd:AccessOpenDoc
    }
}
