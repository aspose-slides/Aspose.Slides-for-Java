package com.aspose.slides.examples.slides;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class RemoveSlideUsingReference
{
    public static void main(String[] args)
    {
        //ExStart:RemoveSlideUsingReference
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "RemoveSlideUsingReference.pptx");
        try
        {

            // Accessing a slide using its index in the slides collection
            ISlide slide = pres.getSlides().get_Item(0);

            // Removing a slide using its reference
            pres.getSlides().remove(slide);

            //Writing the presentation file
            pres.save(dataDir + "modified_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RemoveSlideUsingReference
    }
}
