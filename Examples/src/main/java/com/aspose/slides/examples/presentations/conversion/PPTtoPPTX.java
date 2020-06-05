package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class PPTtoPPTX
{
    public static void main(String[] args)
    {
        //ExStart:PPTtoPPTX
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a PPTX file
        Presentation pres = new Presentation(dataDir + "PPTtoPPTX.ppt");

        // Saving the PPTX presentation to PPTX format
        pres.save(dataDir + "PPTtoPPTX_out.pptx", SaveFormat.Pptx);
        //ExEnd:PPTtoPPTX
    }
}
