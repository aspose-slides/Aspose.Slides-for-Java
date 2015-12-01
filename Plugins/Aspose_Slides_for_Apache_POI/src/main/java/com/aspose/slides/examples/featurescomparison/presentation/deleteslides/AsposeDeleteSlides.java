package com.aspose.slides.examples.featurescomparison.presentation.deleteslides;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeDeleteSlides
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeDeleteSlides.class);

        //Instantiate a PresentationEx object that represents a PPTX file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        pres.getSlides().removeAt(1); //Removing a slide using its index

        //===========================================================
        //Accessing a slide using its index in the slides collection
        ISlide slide = pres.getSlides().get_Item(0);
        pres.getSlides().remove(slide); //Removing a slide using its reference

        //Writing the presentation as a PPTX file
        pres.save(dataDir + "DeleteSlides_Aspose_Out.pptx", SaveFormat.Pptx);

        //Printing the status
        System.out.println("Slide removed successfully!");
    }
}