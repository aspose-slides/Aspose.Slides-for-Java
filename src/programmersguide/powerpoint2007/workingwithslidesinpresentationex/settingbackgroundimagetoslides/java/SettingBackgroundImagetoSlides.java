/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithslidesinpresentationex.settingbackgroundimagetoslides.java;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.*;

public class SettingBackgroundImagetoSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithslidesinpresentationex/settingbackgroundimagetoslides/data/";
      
        //Instantiate the PresentationEx class that represents the PPTX file
        PresentationEx pres = new PresentationEx();

        //Set the background with Image
        pres.getSlides().get_Item(0).getBackground().setType (BackgroundTypeEx.OwnBackground);
        pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(FillTypeEx.Picture);
        pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillModeEx.Stretch);

        //Creating a Buffered Image object to hold the image file
        BufferedImage image=null;

        try 
        {
            image = ImageIO.read(new File(dataDir + "aspose.jpg"));
        } 
        catch (IOException e) 
        {
        	//Print message
            System.out.println("Background image (aspose.jpg) is not present in data folder.");
        }

        ImageEx imgx = pres.getImages().addImage(image);
        pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().getPicture().setImage(imgx);

        //Write the PPTX to disk
        pres.write(dataDir + "demo.out.pptx");
        
        //Print message
        System.out.println("Background is set for slide. Please check output file.");
    }
}




