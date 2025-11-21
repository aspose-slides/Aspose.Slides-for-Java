package com.aspose.slides.examples.shapes;


import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IMathBlock;
import com.aspose.slides.IMathElement;
import com.aspose.slides.IMathParagraph;
import com.aspose.slides.MathArray;
import com.aspose.slides.MathDelimiter;
import com.aspose.slides.MathFraction;
import com.aspose.slides.MathPhantom;
import com.aspose.slides.MathPortion;
import com.aspose.slides.MathematicalText;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
The example shows how to use the MathPhantom that represent a phantom math object (<m:phant>).
Phantom math object  affects the layout of its child element without necessarily displaying it.
A phantom can hide its base expression while preserving its width, height, or depth - useful for aligning formulas
or reserving space. Visibility and geometry behavior are controlled by properties such as Show, ZeroWid, ZeroAsc, ZeroDesc,
nd Transp.
*/
public class MathPhantomExample
{
    public static void main(String[] args)
    {
        //Path for output presentation
        String outPptxFile = RunExamples.getOutPath() + "MathPhantom_out.pptx";

        //ExStart:MathPhantomExample
        Presentation pres = new Presentation();
        try {
            IAutoShape autoShape = pres.getSlides().get_Item(0).getShapes().addMathShape(0, 0, 500, 50);
            IMathParagraph mathParagraph =
                    ((MathPortion)autoShape.getTextFrame().getParagraphs().get_Item(0)
                            .getPortions().get_Item(0)).getMathParagraph();

            MathematicalText eq1 = new MathematicalText("eq1");
            MathematicalText eq2 = new MathematicalText("eq2");
            // Create phantom math object
            MathPhantom phant = new MathPhantom(new MathFraction(
                    new MathematicalText("1"), new MathematicalText("2")));
            phant.setShow(false);
            phant.setZeroAsc(true);
            MathematicalText first = new MathematicalText("    (1)");
            MathematicalText sect = new MathematicalText("    (2)");
            IMathBlock second = new MathematicalText().join(phant).join(sect);
            List<IMathElement> list1 = new List<IMathElement>();
            list1.add(first);
            list1.add(second);
            MathArray nums = new MathArray(list1);
            List<IMathElement> list2 = new List<IMathElement>();
            list2.add(eq1);
            list2.add(eq2);
            MathDelimiter eqs = new MathDelimiter(new MathArray(list2));
            eqs.setBeginningCharacter('{');
            eqs.setEndingCharacter('\0');
            IMathBlock wholeBlock = new MathematicalText().join(eqs).join(" ").join(nums);
            mathParagraph.add(wholeBlock);

            pres.save(outPptxFile, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:MathPhantomExample
    }
}
