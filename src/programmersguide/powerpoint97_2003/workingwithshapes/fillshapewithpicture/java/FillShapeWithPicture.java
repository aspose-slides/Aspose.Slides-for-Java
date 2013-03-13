/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.fillshapewithpicture.java;

import com.aspose.slides.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FillShapeWithPicture
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/fillshapewithpicture/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(2);

        //Adding an ellipse shape into the slide by defining its X,Y postion, width
        //and height
        Shape shape = slide.getShapes().addEllipse(1400, 1200, 3000, 2000);

        //Setting the fill type of the ellipse to picture
        shape.getFillFormat().setType(FillType.Picture);

        //Creating a Buffered Image object to hold the image file
        BufferedImage image=null;

        try {
            image = ImageIO.read(new File(dataDir + "demo.jpg"));
        } catch (IOException e) {
        }

        //Creating a picture object that will be used as a slide background
        com.aspose.slides.Picture pic = new com.aspose.slides.Picture(pres,image);

        //Adding the picture object to pictures collection of the presentation
        //After the picture object is added, the picture is given a uniqe picture Id
        int picId = pres.getPictures().add(pic);

        //Setting the picture Id of the shape fill to the Id of the picture object
        shape.getFillFormat().setPictureId(picId);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "modified.ppt");

        //Printing the status
        System.out.println("Shape added and filled with image successfully!");
    }
}




