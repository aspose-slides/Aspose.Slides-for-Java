package com.aspose.slides.examples.shapes;

import com.aspose.slides.IThreeDFormatEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class GetShapeBevelEffectiveData
{
    public static void main(String[] args)
    {

        //ExStart:GetShapeBevelEffectiveData

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try
        {
            IThreeDFormatEffectiveData threeDEffectiveData = pres.getSlides().get_Item(0).getShapes().get_Item(0).getThreeDFormat().getEffective();

            System.out.println("= Effective shape's top face relief properties =");
            System.out.println("Type: " + threeDEffectiveData.getBevelTop().getBevelType());
            System.out.println("Width: " + threeDEffectiveData.getBevelTop().getWidth());
            System.out.println("Height: " + threeDEffectiveData.getBevelTop().getHeight());


        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:GetShapeBevelEffectiveData
    }
}

