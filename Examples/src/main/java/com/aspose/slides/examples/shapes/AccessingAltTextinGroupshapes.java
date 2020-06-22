package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AccessingAltTextinGroupshapes
{
    public static void main(String[] args)
    {
        //ExStart:AccessingAltTextinGroupshapes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate Presentation class that represents PPTX file
        Presentation pres = new Presentation(dataDir + "AltText.pptx");

        // Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        for (int i = 0; i < sld.getShapes().size(); i++)
        {
            // Accessing the shape collection of slides
            IShape shape = sld.getShapes().get_Item(i);

            if (shape instanceof GroupShape)
            {
                // Accessing the group shape.
                IGroupShape grphShape = (IGroupShape) shape;
                for (int j = 0; j < grphShape.getShapes().size(); j++)
                {
                    IShape shape2 = grphShape.getShapes().get_Item(j);
                    // Accessing the AltText property
                    System.out.println(shape2.getAlternativeText());
                }
            }
        }
        //ExEnd:AccessingAltTextinGroupshapes
    }
}




