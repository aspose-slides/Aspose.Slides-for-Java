/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithshapesex.findingshapeinslideex.java;

import com.aspose.slides.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FindingShapeInSlideEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithshapesex/findingshapeinslideex/data/";

        //Instantiate PresentationEx class that represents the PPTX
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Get the first slide
        SlideEx slide = pres.getSlides().get_Item(0);

        //Calling FindShape method and passing the slide reference with the
        //alternative text of the shape to be found

        ShapeEx shape  = FindShape(slide, "Slides");

        if (shape != null)
        {
            System.out.println("Shape Name: " + shape.getName());
            System.out.println("Shape Height: " + shape.getHeight());
            System.out.println("Shape Width: " + shape.getWidth());
        }

    }

    //Method implementation to find a shape in a slide using its alternative text
    public static ShapeEx FindShape(SlideEx slide, String alttext)
    {
        //Iterating through all shapes inside the slide
        for (int i = 0; i < slide.getShapes().getCount(); i++)
        {


            //If the alternative text of the slide matches with the required one then
            //return the shape
            if (slide.getShapes().get_Item(i).getAlternativeText().equals(alttext))
                return slide.getShapes().get_Item(i);
        }
        return null;
    }

}




