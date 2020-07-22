package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExportMathParagraphToMathML {

    public static void main(String[] args) throws IOException
    {
        //ExStart:ExportMathParagraphToMathML
        // The path to the documents directory.
        String outSvgFileName = RunExamples.getOutPath() +  "mathml.xml";

        Presentation pres = new Presentation();
        try
        {
            IAutoShape autoShape = pres.getSlides().get_Item(0).getShapes().addMathShape(0, 0, 500, 50);
            IMathParagraph mathParagraph = ((MathPortion)autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0)).getMathParagraph();

            mathParagraph.add(new MathematicalText("a").setSuperscript("2").join("+")
                    .join(new MathematicalText("b").setSuperscript("2")).join("=")
                    .join(new MathematicalText("c").setSuperscript("2")));

            FileOutputStream stream = null;
            try {
                stream = new FileOutputStream(outSvgFileName);
                mathParagraph.writeAsMathMl(stream);
            } finally {
                if (stream != null) stream.close();
            }
        }
        finally
        {

        }
        //ExEnd:ExportMathParagraphToMathML
    }

}
