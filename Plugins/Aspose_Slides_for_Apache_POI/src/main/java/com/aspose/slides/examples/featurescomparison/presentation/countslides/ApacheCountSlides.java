package com.aspose.slides.examples.featurescomparison.presentation.countslides;

import java.io.FileInputStream;

import org.apache.poi.hslf.usermodel.SlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheCountSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheCountSlides.class);

        SlideShow ppt = new SlideShow(new FileInputStream(dataDir + "presentation.ppt"));
        System.out.println("Total Slides in Count: " + ppt.getSlides().length);
    }
}
