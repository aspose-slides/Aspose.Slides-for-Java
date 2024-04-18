package com.aspose.slides.examples.shapes;

import com.aspose.slides.IImage;
import com.aspose.slides.Presentation;
import com.aspose.slides.ShapeThumbnailBounds;
import com.aspose.slides.examples.RunExamples;



public class CreateBoundsShapeThumbnail
{
    public static void main(String[] args)
    {
        //ExStart:CreateBoundsShapeThumbnail
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate a Presentation class that represents the presentation file
        Presentation presentation = new Presentation(dataDir + "HelloWorld.pptx");
        try
        {
            // Create a Appearance bound shape image
            IImage bitmap = presentation.getSlides().get_Item(0).getShapes().get_Item(0).getImage(ShapeThumbnailBounds.Appearance, 1, 1);

            // Save the image to disk in PNG format
            bitmap.save(dataDir + "Shape_thumbnail_Bound_Shape_out.png");
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:CreateBoundsShapeThumbnail
    }
}




