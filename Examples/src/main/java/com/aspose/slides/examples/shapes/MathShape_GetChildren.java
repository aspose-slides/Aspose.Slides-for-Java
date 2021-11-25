/*
 * Copyright (c) 2009-2021. Aspose Pty Ltd. All Rights Reserved.
 */

package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class MathShape_GetChildren
{
    //ExStart:MathShape_GetChildren
    public static void main(String[] args)
    {
        //Path for output presentation
        String outPptxFile = RunExamples.getOutPath() + "MathShape_GetChildren_out.pptx";

        Presentation pres = new Presentation();
        try
        {
            // Get first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Create MathShape in the first slide
            IAutoShape mathShape = slide.getShapes().addMathShape(10, 10, 500, 500);
            // Create MathParagraph
            IMathParagraph mathParagraph = ((MathPortion)mathShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0)).getMathParagraph();

            // Create MathBlock
            IMathBlock mathBlock = new MathBlock(new MathematicalText("F").join("+").join(new MathematicalText("1").divide("y")).underbar());

            // Add MathBlock to the MathParagraph
            mathParagraph.add(mathBlock);

            // Print all elements of the mathBlock
            forEachMathElement(mathBlock);

            pres.save(outPptxFile, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

    }

    private static void forEachMathElement(IMathElement root)
    {
        for (IMathElement child : root.getChildren())
        {
            System.out.println(child.getClass().getCanonicalName() + (child instanceof MathematicalText ? " : " +((MathematicalText)child).getValue() : ""));

            //recursive
            forEachMathElement(child);
        }
    }
    //ExEnd:MathShape_GetChildren
}
