/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Shapes1.RectangleShape1;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

import java.awt.*;

public class FormattedRectangle
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FormattedRectangle.class);

        //Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add autoshape of ellipse type
        IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 150, 50);

        //Apply some formatting to ellipse shape
        shp.getFillFormat().setFillType(FillType.Solid);
        shp.getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Chocolate));

        //Apply some formatting to the line of Ellipse
        shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
        shp.getLineFormat().setWidth(5);

        //Write the PPTX file to disk
        pres.save(dataDir+ "RecShp2.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




