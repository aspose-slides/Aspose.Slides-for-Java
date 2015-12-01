package com.aspose.slides.examples.featurescomparison.text.hyperlinks;

import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFHyperlink;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextBox;
import org.apache.poi.xslf.usermodel.XSLFTextRun;

import com.aspose.slides.examples.Utils;

public class ApacheHyperlink
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheHyperlink.class);

        XMLSlideShow ppt = new XMLSlideShow();
        XSLFSlide slide = ppt.createSlide();

        // assign a hyperlink to a text run
        XSLFTextBox shape = slide.createTextBox();
        XSLFTextRun r = shape.addNewTextParagraph().addNewTextRun();
        r.setText("Apache POI");
        XSLFHyperlink link = r.createHyperlink();
        link.setAddress("http://poi.apache.org");

        //save changes 
        FileOutputStream out = new FileOutputStream(dataDir + "Apache_Hyperlink_Out.ppt");
        ppt.write(out);
        out.close();

        System.out.println("Presentation with hyperlink Saved.");
    }
}
