package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IPortionFormat;
import com.aspose.slides.IPortionFormatEffectiveData;
import com.aspose.slides.ITextFrameFormat;
import com.aspose.slides.ITextFrameFormatEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;


public class GetEffectiveValues {
    public static void main(String[] args) {


        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetEffectiveValues.class);

        //ExStart:GetEffectiveValues
        // Create an instance of Presentation class
        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try {
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);

            ITextFrameFormat localTextFrameFormat = shape.getTextFrame().getTextFrameFormat();
            ITextFrameFormatEffectiveData effectiveTextFrameFormat = localTextFrameFormat.getEffective();

            IPortionFormat localPortionFormat = shape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat();
            IPortionFormatEffectiveData effectivePortionFormat = localPortionFormat.getEffective();
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetEffectiveValues
    }

}
