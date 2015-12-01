package com.aspose.slides.examples.featurescomparison.slides.moveslide;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

import com.aspose.slides.examples.Utils;

public class ApacheMoveSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheMoveSlides.class);

        XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(dataDir + "presentation.pptx"));

        //add slides
        ppt.createSlide();
        ppt.createSlide();
        ppt.createSlide();

        XSLFSlide[] slides = ppt.getSlides();
        ppt.setSlideOrder(slides[0], 4); 

        //save changes in a file
        FileOutputStream out = new FileOutputStream(dataDir + "Apache_ReOrdered_Slides_Out.pptx");
        ppt.write(out);
        out.close();

        System.out.println("Slides ReOrdered Successfuly.");
    }
}