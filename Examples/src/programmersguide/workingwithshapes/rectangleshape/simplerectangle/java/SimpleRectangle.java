/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.rectangleshape.simplerectangle.java;

import com.aspose.slides.*;

public class SimpleRectangle
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/rectangleshape/simplerectangle/data/";

        //Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add autoshape of ellipse type
        IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 150, 50);

        //Write the PPTX file to disk
        pres.save(dataDir+ "RecShp1.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");

    }
}




