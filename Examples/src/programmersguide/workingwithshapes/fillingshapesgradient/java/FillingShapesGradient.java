/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.fillingshapesgradient.java;

import com.aspose.slides.*;

public class FillingShapesGradient
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/fillingshapesgradient/data/";
        //Instantiate Prseetation class that represents the PPTX//Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add autoshape of ellipse type
        IShape shp = sld.getShapes().addAutoShape(ShapeType.Ellipse, 50, 150, 75, 150);

        //Apply some gradient formatting to ellipse shape
        shp.getFillFormat().setFillType(FillType.Gradient);
        shp.getFillFormat().getGradientFormat().setGradientShape(GradientShape.Linear);

        //Set the Gradient Direction
        shp.getFillFormat().getGradientFormat().setGradientDirection(GradientDirection.FromCorner2);

        //Add two Gradient Stops
        shp.getFillFormat().getGradientFormat().getGradientStops().add((float)1.0, PresetColor.Purple);
        shp.getFillFormat().getGradientFormat().getGradientStops().add((float)0, PresetColor.Red);

        //Write the PPTX file to disk
        pres.save(dataDir+ "EllipseShpGrad.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
        
    }
}




