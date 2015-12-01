package com.aspose.slides.examples.featurescomparison.slides.createbulletedlists;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.RichTextRun;
import org.apache.poi.hslf.usermodel.SlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheCreateBulletList
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheCreateBulletList.class);

        SlideShow ppt = new SlideShow();

        Slide slide = ppt.createSlide();

        TextBox shape = new TextBox();
        RichTextRun rt = shape.getTextRun().getRichTextRuns()[0];
        shape.setText(
                "January\r" +
                "February\r" +
                "March\r" +
                "April");
        rt.setFontSize(42);
        rt.setBullet(true);
        rt.setBulletOffset(0);  //bullet offset
        rt.setTextOffset(50);   //text offset (should be greater than bullet offset)
        rt.setBulletChar('\u263A'); //bullet character
        slide.addShape(shape);

        shape.setAnchor(new java.awt.Rectangle(50, 50, 500, 300));  //position of the text box in the slide
        slide.addShape(shape);

        FileOutputStream out = new FileOutputStream(dataDir + "ApacheBullets.ppt");
        ppt.write(out);
        out.close();

        System.out.println("Done...");
    }
}