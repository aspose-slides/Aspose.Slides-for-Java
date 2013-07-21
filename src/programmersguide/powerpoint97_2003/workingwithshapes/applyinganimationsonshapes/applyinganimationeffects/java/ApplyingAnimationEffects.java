/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.applyinganimationsonshapes.applyinganimationeffects.java;

import com.aspose.slides.*;

public class ApplyingAnimationEffects
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/applyinganimationsonshapes/applyinganimationeffects/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");


        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(2);


        //Adding a rectangle shape into the slide by defining its X,Y postion, width
        //and height
        Shape shape = slide.getShapes().addRectangle(1400, 1100, 3000, 2000);


        //Applying an animation effect on the rectangle shape
        shape.getAnimationSettings().setEntryEffect(ShapeEntryEffect.Spiral);


        //Writing the presentation as a PPT file
        pres.write(dataDir + "modified.ppt");

        //Print Message
        System.out.println("Process Completed Successfully.");
    }
}




