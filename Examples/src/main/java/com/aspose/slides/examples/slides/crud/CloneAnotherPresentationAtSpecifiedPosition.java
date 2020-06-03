package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class CloneAnotherPresentationAtSpecifiedPosition
{
    public static void main(String[] args)
    {
        //ExStart:CloneAnotherPresentationAtSpecifiedPosition
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate Presentation class to load the source presentation file
        Presentation sourcePresentation = new Presentation(dataDir + "AccessSlides.pptx");
        try
        {
            // Instantiate Presentation class for destination presentation (where slide is to be cloned)
            Presentation destPres = new Presentation();
            try
            {
                // Clone the desired slide from the source presentation to the end of the collection of slides in destination presentation
                ISlideCollection slideCollection = destPres.getSlides();

                // Clone the desired slide from the source presentation to the specified position in destination presentation
                slideCollection.insertClone(1, sourcePresentation.getSlides().get_Item(1));

                // Write the destination presentation to disk
                destPres.save(dataDir + "CloneAnotherPresentationAtSpecifiedPosition_out.pptx", SaveFormat.Pptx);
            }
            finally
            {
                if (destPres != null) destPres.dispose();
            }
        }
        finally
        {
            if (sourcePresentation != null) sourcePresentation.dispose();
        }
        //ExEnd:CloneAnotherPresentationAtSpecifiedPosition
    }
}
