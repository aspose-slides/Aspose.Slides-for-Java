package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class CloneToAnotherPresentationWithMaster
{
    public static void main(String[] args)
    {
        //ExStart:CloneToAnotherPresentationWithMaster
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate Presentation class to load the source presentation file

        Presentation srcPres = new Presentation(dataDir + "CloneToAnotherPresentationWithMaster.pptx");
        try
        {
            // Instantiate Presentation class for destination presentation (where slide is to be cloned)
            Presentation destPres = new Presentation();
            try
            {

                // Instantiate ISlide from the collection of slides in source presentation along with
                // Master slide
                ISlide SourceSlide = srcPres.getSlides().get_Item(0);
                IMasterSlide SourceMaster = SourceSlide.getLayoutSlide().getMasterSlide();

                // Clone the desired master slide from the source presentation to the collection of masters in the
                // Destination presentation
                IMasterSlideCollection masters = destPres.getMasters();
                IMasterSlide DestMaster = SourceSlide.getLayoutSlide().getMasterSlide();

                // Clone the desired master slide from the source presentation to the collection of masters in the
                // Destination presentation
                IMasterSlide iSlide = masters.addClone(SourceMaster);

                // Clone the desired slide from the source presentation with the desired master to the end of the
                // Collection of slides in the destination presentation
                ISlideCollection slds = destPres.getSlides();
                slds.addClone(SourceSlide, iSlide, true);

                // Clone the desired master slide from the source presentation to the collection of masters in the // Destination presentation
                // Save the destination presentation to disk
                destPres.save(dataDir + "CloneToAnotherPresentationWithMaster_out.pptx", SaveFormat.Pptx);

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
        //ExEnd:CloneToAnotherPresentationWithMaster
    }
}
