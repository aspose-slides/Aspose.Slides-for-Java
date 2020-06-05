package com.aspose.slides.examples.shapes;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class FindShapeInSlide
{
    //ExStart:FindShapeInSlide
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate a Presentation class that represents the presentation file
        Presentation p = new Presentation(dataDir + "FindingShapeInSlide.pptx");
        try
        {

            ISlide slide = p.getSlides().get_Item(0);
            // Alternative text of the shape to be found
            IShape shape = findShape(slide, "Shape1");
            if (shape != null)
            {
                System.out.println("Shape Name: " + shape.getName());
            }
        }
        finally
        {
            if (p != null) p.dispose();
        }
    }

    // Method implementation to find a shape in a slide using its alternative text
    public static IShape findShape(ISlide slide, String alttext)
    {
        // Iterating through all shapes inside the slide
        for (int i = 0; i < slide.getShapes().size(); i++)
        {
            // If the alternative text of the slide matches with the required one then
            // Return the shape
            if (slide.getShapes().get_Item(i).getAlternativeText().compareTo(alttext) == 0)
                return slide.getShapes().get_Item(i);
        }
        return null;
    }
    //ExEnd:FindShapeInSlide
}


