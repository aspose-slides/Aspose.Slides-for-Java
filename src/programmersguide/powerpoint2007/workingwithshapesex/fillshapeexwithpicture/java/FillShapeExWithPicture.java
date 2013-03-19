/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithshapesex.fillshapeexwithpicture.java;

import com.aspose.slides.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FillShapeExWithPicture
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithshapesex/fillshapeexwithpicture/data/";

        //Instantiate PresentationEx class that represents the PPTX.
        PresentationEx pres = new PresentationEx();


        //Get the first slide.
        SlideEx sld = pres.getSlides().get_Item(0);

        //Add auto shape of rectangle type.
        int idx = sld.getShapes().addAutoShape(ShapeTypeEx.Rectangle, 50, 150, 75, 150);
        ShapeEx shp = sld.getShapes().get_Item(idx);


        //Set the fill type to Picture
        shp.getFillFormat().setFillType(FillTypeEx.Picture);

        //Set the picture fill mode
        shp.getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillModeEx.Tile);

        //Creating a Buffered Image object to hold the image file
        BufferedImage image=null;

        try {
            image = ImageIO.read(new File(dataDir + "asp.jpg"));
        } catch (IOException e) {
        }

        ImageEx imgx = pres.getImages().addImage(image);

        shp.getFillFormat().getPictureFillFormat().getPicture().setImage(imgx);

        //Write the PPTX file to disk
        pres.write(dataDir + "RectShpPic.pptx");

        //Printing the status
        System.out.println("Shape added and filled with picture successfully!");
    }
}




