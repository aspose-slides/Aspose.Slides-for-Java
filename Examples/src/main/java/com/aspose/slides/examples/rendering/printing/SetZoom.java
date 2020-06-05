package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


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


