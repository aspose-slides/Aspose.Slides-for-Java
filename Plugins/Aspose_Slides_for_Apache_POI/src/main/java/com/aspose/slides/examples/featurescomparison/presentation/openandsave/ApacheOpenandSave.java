package com.aspose.slides.examples.featurescomparison.presentation.openandsave;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

import com.aspose.slides.examples.Utils;

public class ApacheOpenandSave
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheOpenandSave.class);

        XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(dataDir + "presentation.pptx"));

        //append a new slide to the end
        XSLFSlide blankSlide = ppt.createSlide();

        //save changes in a file
        FileOutputStream out = new FileOutputStream(dataDir + "EditedPPT_Apache_Out.pptx");
        ppt.write(out);
        out.close();

        System.out.println("Presentation Edited and Saved.");
    }
}
