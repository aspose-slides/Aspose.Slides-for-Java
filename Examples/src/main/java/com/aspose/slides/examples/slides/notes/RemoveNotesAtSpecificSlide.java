package com.aspose.slides.examples.slides.notes;

import com.aspose.slides.INotesSlideManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class RemoveNotesAtSpecificSlide
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Notes();

        //ExStart:RemoveNotesAtSpecificSlide
        // Instantiate a Presentation object that represents a presentation file 
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");

        // Removing notes of first slide
        INotesSlideManager mgr = presentation.getSlides().get_Item(0).getNotesSlideManager();
        mgr.removeNotesSlide();

        // Save presentation to disk
        presentation.save(dataDir + "RemoveNotesAtSpecificSlide_out.pptx", SaveFormat.Pptx);

        //ExEnd:RemoveNotesAtSpecificSlide

    }
}
