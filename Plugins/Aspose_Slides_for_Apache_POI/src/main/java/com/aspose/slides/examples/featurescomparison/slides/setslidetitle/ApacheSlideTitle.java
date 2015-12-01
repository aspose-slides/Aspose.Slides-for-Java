package com.aspose.slides.examples.featurescomparison.slides.setslidetitle;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.SlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheSlideTitle
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheSlideTitle.class);

        SlideShow ppt = new SlideShow();
        Slide slide = ppt.createSlide();
        TextBox title = slide.addTitle();
        title.setText("Hello, World!");
	    
        //save changes 
        FileOutputStream out = new FileOutputStream(dataDir + "Apache_SlideTitle_Out.ppt");
        ppt.write(out);
        out.close();

        System.out.println("Presentation with Title Saved.");
    }
}