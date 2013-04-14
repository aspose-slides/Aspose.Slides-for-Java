/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithslidesinpresentationex.addingslidestopresentationex.java;

import com.aspose.slides.*;

public class AddingSlidesToPresentationEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithslidesinpresentationex/addingslidestopresentationex/data/";

        //Instantiate PresentationEx class that represents the PPTX file
        PresentationEx pres = new PresentationEx();

        //Instantiate SlidesEx calss
        SlidesEx slds = pres.getSlides();

        //Add an empty slide to the SlidesEx collection
        slds.addEmptySlide(pres.getLayoutSlides().get_Item(0));

        //Save the PPTX file to the Disk
        pres.write(dataDir + "EmptySlide.pptx");

        //Printing the status
        System.out.println("Slide added successfully!");

    }
}




