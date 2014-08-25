/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithslidesinpresentation.CreatingSlidesSVGImage.java;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingSlidesSVGImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithslidesinpresentation/creatingslidessvgimage/data/";
        //Instantiate a Presentation object that represents a PPTX file
        Presentation pres = new Presentation(dataDir+ "demo.pptx");

        //Getting last slide index
        int lastSlidePosition=pres.getSlides().size();
        ISlide slide =null;
        //Iterating through every presentation slide and generating SVG image
        for (int i = 0; i < lastSlidePosition; i++)
        {
            //Accessing Slides
            slide = pres.getSlides().get_Item(i);

            //Getting and saving the slide SVG image
            try{
                slide.writeAsSvg(new FileOutputStream(dataDir+ "SvgImage" + i+ ".svg"));
            }
            catch(IOException e){}

        }
        System.out.println("Program executed successfully");
    }
}




