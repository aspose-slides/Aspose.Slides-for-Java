package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.RunExamples;





public class ConvertWithXpsOptions
{
    public static void main(String[] args)
    {
        //ExStart:ConvertWithXpsOptions
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "Convert_XPS_Options.pptx");
        try
        {
            // Instantiate the TiffOptions class
            XpsOptions opts = new XpsOptions();

            // Save MetaFiles as PNG
            opts.setSaveMetafilesAsPng(true);

            // Save the presentation to XPS document
            pres.save(dataDir + "XPS_With_Options_out.xps", SaveFormat.Xps, opts);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertWithXpsOptions
    }
}
