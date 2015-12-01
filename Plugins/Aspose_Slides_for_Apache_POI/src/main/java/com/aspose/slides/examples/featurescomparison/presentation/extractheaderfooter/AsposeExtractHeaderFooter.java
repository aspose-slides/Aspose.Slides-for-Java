package com.aspose.slides.examples.featurescomparison.presentation.extractheaderfooter;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AsposeExtractHeaderFooter
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeExtractHeaderFooter.class);

        // Instantiate a PresentationEx object that represents a PPTX file
        Presentation sourcePres = new Presentation(dataDir + "AsposeHeaderFooter.pptx");

        System.out.println(sourcePres.getHeaderFooterManager().isDateTimeVisible());
        System.out.println(sourcePres.getHeaderFooterManager().isFooterVisible());
        System.out.println(sourcePres.getHeaderFooterManager().isSlideNumberVisible());

        sourcePres.getHeaderFooterManager().setDateTimeVisible(false);
        sourcePres.getHeaderFooterManager().setFooterVisible(false);
        sourcePres.getHeaderFooterManager().setSlideNumberVisible(false);

        System.out.println(sourcePres.getHeaderFooterManager().isDateTimeVisible());
        System.out.println(sourcePres.getHeaderFooterManager().isFooterVisible());
        System.out.println(sourcePres.getHeaderFooterManager().isSlideNumberVisible());

        System.out.println("Done...");
    }
}