/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.settingbackgroundcolor.java;

import com.aspose.slides.*;

public class SettingBackgroundColor
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/settingbackgroundcolor/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Setting the background color to blue
        pres.getMasters().get_Item(0).getBackground().getFillFormat().setForeColor(java.awt.Color.blue);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "MasterSlide.ppt");

        //Instantiate a Presentation object that represents a PPT file
         pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Disable following master background settings
        slide.setFollowMasterBackground(false);

        //Setting the background color to blue
        slide.getBackground().getFillFormat().setForeColor(java.awt.Color.blue);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "NormalSlide.ppt");

        //Printing the status
        System.out.println("Setting Background Color Completed!");
    }
}




