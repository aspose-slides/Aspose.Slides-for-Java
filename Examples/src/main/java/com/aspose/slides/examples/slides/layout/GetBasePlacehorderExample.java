package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.IEffect;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

public class GetBasePlacehorderExample
{
    public static void main(String[] args)
    {
        //ExStart:GetBasePlacehorderExample
        String presentationName = RunExamples.getDataDir_Slides_Presentations_Layout() + "placeholder.pptx";

        Presentation presentation = new Presentation(presentationName);
        try {
            ISlide slide = presentation.getSlides().get_Item(0);
            IShape shape = slide.getShapes().get_Item(0);
            IEffect[] shapeEffects = slide.getLayoutSlide().getTimeline().getMainSequence().getEffectsByShape(shape);
            System.out.println("Shape effects count = " + shapeEffects.length);

            IShape layoutShape = shape.getBasePlaceholder();
            IEffect[] layoutShapeEffects = slide.getLayoutSlide().getTimeline().getMainSequence().getEffectsByShape(layoutShape);
            System.out.println("Layout shape effects count = " + layoutShapeEffects.length);

            IShape masterShape = layoutShape.getBasePlaceholder();
            IEffect[] masterShapeEffects = slide.getLayoutSlide().getMasterSlide().getTimeline().getMainSequence().getEffectsByShape(masterShape);
            System.out.println("Master shape effects count = " + masterShapeEffects.length);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:GetBasePlacehorderExample
    }
}
