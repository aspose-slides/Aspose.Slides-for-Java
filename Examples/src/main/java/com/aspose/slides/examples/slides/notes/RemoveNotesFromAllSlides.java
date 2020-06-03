package com.aspose.slides.examples.slides.notes;

import com.aspose.slides.INotesSlideManager;
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


public class RemoveNotesFromAllSlides
{
    public static void main(String[] args)
    {
        //ExStart:RemoveNotesFromAllSlides
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Notes();

        // Instantiate a Presentation object that represents a presentation file 
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");

        // Removing notes of all slides
        INotesSlideManager mgr = null;
        for (int i = 0; i < presentation.getSlides().size(); i++)
        {
            mgr = presentation.getSlides().get_Item(i).getNotesSlideManager();
            mgr.removeNotesSlide();
        }
        // Save presentation to disk
        presentation.save(dataDir + "RemoveNotesFromAllSlides_out.pptx", SaveFormat.Pptx);
        //ExEnd:RemoveNotesFromAllSlides
    }
}
