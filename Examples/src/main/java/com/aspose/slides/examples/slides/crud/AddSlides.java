package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AddSlides
{
    public static void main(String[] args)
    {
        //ExStart:AddSlides
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Presentation class that represents the presentation file
        Presentation pres = new Presentation();
        try
        {
            // Instantiate SlideCollection calss
            ISlideCollection slds = pres.getSlides();

            for (int i = 0; i < pres.getLayoutSlides().size(); i++)
            {
                // Add an empty slide to the Slides collection
                slds.addEmptySlide(pres.getLayoutSlides().get_Item(i));

            }

            // Save the PPTX file to the Disk
            pres.save(dataDir + "EmptySlide_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddSlides
    }
}
