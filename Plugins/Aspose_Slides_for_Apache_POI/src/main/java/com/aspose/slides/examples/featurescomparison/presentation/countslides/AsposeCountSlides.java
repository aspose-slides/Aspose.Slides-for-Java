package com.aspose.slides.examples.featurescomparison.presentation.countslides;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AsposeCountSlides
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeCountSlides.class);

        //Instantiate a PresentationEx object that represents a PPTX file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        System.out.println("Total Slides in Count: " + pres.getSlides().size());
    }
}
