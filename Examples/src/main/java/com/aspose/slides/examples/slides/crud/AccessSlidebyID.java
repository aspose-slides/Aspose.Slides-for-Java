package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.IBaseSlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AccessSlidebyID
{
    public static void main(String[] args)
    {
        //ExStart:AccessSlidebyID
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");

        // Getting Slide ID
        /*UInt32*/
        long id = presentation.getSlides().get_Item(0).getSlideId();

        // Accessing Slide by ID
        IBaseSlide slide = presentation.getSlideById(id);
        //ExEnd:AccessSlidebyID
    }
}
