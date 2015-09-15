/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Shapes.FormatLines;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

import java.awt.*;

public class FormatLines
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FormatLines.class);

        //Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add autoshape of rectangle type
        IShape shp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 150, 75);

        //Set the fill color of the rectangle shape
        shp.getFillFormat().setFillType(FillType.Solid);
        shp.getFillFormat().getSolidFillColor().setColor (Color.WHITE);

        //Apply some formatting on the line of the rectangle
        shp.getLineFormat().setStyle(LineStyle.ThickThin);
        shp.getLineFormat().setWidth(7);
        shp.getLineFormat().setDashStyle(LineDashStyle.Dash);

        //set the color of the line of rectangle
        shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor ( Color.BLUE);

        //Write the PPTX file to disk
        pres.save(dataDir+ "RectShpLn.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");


    }
}




