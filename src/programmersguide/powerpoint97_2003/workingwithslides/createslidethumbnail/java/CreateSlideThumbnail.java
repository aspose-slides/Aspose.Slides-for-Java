/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.createslidethumbnail.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.Slide;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class CreateSlideThumbnail
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/createslidethumbnail/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Getting the thumbnail image of the slide of a specified size
        BufferedImage image = slide.getThumbnail(new Dimension (500, 400));

        //Saving the thumbnail image in jpeg format
        ImageIO.write(image,"jpeg", new File(dataDir + "thumbnail.jpg"));

        //Printing the status
        System.out.println("Thumbnail created successfully!");
    }
}




