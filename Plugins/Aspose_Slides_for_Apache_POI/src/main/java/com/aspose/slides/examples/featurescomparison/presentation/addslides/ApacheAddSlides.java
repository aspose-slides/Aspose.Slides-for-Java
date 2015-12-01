package com.aspose.slides.examples.featurescomparison.presentation.addslides;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheAddSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheAddSlides.class);

            //create a new empty slide show
        SlideShow ppt = new SlideShow();

        //add first slide
        Slide s1 = ppt.createSlide();

        //add second slide
        Slide s2 = ppt.createSlide();

        //save changes in a file
        FileOutputStream out = new FileOutputStream(dataDir + "AddSlides_Apache_Out.ppt");
        ppt.write(out);
        out.close();

        System.out.println("Slide Added and Saved.");
    }
}
