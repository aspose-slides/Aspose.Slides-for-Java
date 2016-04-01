package com.aspose.slides.examples.featurescomparison.slides.removeslide;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeRemoveSlide
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeRemoveSlide.class);

        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        //Accessing a slide using its index in the slides collection
        ISlide slide = pres.getSlides().get_Item(1);

        //Removing a slide using its reference
        pres.getSlides().remove(slide);

        //Removing a slide using its slide index
        pres.getSlides().removeAt(0);

        //Writing the presentation file
        pres.save(dataDir + "RemovedSlide-Aspose.pptx",SaveFormat.Pptx);

        //Printing the status
        System.out.println("Slides removed successfully!");
    }
}