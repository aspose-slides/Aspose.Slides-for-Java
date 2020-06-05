package com.aspose.slides.examples.text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ITextFrameFormat;
import com.aspose.slides.ITextFrameFormatEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class GetTextFrameFormatEffectiveData
{
    public static void main(String[] args)
    {

        //ExStart:GetTextFrameFormatEffectiveData

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try
        {
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);

            ITextFrameFormat textFrameFormat = shape.getTextFrame().getTextFrameFormat();
            ITextFrameFormatEffectiveData effectiveTextFrameFormat = textFrameFormat.getEffective();


            System.out.println("Anchoring type: " + effectiveTextFrameFormat.getAnchoringType());
            System.out.println("Autofit type: " + effectiveTextFrameFormat.getAutofitType());
            System.out.println("Text vertical type: " + effectiveTextFrameFormat.getTextVerticalType());
            System.out.println("Margins");
            System.out.println("   Left: " + effectiveTextFrameFormat.getMarginLeft());
            System.out.println("   Top: " + effectiveTextFrameFormat.getMarginTop());
            System.out.println("   Right: " + effectiveTextFrameFormat.getMarginRight());
            System.out.println("   Bottom: " + effectiveTextFrameFormat.getMarginBottom());

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetTextFrameFormatEffectiveData

    }
}

