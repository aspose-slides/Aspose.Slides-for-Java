package com.aspose.slides.examples.shapes;

import com.aspose.slides.IImage;
import com.aspose.slides.ImageFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;



public class CreateShapeThumbnail
{
    public static void main(String[] args)
    {
        //ExStart:CreateShapeThumbnail
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate a Presentation class that represents the presentation file
        Presentation presentation = new Presentation(dataDir + "HelloWorld.pptx");
        try
        {
            // Create a full scale image
            IImage img = presentation.getSlides().get_Item(0).getShapes().get_Item(0).getImage();
            // Save the image to disk in PNG format
            img.save(dataDir + "Shape_thumbnail_out.png", ImageFormat.Png);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:CreateShapeThumbnail
    }
}



