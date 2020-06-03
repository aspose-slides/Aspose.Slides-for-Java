package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx 
 */


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
