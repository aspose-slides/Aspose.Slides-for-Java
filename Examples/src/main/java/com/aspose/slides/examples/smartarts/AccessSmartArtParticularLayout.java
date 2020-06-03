package com.aspose.slides.examples.smartarts;

import com.aspose.slides.IShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SmartArt;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.RunExamples;


public class AccessSmartArtParticularLayout
{
    public static void main(String[] args)
    {
        //ExStart:AccessSmartArtParticularLayout
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        Presentation presentation = new Presentation(dataDir + "AccessSmartArtShape.pptx");
        try
        {
            // Traverse through every shape inside first slide
            for (IShape shape : presentation.getSlides().get_Item(0).getShapes())
            {
                // Check if shape is of SmartArt type
                if (shape instanceof SmartArt)
                {
                    // Typecast shape to SmartArtEx
                    SmartArt smart = (SmartArt) shape;

                    // Checking SmartArt Layout
                    if (smart.getLayout() == SmartArtLayoutType.BasicBlockList)
                    {
                        System.out.println("Do some thing here....");
                    }
                }
            }
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AccessSmartArtParticularLayout
    }
}

