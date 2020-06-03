package com.aspose.slides.examples.rendering.printing;

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


public class SetSlideNumber
{
    public static void main(String[] args)
    {
        //ExStart:SetSlideNumber
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Rendering();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "HelloWorld.pptx");
        try
        {
            // Get the slide number
            int firstSlideNumber = presentation.getFirstSlideNumber();

            // Set the slide number
            presentation.setFirstSlideNumber(10);

            presentation.save(dataDir + "Set_Slide_Number_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetSlideNumber
    }
}


