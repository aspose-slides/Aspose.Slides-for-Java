/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.fillingshapespattern.java;

import com.aspose.slides.*;

import java.awt.*;

public class FillingShapesPattern
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/fillingshapespattern/data/";

        //Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add autoshape of rectangle type
        IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 75, 150);

        //Set the fill type to Pattern
        shp.getFillFormat().setFillType(FillType.Pattern);

        //Set the pattern style
        shp.getFillFormat().getPatternFormat().setPatternStyle(PatternStyle.Trellis);

        //Set the pattern back and fore colors
        shp.getFillFormat().getPatternFormat().getBackColor().setColor(Color.LIGHT_GRAY);
        shp.getFillFormat().getPatternFormat().getForeColor().setColor(Color.YELLOW);

        //Write the PPTX file to disk
        pres.save(dataDir+ "RectShpPatt.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");

    }
}




