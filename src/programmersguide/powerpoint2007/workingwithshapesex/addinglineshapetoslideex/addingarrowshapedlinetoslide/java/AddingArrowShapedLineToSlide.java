/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithshapesex.addinglineshapetoslideex.addingarrowshapedlinetoslide.java;

import com.aspose.slides.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AddingArrowShapedLineToSlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithshapesex/addinglineshapetoslideex/addingarrowshapedlinetoslide/data/";

        //Instantiate PresentationEx class that represents the PPTX file
        PresentationEx pres = new PresentationEx();

        //Get the first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        //Add an autoshape of type line
        int idx = sld.getShapes().addAutoShape(ShapeTypeEx.Line, 50, 150, 300, 0);
        ShapeEx shp = sld.getShapes().get_Item(idx);

        //Apply some formatting on the line
        shp.getLineFormat().setStyle(LineStyleEx.ThickBetweenThin);
        shp.getLineFormat().setWidth((byte) 10);

        shp.getLineFormat().setDashStyle(LineDashStyleEx.DashDot);

        shp.getLineFormat().setBeginArrowheadLength(LineArrowheadLengthEx.Short);
        shp.getLineFormat().setBeginArrowheadStyle(LineArrowheadStyleEx.Oval);

        shp.getLineFormat().setEndArrowheadLength(LineArrowheadLengthEx.Long);
        shp.getLineFormat().setEndArrowheadStyle(LineArrowheadStyleEx.Triangle);

        shp.getLineFormat().getFillFormat().setFillType(FillTypeEx.Solid);
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(java.awt.Color.red);

        //Write the PPTX to Disk
        pres.write(dataDir + "LineShape.pptx");

        //Printing the status
        System.out.println("Arrow Shape added successfully!");
    }
}




