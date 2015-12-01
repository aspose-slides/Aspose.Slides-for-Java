package com.aspose.slides.examples.featurescomparison.presentation.deleteslides;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheDeleteSlides
{
    public static void main(String[] args)throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheDeleteSlides.class);

        XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(dataDir + "presentation.pptx"));

        ppt.removeSlide(0); // 0-based index of a slide to be removed

        FileOutputStream out = new FileOutputStream(dataDir + "DeleteSlide_Apache_Out.ppt");
        ppt.write(out);
        out.close();

        //Printing the status
        System.out.println("Slide removed successfully!");
    }
}
