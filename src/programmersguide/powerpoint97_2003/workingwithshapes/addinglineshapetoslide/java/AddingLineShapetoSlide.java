/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.addinglineshapetoslide.java;

import java.awt.Color;
import java.awt.Point;

import com.aspose.slides.*;

public class AddingLineShapetoSlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/addinglineshapetoslide/data/";
        
        //===========================================================
        // Plain Line
        //===========================================================
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(1);

        //Adding a line shape into the slide with its start and end points
        slide.getShapes().addLine(new Point(1000, 2000), new Point(4700, 2000));
 

        //===========================================================
        // Arrow Shaped Line
        //============================================================

        //Accessing a slide using its slide position
        Slide slide2 = pres.getSlideByPosition(1);

        //Adding a line shape into the slide with its start and end points
        Shape shape = slide2.getShapes().addLine(new Point(1000, 3000), new Point(4700, 3000));

        //Setting the fore color of the line to blue
        shape.getLineFormat().setForeColor(Color.blue);

        //Setting the width of the line to 10
        shape.getLineFormat().setWidth((byte)10);

        //Setting the line style to thick between thin
        shape.getLineFormat().setStyle(LineStyle.ThickBetweenThin);

        //Setting the dash style of the line to dash
        shape.getLineFormat().setDashStyle(LineDashStyle.Dash);

        //Setting the style of the starting point of the line to oval
        shape.getLineFormat().setBeginArrowheadStyle(LineArrowheadStyle.Oval);

        //Setting the style of the ending point of the line to open
        shape.getLineFormat().setEndArrowheadStyle(LineArrowheadStyle.Open);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "demo.out.ppt");
        
        //Print Message
        System.out.println("Line and arrow shapes added successfully.");
    }
}