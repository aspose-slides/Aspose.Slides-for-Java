/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.rotatingshapes.java;

import com.aspose.slides.*;

public class RotatingShapes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/rotatingshapes/data/";

        //Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add autoshape of rectangle type
        IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);

        //Rotate the shape to 90 degree
        shp.setRotation(90);

        //Write the PPTX file to disk
        pres.save(dataDir+ "RectShpRot.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




