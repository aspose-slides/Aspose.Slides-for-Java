/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithslidesinpresentation.creatingslidesthumbnailimage.generatingthumbnailfromslideinnotesslidesview.java;

import com.aspose.slides.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GeneratingThumbnailFromSlideInNotesSlidesView
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithslidesinpresentation/creatingslidesthumbnailimage/generatingthumbnailfromslideinnotesslidesview/data/";
        //Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");

        //Access the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //User defined dimension
        int desiredX = 1200;
        int desiredY = 800;


        //Getting scaled value  of X and Y
        float ScaleX = (float)(1.0 / pres.getSlideSize().getSize().getWidth()) * desiredX;
        float ScaleY = (float)(1.0 / pres.getSlideSize().getSize().getHeight()) * desiredY;


        //Create a full scale image
        BufferedImage image = sld.getNotesSlide().getThumbnail(ScaleX, ScaleY);

        //Save the image to disk in JPEG format
        try
        {
        ImageIO.write(image, "jpeg", new File(dataDir+ "ContentBG_tnail.jpg"));
    }
        catch(IOException e){}
        System.out.println("Program executed successfully");
    }
}




