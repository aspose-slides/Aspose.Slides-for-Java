/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithslidesinpresentationex.createslidethumbnail.java;

import com.aspose.slides.PresentationEx;
import com.aspose.slides.SlideEx;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class CreateSlideThumbnail
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithslidesinpresentationex/createslidethumbnail/data/";

        //Instantiate a PresentationEx class that represents the PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Access the first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        //Create a full scale image
        BufferedImage image = sld.getThumbnail(1f, 1f);

        //Save the image to disk in JPEG format
        ImageIO.write(image,"jpeg",new File(dataDir + "thumbnail.jpg"));

        //Printing the status
        System.out.println("Thumbnail created successfully!");
    }
}




