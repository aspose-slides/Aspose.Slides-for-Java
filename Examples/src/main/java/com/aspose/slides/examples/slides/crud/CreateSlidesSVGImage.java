package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class CreateSlidesSVGImage
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:CreateSlidesSVGImage
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate a Presentation class that represents the presentation file

        Presentation pres = new Presentation(dataDir + "CreateSlidesSVGImage.pptx");
        try
        {

            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Create a memory stream object
            ByteArrayOutputStream svgStream = new ByteArrayOutputStream();

            // Generate SVG image of slide and save in memory stream
            sld.writeAsSvg(svgStream);

            // Save memory stream to file
            FileOutputStream fileStream = new FileOutputStream(dataDir + "Aspose_out.svg");
            try
            {
                svgStream.writeTo(fileStream);

            }
            finally
            {
                if (fileStream != null) fileStream.close();
            }
            svgStream.close();
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CreateSlidesSVGImage
    }
}
