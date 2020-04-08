package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraphFormatEffectiveData;
import com.aspose.slides.ITextStyleEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;


public class GetTextStyleEffectiveData {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetTextStyleEffectiveData.class);

        //ExStart:GetTextStyleEffectiveData
        // Create an instance of Presentation class
        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try {
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            ITextStyleEffectiveData effectiveTextStyle = shape.getTextFrame().getTextFrameFormat().getTextStyle().getEffective();

            for (int i = 0; i <= 8; i++) {
                IParagraphFormatEffectiveData effectiveStyleLevel = effectiveTextStyle.getLevel(i);
                System.out.println("= Effective paragraph formatting for style level #" + i + " =");

                System.out.println("Depth: " + effectiveStyleLevel.getDepth());
                System.out.println("Indent: " + effectiveStyleLevel.getIndent());
                System.out.println("Alignment: " + effectiveStyleLevel.getAlignment());
                System.out.println("Font alignment: " + effectiveStyleLevel.getFontAlignment());
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetTextStyleEffectiveData
    }

}
