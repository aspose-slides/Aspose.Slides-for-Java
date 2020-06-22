package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ChangeShapeOrder
{
    public static void main(String[] args)
    {
        //ExStart:ChangeShapeOrder
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        Presentation presentation1 = new Presentation(dataDir + "HelloWorld.pptx");
        ISlide slide = presentation1.getSlides().get_Item(0);
        IAutoShape shp3 = slide.getShapes().addAutoShape(ShapeType.Rectangle, 200, 365, 400, 150);
        shp3.getFillFormat().setFillType(FillType.NoFill);
        shp3.addTextFrame(" ");

        ITextFrame txtFrame = shp3.getTextFrame();
        IParagraph para = txtFrame.getParagraphs().get_Item(0);
        IPortion portion = para.getPortions().get_Item(0);
        portion.setText("Watermark Text Watermark Text Watermark Text");
        shp3 = slide.getShapes().addAutoShape(ShapeType.Triangle, 200, 365, 400, 150);
        slide.getShapes().reorder(2, shp3);
        presentation1.save(dataDir + "Reshape_out.pptx", SaveFormat.Pptx);
        //ExEnd:ChangeShapeOrder
    }
}



