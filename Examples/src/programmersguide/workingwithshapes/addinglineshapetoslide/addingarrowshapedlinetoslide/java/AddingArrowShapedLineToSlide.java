/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.addinglineshapetoslide.addingarrowshapedlinetoslide.java;

import com.aspose.slides.*;

import java.awt.*;

public class AddingArrowShapedLineToSlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/addinglineshapetoslide/addingarrowshapedlinetoslide/data/";

        //Instantiate PresentationEx class that represents the PPTX file
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add an autoshape of type line
        IAutoShape shp = sld.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);

        //Apply some formatting on the line
        shp.getLineFormat().setStyle (LineStyle.ThickBetweenThin);
        shp.getLineFormat().setWidth ( 10);

        shp.getLineFormat().setDashStyle  (LineDashStyle.DashDot);

        shp.getLineFormat().setBeginArrowheadLength(LineArrowheadLength.Short);
        shp.getLineFormat().setBeginArrowheadStyle (LineArrowheadStyle.Oval);

        shp.getLineFormat().setEndArrowheadLength (LineArrowheadLength.Long);
        shp.getLineFormat().setEndArrowheadStyle (LineArrowheadStyle.Triangle);

        shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(new Color(com.aspose.slides.PresetColor.Maroon));

        //Write the PPTX to Disk
        pres.save(dataDir+ "LineShape2.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");


    }
}




