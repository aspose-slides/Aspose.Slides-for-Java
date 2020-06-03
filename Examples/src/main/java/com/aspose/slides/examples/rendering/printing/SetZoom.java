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


public class SetZoom
{
    public static void main(String[] args)
    {
        //ExStart:SetZoom
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Rendering();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation();
        try
        {
            // Setting View Properties of Presentation

            presentation.getViewProperties().getSlideViewProperties().setScale(100); // Zoom value in percentages for slide view
            presentation.getViewProperties().getNotesViewProperties().setScale(100); // Zoom value in percentages for notes view

            presentation.save(dataDir + "Zoom_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetZoom
    }
}


