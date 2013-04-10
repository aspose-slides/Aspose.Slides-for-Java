/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.cloningaslide.java;

import com.aspose.slides.*;

public class CloningASlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/cloningaslide/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Cloning the selected slide at the end of the same presentation file
        pres.cloneSlide(slide, pres.getSlides().getLastSlidePosition() + 1);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "CloneSlide1.ppt");

        //Instantiate a Presentation where the cloned slide will be added
        Presentation pres2 = new Presentation(dataDir + "demo2.ppt");

        //Creating TreeMap object that is used to store the temporary information
        //about the masters of PPT file. No value should be added to it.
        com.aspose.slides.Collections.SortedList sList=new com.aspose.slides.Collections.SortedList();


        //Cloning the selected slide at the end of another presentation file
        pres.cloneSlide(slide,pres.getSlides().getLastSlidePosition() + 1,pres2, sList);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "CloneSlide2.ppt");

        //Printing the status
        System.out.println("Clones Completed successfully!");
    }
}




