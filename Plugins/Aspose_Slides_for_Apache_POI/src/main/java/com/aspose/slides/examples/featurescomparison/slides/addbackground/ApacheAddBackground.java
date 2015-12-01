package com.aspose.slides.examples.featurescomparison.slides.addbackground;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Fill;
import org.apache.poi.hslf.model.Picture;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.SlideMaster;
import org.apache.poi.hslf.usermodel.SlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheAddBackground
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheAddBackground.class);

        SlideShow ppt = new SlideShow();

        //add first slide
        Slide s1 = ppt.createSlide();

        SlideMaster master = ppt.getSlidesMasters()[0];

        Fill fill = master.getBackground().getFill();
        int idx = ppt.addPicture(new File(dataDir + "background.jpg"), Picture.JPEG);
        fill.setFillType(Fill.FILL_PICTURE);
        fill.setPictureData(idx);

        //save changes in a file
        FileOutputStream out = new FileOutputStream(dataDir + "AddBG_Apache_Out.ppt");
        ppt.write(out);
        out.close();

        System.out.println("Background Added.");
    }
}