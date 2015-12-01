package com.aspose.slides.examples.featurescomparison.presentation.createheaderfooter;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.HeadersFooters;
import org.apache.poi.hslf.usermodel.SlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheCreateHeaderFooter
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheCreateHeaderFooter.class);

        SlideShow ppt = new SlideShow();

        ppt.createSlide();

        //presentation-scope headers / footers
        HeadersFooters hf = ppt.getSlideHeadersFooters();
        hf.setSlideNumberVisible(true);
        hf.setFootersText("Created by POI-HSLF");
        
        FileOutputStream out = new FileOutputStream(dataDir + "ApacheHeaderFooter.ppt");
        ppt.write(out);
        out.close();
	  
        System.out.println("Done...");
    }
}