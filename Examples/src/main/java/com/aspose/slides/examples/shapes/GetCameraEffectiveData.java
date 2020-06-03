package com.aspose.slides.examples.shapes;

import com.aspose.slides.IThreeDFormatEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class GetCameraEffectiveData
{
    public static void main(String[] args)
    {

        //ExStart:GetCameraEffectiveData

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try
        {
            IThreeDFormatEffectiveData threeDEffectiveData = pres.getSlides().get_Item(0).getShapes().get_Item(0).getThreeDFormat().getEffective();

            System.out.println("= Effective camera properties =");
            System.out.println("Type: " + threeDEffectiveData.getCamera().getCameraType());
            System.out.println("Field of view: " + threeDEffectiveData.getCamera().getFieldOfViewAngle());
            System.out.println("Zoom: " + threeDEffectiveData.getCamera().getZoom());


        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:GetCameraEffectiveData
    }
}

