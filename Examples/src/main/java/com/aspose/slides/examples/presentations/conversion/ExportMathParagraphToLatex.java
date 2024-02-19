package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;

public class ExportMathParagraphToLatex
{
    public static void main(String[] args)
    {
        //ExStart:ExportMathParagraphToLatex
        // Create a new presentation
        Presentation pres = new Presentation();
        try {
            // Add a math shape.
            IAutoShape autoShape = pres.getSlides().get_Item(0).getShapes().addMathShape(0, 0, 500, 50);

            // Get a math paragraph.
            IMathParagraph mathParagraph = ((MathPortion)autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0)).getMathParagraph();

            // Add a formula.
            mathParagraph.add(new MathematicalText("a").setSuperscript("2").join("+")
                    .join(new MathematicalText("b").setSuperscript("2")).join("=")
                    .join(new MathematicalText("c").setSuperscript("2")));

            // Get formula string in Latex format.
            String latexString = mathParagraph.toLatex();

            // Output the resulting Latex string to the console.
            System.out.println("Latex representation of a math paragraph: \"" + latexString + "\"");
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportMathParagraphToLatex
    }
}
