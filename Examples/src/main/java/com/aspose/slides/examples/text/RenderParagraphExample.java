package com.aspose.slides.examples.text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IImage;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

public class RenderParagraphExample
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Text() + "Presentation1.pptx";

        //ExStart:RenderParagraphExample
        Presentation pres = new Presentation(presentationName);
        try {
            ISlide slide = pres.getSlides().get_Item(0);

            int shapeIndex = 0;
            for (IShape shape : slide.getShapes())
            {
                shapeIndex++;

                if (shape instanceof com.aspose.slides.IAutoShape) {
                    IAutoShape autoShape = (IAutoShape) shape;
                    if (autoShape == null || autoShape.getTextFrame() == null)
                        continue;

                    int paragraphIndex = 0;
                    for (IParagraph paragraph : autoShape.getTextFrame().getParagraphs())
                    {
                        paragraphIndex++;
                        String outFileName = RunExamples.getOutPath() +
                                "shape" + shapeIndex + "_paragraph" + paragraphIndex + ".png";

                        IImage paragraphImage = paragraph.getImage(2f, 2f);
                        if (paragraphImage != null) {
                            paragraphImage.save(outFileName);
                            paragraphImage.dispose();
                        }
                    }
                }
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RenderParagraphExample
    }
}
