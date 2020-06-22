package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class AddRelativeScaleHeightPictureFrame
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:AddRelativeScaleHeightPictureFrame
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate presentation object
        Presentation presentation = new Presentation();
        try
        {

            // Load Image to be added in presentaiton image collection
            BufferedImage img = ImageIO.read(new File(dataDir + "aspose-logo.jpg"));
            IPPImage image = presentation.getImages().addImage(img);

            // Add picture frame to slide
            IPictureFrame pf = presentation.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 50, 50, 100, 100, image);

            // Setting relative scale width and height
            pf.setRelativeScaleHeight(0.8f);
            pf.setRelativeScaleWidth(1.35f);

            // Save presentation
            presentation.save(dataDir + "Adding Picture Frame with Relative Scale_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddRelativeScaleHeightPictureFrame
    }
}


