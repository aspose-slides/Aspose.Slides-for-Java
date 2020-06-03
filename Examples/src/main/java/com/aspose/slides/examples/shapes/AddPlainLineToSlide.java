package com.aspose.slides.examples.shapes;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class AddPlainLineToSlide
{
    public static void main(String[] args)
    {
        //ExStart:AddPlainLineToSlide
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate PresentationEx class that represents the PPTX file
        Presentation pres = new Presentation();
        try
        {
            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add an autoshape of type line
            sld.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);

            //Write the PPTX to Disk
            pres.save(dataDir + "LineShape1_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddPlainLineToSlide
    }
}
