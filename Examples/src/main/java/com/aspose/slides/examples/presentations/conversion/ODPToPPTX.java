package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class ODPToPPTX
{

    public static void main(String[] args)
    {

        //ExStart:ODPToPPTX

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();


        String srcFileName = dataDir + "AccessOpenDoc.odp";
        String destFileName = dataDir + "AccessOpenDoc.pptx";
        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(srcFileName);
        try
        {
            //Saving the PPTX presentation to PPTX format
            pres.save(destFileName, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ODPToPPTX


    }
}

