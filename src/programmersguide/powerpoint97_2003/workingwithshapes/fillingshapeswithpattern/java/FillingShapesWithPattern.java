/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.fillingshapeswithpattern.java;

import com.aspose.slides.*;

public class FillingShapesWithPattern
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/fillingshapeswithpattern/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");


        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(2);


        //Adding a rectangle shape into the slide by defining its X,Y postion, width
        //and height
        Shape shape = slide.getShapes().addRectangle(1400, 1100, 3000, 2000);


        //Setting the fill type of the rectangle to pattern
        shape.getFillFormat().setType(FillType.Pattern);


        //Setting the pattern style of the shape
        shape.getFillFormat().setPatternStyle(PatternStyle.Trellis);


        //Setting the background color of the rectangle to light gray
        shape.getFillFormat().setBackColor(java.awt.Color.gray);


        //Setting the foreground color of the rectangle to yellow
        shape.getFillFormat().setForeColor(java.awt.Color.yellow);


        //Writing the presentation as a PPT file
        pres.write(dataDir + "modified.ppt");

        //Print Message
        System.out.println("Process Completed Successfully.");
    }
}




