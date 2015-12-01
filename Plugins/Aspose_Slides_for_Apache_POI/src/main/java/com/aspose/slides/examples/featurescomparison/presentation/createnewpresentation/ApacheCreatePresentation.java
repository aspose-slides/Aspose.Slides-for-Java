package com.aspose.slides.examples.featurescomparison.presentation.createnewpresentation;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheCreatePresentation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheCreatePresentation.class);

        //create a new empty slide show
        SlideShow ppt = new SlideShow();
        //add first slide
        Slide s1 = ppt.createSlide();
        //save changes in a file
        FileOutputStream out = new FileOutputStream(dataDir + "NewPPT_Apache_Out.ppt");
        ppt.write(out);
        out.close();

        //Printing the status
        System.out.println("Presentation Created successfully!");
    }
}
