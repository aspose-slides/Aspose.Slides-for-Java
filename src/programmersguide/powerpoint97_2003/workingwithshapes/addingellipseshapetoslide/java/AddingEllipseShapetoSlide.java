/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.addingellipseshapetoslide.java;

import java.awt.Color;

import com.aspose.slides.*;

public class AddingEllipseShapetoSlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/addingellipseshapetoslide/data/";
        
        //===========================================================
        // Adding Simple Ellipse in the Slide
        //============================================================
  
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Adding an ellipse shape into the slide by defining its X,Y postion, width and height
        slide.getShapes().addEllipse(1200, 1200, 1000, 2000);
       
        
        //===========================================================
        // Adding Formatted Ellipse in the Slide
        //============================================================

        //Adding an ellipse shape into the slide by defining its X,Y postion, width and height
        Shape shape = slide.getShapes().addEllipse(3000, 1200, 1000, 2000);

        //Setting the fill type of the ellipse to gradient
        shape.getFillFormat().setType(FillType.Gradient);

        //Setting the color type of the gradient to two colors
        shape.getFillFormat().setGradientColorType(GradientColorType.TwoColors);

        //Setting the background color of the ellipse to red
        shape.getFillFormat().setBackColor(Color.red);

        //Setting the foreground color of the ellipse to blue
        shape.getFillFormat().setForeColor(Color.blue);

        //Setting the fill angle of the gradient to 90
        shape.getFillFormat().setGradientFillAngle((byte)90);

        //Setting the rotation of the ellipse to 45 degrees
        shape.setRotation((byte)45);

        //Setting the foreground color of the ellipse lines
        shape.getLineFormat().setForeColor(Color.yellow);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "demo.out.ppt");
        
        //Print Message
        System.out.println("Eclipse added successfully.");
    }
}