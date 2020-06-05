package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;





public class SetAlternativeText
{
    public static void main(String[] args)
    {
        //ExStart:SetAlternativeText
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

        // Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        // Add autoshape of rectangle type
        IShape shp1 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 40, 150, 50);
        IShape shp2 = sld.getShapes().addAutoShape(ShapeType.Moon, 160, 40, 150, 50);
        shp2.getFillFormat().setFillType(FillType.Solid);
        shp2.getFillFormat().getSolidFillColor().setColor(Color.GRAY);

        for (int i = 0; i < sld.getShapes().size(); i++)
        {
            AutoShape shape = (AutoShape) sld.getShapes().get_Item(i);
            if (shape != null)
            {
                AutoShape ashp = shape;
                ashp.setAlternativeText("User Defined");
            }
        }

        // Save presentation to disk
        pres.save(dataDir + "Set_AlternativeText_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetAlternativeText
    }
}



