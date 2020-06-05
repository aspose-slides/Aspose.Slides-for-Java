package com.aspose.slides.examples.shapes;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class SimpleRectangle
{
    public static void main(String[] args)
    {
        //ExStart:SimpleRectangle
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add autoshape of rectangle type
            sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 150, 50);

            //Write the PPTX file to disk
            pres.save(dataDir + "RectShp1_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SimpleRectangle
    }
}
