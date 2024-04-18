package com.aspose.slides.examples.shapes;

import com.aspose.slides.IImage;
import com.aspose.slides.ImageFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.ShapeThumbnailBounds;
import com.aspose.slides.examples.RunExamples;


public class CreateScalingFactorThumbnail
{
    public static void main(String[] args)
    {
        //ExStart:CreateScalingFactorThumbnail
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate a Presentation class that represents the presentation file
        Presentation p = new Presentation(dataDir + "HelloWorld.pptx");
        try
        {
            // Create a full scale image
            IImage bitmap = p.getSlides().get_Item(0).getShapes().get_Item(0).getImage(ShapeThumbnailBounds.Shape, 1, 1);

            // Save the image to disk in PNG format
            bitmap.save(dataDir + "Scaling Factor Thumbnail_out.png", ImageFormat.Png);
        }
        finally
        {
            if (p != null) p.dispose();
        }
        //ExEnd:CreateScalingFactorThumbnail
    }
}




