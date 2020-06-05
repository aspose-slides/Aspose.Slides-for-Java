package com.aspose.slides.examples.smartarts;

import com.aspose.slides.IShape;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class AccessSmartArtShape
{
    public static void main(String[] args)
    {
        //ExStart:AccessSmartArtShape
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Load the desired the presentation
        Presentation pres = new Presentation(dataDir + "AccessSmartArtShape.pptx");
        try
        {

            // Traverse through every shape inside first slide
            for (IShape shape : pres.getSlides().get_Item(0).getShapes())
            {
                // Check if shape is of SmartArt type
                if (shape instanceof ISmartArt)
                {
                    // Typecast shape to SmartArtEx
                    ISmartArt smart = (ISmartArt) shape;
                    System.out.println("Shape Name:" + smart.getName());

                }
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessSmartArtShape
    }
}
