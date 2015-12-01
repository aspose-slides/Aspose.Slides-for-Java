package com.aspose.slides.examples.featurescomparison.slides.convertslidetoimage;

import java.awt.Dimension;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TiffOptions;

import com.aspose.slides.examples.Utils;

public class AsposeConvertToImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeConvertToImage.class);

        //Instantiate a PresentationEx object that represents a PPTX file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        //Instantiate the TiffOptions class
        TiffOptions opts = new TiffOptions();

        //Set Image Size
        opts.setImageSize(new Dimension(500, 400));

        //Save the prsentation to TIFF with specified image size
        pres.save(dataDir + "Aspose_PPT-TIFF_Out.tiff", SaveFormat.Tiff, opts);

        System.out.println("Slide Converted to Image Successfully");
    }
}
