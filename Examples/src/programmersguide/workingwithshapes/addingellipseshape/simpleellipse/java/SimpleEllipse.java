/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.addingellipseshape.simpleellipse.java;

import com.aspose.slides.*;

public class SimpleEllipse
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/addingellipseshape/simpleellipse/data/";
        //Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add autoshape of ellipse type
        sld.getShapes().addAutoShape(ShapeType.Ellipse, 50, 150, 150, 50);

        //Write the PPTX file to disk
        pres.save(dataDir+ "EllipseShp1.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
        
    }
}




