

package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ITextFrameFormatEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;


public class GetTextFrameFormatEffectiveData {

    public static void main(String[] args) {
                
            //ExStart:GetTextFrameFormatEffectiveData
           // The path to the documents directory.
           String dataDir = Utils.getDataDir(GetTextFrameFormatEffectiveData.class);
           
           Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
            try
            {
                IAutoShape shape = (IAutoShape)pres.getSlides().get_Item(0).getShapes().get_Item(0);
                ITextFrameFormatEffectiveData effectiveTextFrameFormat = shape.getTextFrame().getTextFrameFormat().getEffective();

                System.out.println("Anchoring type: " + effectiveTextFrameFormat.getAnchoringType());
                System.out.println("Autofit type: " + effectiveTextFrameFormat.getAutofitType());
                System.out.println("Text vertical type: " + effectiveTextFrameFormat.getTextVerticalType());
                System.out.println("Margins");
                System.out.println("   Left: " + effectiveTextFrameFormat.getMarginLeft());
                System.out.println("   Top: " + effectiveTextFrameFormat.getMarginTop());
                System.out.println("   Right: " + effectiveTextFrameFormat.getMarginRight());
                System.out.println("   Bottom: " + effectiveTextFrameFormat.getMarginBottom());
            } finally {
                if (pres != null) pres.dispose();
            }
                     
           //ExEnd:GetTextFrameFormatEffectiveData
    }
}
