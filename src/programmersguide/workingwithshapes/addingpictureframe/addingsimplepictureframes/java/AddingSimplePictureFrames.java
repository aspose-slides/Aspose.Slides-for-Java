/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.addingpictureframe.addingsimplepictureframes.java;

import com.aspose.slides.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AddingSimplePictureFrames
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/addingpictureframe/addingsimplepictureframes/data/";

        //Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Instantiate the Image class
        IPPImage imgx =null;

        try{
            imgx = pres.getImages().addImage(new FileInputStream(new File(dataDir+ "aspose-logo.jpg")));
        }
        catch(IOException e){}

        //Add Picture Frame with height and width equivalent of Picture
        sld.getShapes().addPictureFrame(ShapeType.Rectangle, 50, 150, imgx.getWidth(), imgx.getHeight(), imgx);

        //Write the PPTX file to disk
        pres.save(dataDir+ "RectPicFrame.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




