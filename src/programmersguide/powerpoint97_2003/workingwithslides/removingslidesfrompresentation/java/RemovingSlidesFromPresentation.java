/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.removingslidesfrompresentation.java;

import com.aspose.slides.*;

public class RemovingSlidesFromPresentation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/removingslidesfrompresentation/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(2);

        //Removing a slide using its reference
        pres.getSlides().remove(slide);

        //Removing a slide using its slide index
        pres.getSlides().removeAt(1);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "modified.ppt");

        //Printing the status
        System.out.println("Slides removed successfully!");

    }
}




