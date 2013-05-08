/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.settingthebackgroundcolortoagradient.java;

import com.aspose.slides.*;

public class SettingtheBackgroundColortoaGradient
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/settingthebackgroundcolortoagradient/data/";
        
        //========================================================
        // Setting the Background Color with Simple Gradient Effect
        //========================================================

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Disable following master background settings
        slide.setFollowMasterBackground(false);

        //Setting the fill type of the background to gradient
        slide.getBackground().getFillFormat().setType(FillType.Gradient);

        //Setting the background color to blue
        slide.getBackground().getFillFormat().setForeColor(java.awt.Color.blue);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "demo.1.out.ppt");
        
        //========================================================
        // Setting the Background Color with Better Gradient Effect
        //========================================================
        
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres2 = new Presentation(dataDir + "demo.ppt");
        
        //Accessing a slide using its slide position
        Slide slide2 = pres2.getSlideByPosition(1);

        //Disable following master background settings
        slide2.setFollowMasterBackground(false);

        //Setting the fill type of the background to gradient
        slide2.getBackground().getFillFormat().setType(FillType.Gradient);

        //Setting the type of the gradient color
        slide2.getBackground().getFillFormat().setGradientColorType(GradientColorType.OneColor);

        //Setting the gradient style
        slide2.getBackground().getFillFormat().setGradientStyle(GradientStyle.FromCenter);

        //Setting the background color to blue
        slide2.getBackground().getFillFormat().setForeColor(java.awt.Color.blue);

        //Setting the degree of the gradient
        slide2.getBackground().getFillFormat().setGradientDegree((byte)18);

        //Writing the presentation as a PPT file
        pres2.write(dataDir + "demo.2.out.ppt");
        
        //Print Message
        System.out.println("Gradients applied successfully.");
    }
}