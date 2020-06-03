package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ChangSmartArtShapeStyle
{
    public static void main(String[] args)
    {
        //ExStart:ChangSmartArtShapeStyle
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        Presentation presentation = new Presentation(dataDir + "AccessSmartArtShape.pptx");
        try
        {
            // Traverse through every shape inside first slide
            for (IShape shape : presentation.getSlides().get_Item(0).getShapes())
            {
                // Check if shape is of SmartArt type
                if (shape instanceof ISmartArt)
                {
                    // Typecast shape to SmartArtEx
                    ISmartArt smart = (ISmartArt) shape;

                    // Checking SmartArt style
                    if (smart.getQuickStyle() == SmartArtQuickStyleType.SimpleFill)
                    {
                        // Changing SmartArt Style
                        smart.setQuickStyle(SmartArtQuickStyleType.Cartoon);
                    }
                }
            }

            // Saving Presentation
            presentation.save(dataDir + "ChangeSmartArtStyle_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ChangSmartArtShapeStyle
    }
}

