/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.creatingshapethumbnailimage.java;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.*;

public class CreatingShapeThumbnailImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/creatingshapethumbnailimage/data/";
        
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Iterate all shapes on a slide and create thumbnails
        ShapeCollection shapes = slide.getShapes();
        
        for (int i = 0; i < shapes.size(); i++) 
        {
            Shape shape = shapes.get_Item(i);
            java.awt.Rectangle rect = shape.getShapeRectangle();//new java.awt.Rectangle(0, 0,5760,4320); 
            com.aspose.slides.Collections.ArrayList col = new com.aspose.slides.Collections.ArrayList();
            col.addItem(shape);
            BufferedImage imgq = slide.getThumbnail(col, 1f, 1f, rect);
            try 
            {
                ImageIO.write(imgq, "JPG", new java.io.File(dataDir+"slide_"+Integer.toString(i)+".out.jpg"));
                ImageIO.write(imgq, "BMP", new java.io.File(dataDir+"slide_"+Integer.toString(i)+".out.bmp"));
                ImageIO.write(imgq, "PNG", new java.io.File(dataDir+"slide_"+Integer.toString(i)+".out.png"));
        	            
            } 
            catch (IOException e) 
            {
            	e.printStackTrace();
        	}
        }
        //Print Message
        System.out.println("Shapes created successfully.");
    }		
}