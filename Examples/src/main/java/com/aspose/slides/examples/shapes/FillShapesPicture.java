package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class FillShapesPicture
{
    public static void main(String[] args)
    {
        //ExStart:FillShapesPicture
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();
        String outputDir = RunExamples.getOutPath();

        // Instantiate PrseetationEx class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {

            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add autoshape of rectangle type
            IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);


            // Set the fill type to Picture
            shp.getFillFormat().setFillType(FillType.Picture);

            // Set the picture fill mode
            shp.getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Tile);

            // Set the picture
            IImage img = Images.fromFile(dataDir + "Tulips.jpg");
            IPPImage imgx = pres.getImages().addImage(img);
            shp.getFillFormat().getPictureFillFormat().getPicture().setImage(imgx);

            //Write the PPTX file to disk
            pres.save(outputDir + "RectShpPic_out.pptx", SaveFormat.Pptx);
            //ExEnd:FillShapesPicture
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}
