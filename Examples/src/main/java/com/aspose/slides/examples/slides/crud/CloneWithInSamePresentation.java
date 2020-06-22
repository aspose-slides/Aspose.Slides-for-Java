package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class CloneWithInSamePresentation
{
    public static void main(String[] args)
    {
        //ExStart:CloneWithInSamePresentation
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation(dataDir + "CloneWithInSamePresentation.pptx");
        try
        {

            // Clone the desired slide to the end of the collection of slides in the same presentation
            ISlideCollection slds = pres.getSlides();

            // Clone the desired slide to the specified index in the same presentation
            slds.insertClone(2, pres.getSlides().get_Item(1));

            // Write the modified presentation to disk
            pres.save(dataDir + "Aspose_CloneWithInSamePresentation_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CloneWithInSamePresentation            
    }
}
