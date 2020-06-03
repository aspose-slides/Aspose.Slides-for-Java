package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class ConvertWithoutXpsOptions
{
    public static void main(String[] args)
    {
        //ExStart:ConvertWithoutXpsOptions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "Convert_XPS.pptx");
        try
        {
            // Saving the presentation to XPS document
            pres.save(dataDir + "XPS_Output_Without_XPSOption_out.xps", SaveFormat.Xps);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertWithoutXpsOptions
    }
}
