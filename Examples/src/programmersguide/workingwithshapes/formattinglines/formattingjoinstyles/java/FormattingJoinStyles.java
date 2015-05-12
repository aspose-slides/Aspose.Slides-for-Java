/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithshapes.formattinglines.formattingjoinstyles.java;

import com.aspose.slides.*;

import java.awt.*;

public class FormattingJoinStyles
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/formattinglines/formattingjoinstyles/data/";

        //Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add three autoshapes of rectangle type
        IShape shp1 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 100, 150, 75);

        IShape shp2 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 300, 100, 150, 75);

        IShape shp3 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 250, 150, 75);

        //Set the fill color of the rectangle shape
        shp1.getFillFormat().setFillType(FillType.Solid);
        shp1.getFillFormat().getSolidFillColor().setColor (Color.BLACK);
        shp2.getFillFormat().setFillType(FillType.Solid);
        shp2.getFillFormat().getSolidFillColor().setColor (Color.BLACK);
        shp3.getFillFormat().setFillType(FillType.Solid);
        shp3.getFillFormat().getSolidFillColor().setColor (Color.BLACK);

        //Set the line width
        shp1.getLineFormat().setWidth(15);
        shp2.getLineFormat().setWidth(15);
        shp3.getLineFormat().setWidth (15);

        //Set the color of the line of rectangle
        shp1.getLineFormat().getFillFormat().setFillType(FillType.Solid);
        shp1.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
        shp2.getLineFormat().getFillFormat().setFillType(FillType.Solid);
        shp2.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
        shp3.getLineFormat().getFillFormat().setFillType(FillType.Solid);
        shp3.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);

        //Set the Join Style
        shp1.getLineFormat().setJoinStyle(LineJoinStyle.Miter);
        shp2.getLineFormat().setJoinStyle(LineJoinStyle.Bevel);
        shp3.getLineFormat().setJoinStyle(LineJoinStyle.Round);

        //Add text to each rectangle
        ((IAutoShape)shp1).getTextFrame().setText ("This is Miter Join Style");
        ((IAutoShape)shp2).getTextFrame().setText( "This is Bevel Join Style");
        ((IAutoShape)shp3).getTextFrame().setText ("This is Round Join Style");

        //Write the PPTX file to disk
        pres.save(dataDir+ "RectShpLnJoin.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




