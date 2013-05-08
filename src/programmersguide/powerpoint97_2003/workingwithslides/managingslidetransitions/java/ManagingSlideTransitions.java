/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.managingslidetransitions.java;

import com.aspose.slides.*;

public class ManagingSlideTransitions
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/managingslidetransitions/data/";
        
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Setting the slide transition effect to fade
        slide.getSlideShowTransition().setEntryEffect(SlideTransitionEffect.Fade);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "demo.out.ppt");
        
        //Print Message
        System.out.println("Slide transition applied successfully.");
    }
}