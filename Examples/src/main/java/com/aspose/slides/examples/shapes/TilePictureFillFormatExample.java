package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class TilePictureFillFormatExample
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "ImageTileExample.pptx";

        //ExStart:TilePictureFillFormatExample
        Presentation pres = new Presentation();
        try {
            ISlide firstSlide = pres.getSlides().get_Item(0);

            IPPImage ppImage;

            IImage newImage = Images.fromFile(dataDir + "image.png");
            ppImage = pres.getImages().addImage(newImage);
            newImage.dispose();

            // Adds the new Rectangle shape
            IAutoShape newShape = firstSlide.getShapes().addAutoShape(ShapeType.Rectangle, 0, 0, 350, 350);

            // Sets the fill type of the new shape to Picture
            newShape.getFillFormat().setFillType(FillType.Picture);

            // Sets the shape's fill image
            IPictureFillFormat pictureFillFormat = newShape.getFillFormat().getPictureFillFormat();
            pictureFillFormat.getPicture().setImage(ppImage);

            // Sets the picture fill mode to Tile and changes the properties
            pictureFillFormat.setPictureFillMode(PictureFillMode.Tile);
            pictureFillFormat.setTileOffsetX(-275);
            pictureFillFormat.setTileOffsetY(-247);
            pictureFillFormat.setTileScaleX(120);
            pictureFillFormat.setTileScaleY(120);
            pictureFillFormat.setTileAlignment(RectangleAlignment.BottomRight);
            pictureFillFormat.setTileFlip(TileFlip.FlipBoth);

            pres.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (pres != null)
                pres.dispose();
        }
        //ExEnd:TilePictureFillFormatExample
    }
}
