package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SetPDFPageSize
{
    public static void main(String[] args)
    {
        //ExStart:SetPDFPageSize
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();

        // Instantiate a Presentation object that represents a presentation file 
        Presentation presentation = new Presentation();

        // Set SlideSize.Type Property 
        presentation.getSlideSize().setSize(SlideSizeType.A4Paper, SlideSizeScaleType.EnsureFit);

        // Set different properties of PDF Options
        PdfOptions opts = new PdfOptions();
        opts.setSufficientResolution(600);

        // Save presentation to disk
        presentation.save(dataDir + "SetPDFPageSize_out.pdf", SaveFormat.Pdf, opts);
        //ExEnd:SetPDFPageSize
    }
}
