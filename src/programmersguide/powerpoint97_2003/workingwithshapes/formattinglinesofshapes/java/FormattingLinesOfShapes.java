/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.formattinglinesofshapes.java;

import com.aspose.slides.*;

public class FormattingLinesOfShapes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/formattinglinesofshapes/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");


        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(2);


        //Adding a line shape into the slide with its start and end points
        Shape shape = slide.getShapes().addRectangle(1400, 1100, 3000, 2000);


        //Setting the fore color of the line to blue
        shape.getLineFormat().setForeColor(java.awt.Color.blue);


        //Setting the width of the line to 10
        shape.getLineFormat().setWidth((byte)10);


        //Setting the line style to thick between thin
        shape.getLineFormat().setStyle(LineStyle.ThickBetweenThin);


        //Setting the dash style of the line to dash
        shape.getLineFormat().setDashStyle(LineDashStyle.Dash);


        //Enable the lines of the shape to be visible
        shape.getLineFormat().setShowLines(true);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "modified.ppt");

        //Print Message
        System.out.println("Process Completed Successfully.");
    }
}




