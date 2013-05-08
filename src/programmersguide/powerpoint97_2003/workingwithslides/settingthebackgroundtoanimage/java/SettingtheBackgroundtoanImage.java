/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.settingthebackgroundtoanimage.java;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.*;

public class SettingtheBackgroundtoanImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/settingthebackgroundtoanimage/data/";
        
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Disable following master background settings
        slide.setFollowMasterBackground(false);

        //Setting the fill type of the background to picture
        slide.getBackground().getFillFormat().setType(FillType.Picture);

        //Creating a Buffered Image object to hold the image file
        BufferedImage image=null;

        try 
        {
            image = ImageIO.read(new File(dataDir + "demo.jpg"));
        } 
        catch (IOException e) 
        {
        	//Print Message
            System.out.println("Background image not found.");
        }

        //Creating a picture object that will be used as a slide background
        com.aspose.slides.Picture pic = new com.aspose.slides.Picture(pres,image);

        //Adding the picture object to pictures collection of the presentation
        //After the picture object is added, the picture is given a unique picture Id
        int picId = pres.getPictures().add(pic);

        //Setting the picture Id of the slide background to the Id of the picture object
        slide.getBackground().setPictureId(picId);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "demo.out.ppt");
        
        //Print Message
        System.out.println("Background set successfully.");
    }
}