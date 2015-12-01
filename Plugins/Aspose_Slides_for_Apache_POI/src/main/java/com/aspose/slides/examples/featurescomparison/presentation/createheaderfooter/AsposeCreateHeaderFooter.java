package com.aspose.slides.examples.featurescomparison.presentation.createheaderfooter;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeCreateHeaderFooter
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeCreateHeaderFooter.class);

        Presentation sourcePres = new Presentation();

        //Setting Footer visibility properties
        sourcePres.setUpdateSlideNumberFields(true);

        //Update the Date Time Fields
        sourcePres.setUpdateDateTimeFields(true);

        //Show date time placeholder
        sourcePres.getHeaderFooterManager().setDateTimeVisible(true);

        //Show the footer place holder
        sourcePres.getHeaderFooterManager().setFooterVisible(true);

        //Show Slide Number
        sourcePres.getHeaderFooterManager().setSlideNumberVisible(true);

        //Set the  header footer visibility on Title Slide
        sourcePres.getHeaderFooterManager().setVisibilityOnTitleSlide(true);

        sourcePres.getHeaderFooterManager().setFooterText("Aspose Slides");

        //Write the presentation to the disk
        sourcePres.save(dataDir + "AsposeHeaderFooter.pptx", SaveFormat.Pptx);

        System.out.println("Done...");
    }
}