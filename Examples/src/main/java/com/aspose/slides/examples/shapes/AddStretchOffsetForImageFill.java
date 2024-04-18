package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AddStretchOffsetForImageFill
{
    public static void main(String[] args)
    {
        //ExStart:AddStretchOffsetForImageFill
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();
        String outputDir = RunExamples.getOutPath();

        // Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Instantiate the ImageEx class
            IImage img = Images.fromFile(dataDir + "aspose-logo.jpg");
            IPPImage imgx = pres.getImages().addImage(img);

            // Add Picture Frame with height and width equivalent of Picture
            sld.getShapes().addPictureFrame(ShapeType.Rectangle, 50, 150, imgx.getWidth(), imgx.getHeight(), imgx);

            //Write the PPTX file to disk
            pres.save(outputDir + "AddStretchOffsetForImageFill_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddStretchOffsetForImageFill
    }
}
