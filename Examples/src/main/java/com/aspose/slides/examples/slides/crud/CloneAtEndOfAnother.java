package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class CloneAtEndOfAnother
{
    public static void main(String[] args)
    {
        //ExStart:CloneAtEndOfAnother
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate Presentation class to load the source presentation file
        Presentation srcPres = new Presentation(dataDir + "CloneAtEndOfAnother.pptx");
        try
        {
            // Instantiate Presentation class for destination PPTX (where slide is to be cloned)
            Presentation destPres = new Presentation();
            try
            {
                // Clone the desired slide from the source presentation to the end of the collection of slides in destination presentation
                ISlideCollection slds = destPres.getSlides();

                slds.addClone(srcPres.getSlides().get_Item(0));

                // Write the destination presentation to disk
                destPres.save(dataDir + "Aspose2_out.pptx", SaveFormat.Pptx);
            }
            finally
            {
                if (destPres != null) destPres.dispose();
            }
        }
        finally
        {
            if (srcPres != null) srcPres.dispose();
        }
        //ExEnd:CloneAtEndOfAnother
    }
}
