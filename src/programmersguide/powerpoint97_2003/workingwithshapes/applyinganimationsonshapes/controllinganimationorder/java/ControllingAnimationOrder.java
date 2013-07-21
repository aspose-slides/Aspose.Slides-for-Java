/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithshapes.applyinganimationsonshapes.controllinganimationorder.java;

import com.aspose.slides.*;

public class ControllingAnimationOrder
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithshapes/applyinganimationsonshapes/controllinganimationorder/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");


        //Accessing a slide using its slide position
        Slide slide = pres.getSlideByPosition(2);


        //Adding two shapes to the slide
        Shape shape1 = slide.getShapes().addRectangle(1400, 1100, 3000, 2000);
        Shape shape2 = slide.getShapes().addEllipse(2400, 1150, 1000, 1900);


        //Applying animation effects on both shapes
        shape1.getAnimationSettings().setEntryEffect(ShapeEntryEffect.Spiral);
        shape2.getAnimationSettings().setEntryEffect(ShapeEntryEffect.BoxOut);


        //Setting the animation order for both shapes. According to below order, shape2
        //will animate first and then the shape1
        shape1.getAnimationSettings().setAnimationOrder((byte)2);
        shape2.getAnimationSettings().setAnimationOrder((byte)1);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "modified.ppt");

        //Print Message
        System.out.println("Process Completed Successfully.");
    }
}




