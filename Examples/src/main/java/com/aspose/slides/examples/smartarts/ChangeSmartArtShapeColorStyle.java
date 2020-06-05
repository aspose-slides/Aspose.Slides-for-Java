package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ChangeSmartArtShapeColorStyle
{
    public static void main(String[] args)
    {
        //ExStart:ChangeSmartArtShapeColorStyle
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

                    // Checking SmartArt color type
                    if (smart.getColorStyle() == SmartArtColorType.ColoredFillAccent1)
                    {
                        // Changing SmartArt color type
                        smart.setColorStyle(SmartArtColorType.ColorfulAccentColors);
                    }
                }
            }

            // Saving Presentation
            presentation.save(dataDir + "ChangeSmartArtColorStyle_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ChangeSmartArtShapeColorStyle
    }
}

