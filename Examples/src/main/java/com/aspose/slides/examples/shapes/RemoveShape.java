package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class RemoveShape
{
    public static void main(String[] args)
    {
        //ExStart:RemoveShape
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create Presentation object
        Presentation pres = new Presentation();

        // Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        // Add autoshape of rectangle type
        IShape shp1 = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 40, 150, 50);
        IShape shp2 = sld.getShapes().addAutoShape(ShapeType.Moon, 160, 40, 150, 50);
        String alttext = "User Defined";
        int iCount = sld.getShapes().size();
        for (int i = 0; i < iCount; i++)
        {
            AutoShape ashp = (AutoShape) sld.getShapes().get_Item(0);
            if (ashp.getAlternativeText().equals(alttext))
            {
                sld.getShapes().remove(ashp);
            }
        }

        // Save presentation to disk
        pres.save(dataDir + "RemoveShape_out.pptx", SaveFormat.Pptx);
        //ExEnd:RemoveShape
    }
}



