/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.findingashapeinaslide.java;

import com.aspose.slides.*;

public class FindingaShapeinaSlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/findingashapeinaslide/data/";
        
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);
        
        //Calling FindShape method and passing the slide reference with the alternative text of the shape to be found
        Shape shape = new FindingaShapeinaSlide().findShape(slide, "Shape1");
        
        //Print Message
        if (shape != null)
        {
        	System.out.println("Shape found with alternate text as 'Shape1'");
        }
        else
        {
        	System.out.println("= No such shape found with alternate text as 'Shape1' =");	
        }
    }
    //==============================================================================
    //Method implementation to find a shape in a slide using its alternative text
    //==============================================================================
    private Shape findShape(Slide slide, String alttext)
    {
        //Iterating through all shapes inside the slide
        for (int i = 0; i < slide.getShapes().getCount(); i++)
        {
            //If the alternative text of the slide matches with the required one then return the shape

        	if (slide.getShapes().get_Item(i).getAlternativeText().equals(alttext))
        	{
                return slide.getShapes().get_Item(i);
        	}
        }
        return null;
    }
}