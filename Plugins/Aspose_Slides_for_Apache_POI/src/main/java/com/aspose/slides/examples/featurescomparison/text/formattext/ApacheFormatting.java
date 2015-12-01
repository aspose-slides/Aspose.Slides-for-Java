package com.aspose.slides.examples.featurescomparison.text.formattext;

import java.awt.Color;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextBox;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;

import com.aspose.slides.examples.Utils;

public class ApacheFormatting
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheFormatting.class);

        XMLSlideShow ppt = new XMLSlideShow();
        XSLFSlide slide = ppt.createSlide();

        XSLFTextBox shape = slide.createTextBox();
        XSLFTextParagraph p = shape.addNewTextParagraph();

        XSLFTextRun r1 = p.addNewTextRun();
        r1.setText("The");
        r1.setFontColor(Color.blue);
        r1.setFontSize(24.00);

        XSLFTextRun r2 = p.addNewTextRun();
        r2.setText(" quick");
        r2.setFontColor(Color.red);
        r2.setBold(true);

        XSLFTextRun r3 = p.addNewTextRun();
        r3.setText(" brown");
        r3.setFontSize(12.00);
        r3.setItalic(true);
        r3.setStrikethrough(true);

        XSLFTextRun r4 = p.addNewTextRun();
        r4.setText(" fox");
        r4.setUnderline(true);

        //save changes in a file
        FileOutputStream out = new FileOutputStream(dataDir + "Formatted_Text_Apache_Out.pptx");
        ppt.write(out);
        out.close();

        System.out.println("Presentation Formatted and Saved.");
    }
}