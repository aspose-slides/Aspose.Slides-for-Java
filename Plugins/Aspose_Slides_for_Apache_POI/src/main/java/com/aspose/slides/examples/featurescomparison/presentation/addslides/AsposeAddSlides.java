package com.aspose.slides.examples.featurescomparison.presentation.addslides;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeAddSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeAddSlides.class);

        //Instantiate a PresentationEx object that represents a PPTX file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        //Add Slide
        ISlide slide = pres.getSlides().addEmptySlide(pres.getLayoutSlides().get_Item(0));

        //Save the presentation
        pres.save(dataDir + "SlidesAdded_Aspose_Out.pptx", SaveFormat.Pptx);

        System.out.println("Slide Added and Saved.");
    }
}