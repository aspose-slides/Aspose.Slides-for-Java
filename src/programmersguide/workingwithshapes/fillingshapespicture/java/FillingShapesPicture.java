/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.fillingshapespicture.java;

import com.aspose.slides.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FillingShapesPicture
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/fillingshapespicture/data/";
        //Instantiate PrseetationEx class that represents the PPTX
        Presentation pres = new Presentation();

//Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add autoshape of rectangle type
        IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);

        //Set the fill type to Picture
        shp.getFillFormat().setFillType (FillType.Picture);

        //Set the picture fill mode
        shp.getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Tile);

        //Set the picture
        IPPImage imgx=null;
        try{
            imgx = pres.getImages().addImage(new FileInputStream(new File( "aspose-logo.jpg")));
        }
        catch(IOException e){}

        shp.getFillFormat().getPictureFillFormat().getPicture().setImage(imgx);

        //Write the PPTX file to disk
        pres.save(dataDir+ "RectShpPic.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");

    }
}




