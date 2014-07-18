/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.convertingpresentationtotiff.convertingwithcustomsize.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TiffCompressionTypes;
import com.aspose.slides.TiffOptions;

public class ConvertingWithCustomSize
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/convertingpresentationtotiff/convertingwithcustomsize/data/";
        //Instantiate a Presentation object that represents a Presentation file
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");

        //Instantiate the TiffOptions class
        TiffOptions opts = new TiffOptions();

        //Setting compression type
        opts.setCompressionType ( TiffCompressionTypes.Default);

        //Compression Types

        //Default - Specifies the default compression scheme (LZW).
        //None - Specifies no compression.
        //CCITT3
        //CCITT4
        //LZW
        //RLE

        //Depth – depends on the compression type and cannot be set manually.
        //Resolution unit – is always equal to “2” (dots per inch)

        //Setting image DPI
        opts.setDpiX ( 200);
        opts.setDpiY (100);

        //Set Image Size
        opts.setImageSize(new java.awt.Dimension(1728, 1078));

        //Save the presentation to TIFF with specified image size
        pres.save(dataDir+ "demo.tiff", SaveFormat.Tiff,opts);
        System.out.println("Program executed successfully");
    }
}




