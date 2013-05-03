/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithslidesinpresentationex.changingthepositionofaslides.java;

import com.aspose.slides.*;

public class ChangingthePositionofaSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithslidesinpresentationex/changingthepositionofaslides/data/";
        
        //Instantiate PresentationEx class to load the source PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Get the slide whose position is to be changed
        SlideEx sld = pres.getSlides().get_Item(0);

        //Set the new position for the slide
        sld.setSlideNumber(2);

        //Write the PPTX to disk
        pres.write(dataDir + "demo.out.pptx");
        
        //Print message
        System.out.println("Position of slide changed successfully. Please check output file.");
    }
}




