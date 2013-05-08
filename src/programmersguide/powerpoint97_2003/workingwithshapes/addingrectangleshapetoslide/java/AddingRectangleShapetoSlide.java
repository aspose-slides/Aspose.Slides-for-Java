/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.addingrectangleshapetoslide.java;

import java.awt.Color;

import com.aspose.slides.*;

public class AddingRectangleShapetoSlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/addingrectangleshapetoslide/data/";
        
        //===========================================================
        // Adding Simple Rectangle in the Slide
        //============================================================

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Adding a rectangle shape into the slide by defining its X,Y postion, width and height
        slide.getShapes().addRectangle(500, 1600, 1500, 1000);

        
        //===========================================================
        // Adding Formatted Rectangle to Slide
        //============================================================
        
        //Adding a rectangle shape into the slide by defining its X,Y postion, width and height
        Shape shape = slide.getShapes().addRectangle(3500, 1600, 1500, 1000);

        //Setting the fill type of the rectangle to pattern
        shape.getFillFormat().setType(FillType.Pattern);

        //Setting the pattern style to sphere
        shape.getFillFormat().setPatternStyle(PatternStyle.Sphere);

        //Setting the background color of the rectangle to light gray
        shape.getFillFormat().setBackColor(Color.gray);

        //Setting the foreground color of the rectangle to yellow
        shape.getFillFormat().setForeColor(Color.yellow);

        //Setting the foreground color of the rectangle lines to blue
        shape.getLineFormat().setForeColor(Color.blue);

        //Setting the width of the rectangle lines in points
        shape.getLineFormat().setWidth((byte)10);

        //Setting the line style of the rectangle to thick thin
        shape.getLineFormat().setStyle(LineStyle.ThickThin);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "demo.out.ppt");
        
      //Print Message
        System.out.println("Rectangle added successfully.");
    }
}