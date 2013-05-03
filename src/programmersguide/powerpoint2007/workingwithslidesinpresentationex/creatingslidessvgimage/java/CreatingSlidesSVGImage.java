/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithslidesinpresentationex.creatingslidessvgimage.java;

import java.io.FileOutputStream;

import com.aspose.slides.*;

public class CreatingSlidesSVGImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithslidesinpresentationex/creatingslidessvgimage/data/";
      
        //Instantiate a Presentation object that represents a PPTX file        
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Getting last slide index
        int lastSlidePosition=pres.getSlides().getCount();
        SlideEx slide =null;
        //Iterating through every presentation slide and generating SVG image
        for (int i = 0; i < lastSlidePosition; i++) 
        {
        	//Accessing Slides
        	slide = pres.getSlides().get_Item(i);

            //Getting and saving the slide SVG image
        	slide.writeAsSvg(new FileOutputStream(dataDir + "demo-" + i + ".out.svg"));
        }
        
        //Print message
        System.out.println("SVG images of slides created successfully. Check output file(s).");
    }
}




