package com.aspose.slides.examples.featurescomparison.presentation.getshapesfromslides;

import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AsposeGetShapesFromSlides
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeGetShapesFromSlides.class);

        // Instantiate a PresentationEx object that represents a PPTX file
        Presentation pres = new Presentation(dataDir + "AutoShapes.pptx");

        ISlide slide =  pres.getSlides().get_Item(0);

        //Accessing source slide shape collection
        IShapeCollection sourceShapes = slide.getShapes();

        //Iterating through all shapes inside the slide
        for (int i = 0; i < sourceShapes.size(); i++)
        {
            System.out.println(sourceShapes.get_Item(i).getWidth() +  " x " + 
                            sourceShapes.get_Item(i).getHeight());
        }
        System.out.println("Done...");
    }
}