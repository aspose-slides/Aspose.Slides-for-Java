package com.aspose.slides.examples.slides.notes;

import com.aspose.slides.INotesSlideManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


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
