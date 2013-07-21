/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.fillingshapeswithgradient.controllingdegreeofgradient.java;

import com.aspose.slides.*;

public class ControllingDegreeOfGradient
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/fillingshapeswithgradient/controllingdegreeofgradient/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");


        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(2);


        //Adding an ellipse shape into the slide by defining its X,Y postion, width
        //and height
        Shape shape = slide.getShapes().addEllipse(2300, 1200, 1000, 2000);


        //Setting the fill type of the ellipse to gradient
        shape.getFillFormat().setType(FillType.Gradient);


        //Setting the color type of the gradient to two colors
        shape.getFillFormat().setGradientColorType(GradientColorType.OneColor);


        //Setting the foreground color of the ellipse to blue
        shape.getFillFormat().setForeColor(java.awt.Color.blue);


        //Setting the degree of the gradient
        shape.getFillFormat().setGradientDegree((byte)18);


        //Writing the presentation as a PPT file
        pres.write(dataDir + "modified.ppt");

        //Print Message
        System.out.println("Process Completed Successfully.");
    }
}




