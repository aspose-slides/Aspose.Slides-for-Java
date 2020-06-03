package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SupportOfMorphTransition
{
    public static void main(String[] args)
    {
        //ExStart:SupportOfMorphTransition
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();

        Presentation presentation = new Presentation();
        try
        {
            AutoShape autoshape = (AutoShape) presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 400, 100);
            autoshape.getTextFrame().setText("Test text");

            presentation.getSlides().addClone(presentation.getSlides().get_Item(0));

            IShape shape = presentation.getSlides().get_Item(1).getShapes().get_Item(0);
            shape.setX(shape.getX() + 100);
            shape.setY(shape.getY() + 50);
            shape.setWidth(shape.getWidth() - 200);
            shape.setHeight(shape.getHeight() - 10);

            presentation.getSlides().get_Item(1).getSlideShowTransition().setType(com.aspose.slides.TransitionType.Morph);

            presentation.save(dataDir + "presentation-out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

        //ExEnd:SupportOfMorphTransition
    }
}

