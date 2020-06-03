package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class GetEffectiveValues
{
    public static void main(String[] args)
    {

        //ExStart:GetEffectiveValues
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try
        {
            IAutoShape shape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);

            ITextFrameFormat localTextFrameFormat = shape.getTextFrame().getTextFrameFormat();
            ITextFrameFormatEffectiveData effectiveTextFrameFormat = localTextFrameFormat.getEffective();

            IPortionFormat localPortionFormat = shape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat();
            IPortionFormatEffectiveData effectivePortionFormat = localPortionFormat.getEffective();
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:GetEffectiveValues


    }
}

