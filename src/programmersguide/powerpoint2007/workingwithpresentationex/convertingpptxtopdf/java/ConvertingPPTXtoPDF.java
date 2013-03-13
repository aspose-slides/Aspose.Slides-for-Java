/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithpresentationex.convertingpptxtopdf.java;

import com.aspose.slides.*;

public class ConvertingPPTXtoPDF
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithpresentationex/convertingpptxtopdf/data/";

        // 1.
        // Conversion to PDF using default options.

        //Instantiate a PresentationEx object that represents a PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Saving the PPTX presentation to PDF document
        pres.save(dataDir + "demo1.pdf", com.aspose.slides.SaveFormat.Pdf);

        //Display result of conversion.
        System.out.println("Conversion to PDF performed successfully with default options!");

        // 2.
        // Conversion to PDF using custom options.

        //Instantiate the PdfOptions class
        com.aspose.slides.PdfOptions opts = new com.aspose.slides.PdfOptions();

        //Set Jpeg Quality
        opts.setJpegQuality((byte) 90);

        //Define behavior for meta files
        opts.setSaveMetafilesAsPng(true);

        //Set Text Compression level
        opts.setTextCompression(com.aspose.slides.PdfTextCompression.Flate);

        //Define the PDF standard
        opts.setCompliance(com.aspose.slides. PdfCompliance.Pdf15);

        //Save the presentation to PDF with specified options
        pres.save(dataDir + "demo2.pdf", com.aspose.slides.SaveFormat.Pdf, opts);

        //Display result of conversion.
        System.out.println("Conversion to PDF performed successfully with custom options!");
    }
}




