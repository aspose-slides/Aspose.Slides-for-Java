package com.aspose.slides.examples.shapes;

import com.aspose.slides.PictureFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class PictureFrameIsCameoExample
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Shapes() + "PresCameo.pptx";

        //ExStart:PictureFrameIsCameoExample
        Presentation pres = new Presentation(presentationName);
        try {
            // Check if first picture frame is Cameo
            PictureFrame shape = (PictureFrame) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            if (shape != null)
            {
                System.out.println("First picture is Cameo: " + shape.isCameo());
            }

            // Check if third picture frame is Cameo
            shape = (PictureFrame) pres.getSlides().get_Item(0).getShapes().get_Item(2);
            if (shape != null)
            {
                System.out.println("Third picture is Cameo: " + shape.isCameo());
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:PictureFrameIsCameoExample
    }
}
