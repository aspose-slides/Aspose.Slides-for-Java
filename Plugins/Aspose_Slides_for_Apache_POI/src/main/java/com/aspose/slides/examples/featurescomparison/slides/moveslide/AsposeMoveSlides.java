package com.aspose.slides.examples.featurescomparison.slides.moveslide;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeMoveSlides
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeMoveSlides.class);

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "presentation.ppt");

        //Accessing a slide using its slide position
        ISlide slide = pres.getSlides().get_Item(0);

        //Change the position of the selected slide
        slide.setSlideNumber(2);

        //Writing the presentation as a PPT file
        pres.save(dataDir + "Aspose_ReOrdered_Slides_Out.ppt", SaveFormat.Ppt);
        System.out.println("Slides ReOrdered Successfuly.");
    }
}
