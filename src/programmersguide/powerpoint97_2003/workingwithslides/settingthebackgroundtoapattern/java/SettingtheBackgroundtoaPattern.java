/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.settingthebackgroundtoapattern.java;

import java.awt.Color;

import com.aspose.slides.*;

public class SettingtheBackgroundtoaPattern
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/settingthebackgroundtoapattern/data/";
        
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Disable following master background settings
        slide.setFollowMasterBackground(false);

        //Setting the fill type of the background to pattern
        slide.getBackground().getFillFormat().setType(FillType.Pattern);

        //Setting the background color of the slide to silver
        slide.getBackground().getFillFormat().setBackColor(Color.gray);

        //Setting the foreground color of the slide to royal blue
        slide.getBackground().getFillFormat().setForeColor(Color.blue);

        //Setting the pattern style of the slide background to LargeConfetti
        slide.getBackground().getFillFormat().setPatternStyle(PatternStyle.LargeConfetti);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "demo.out.ppt");     
        
        //Print Message
        System.out.println("Background set successfully.");
    }
}