package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class GetTextFromSmartArtNode
{
    public static void main(String[] args)
    {
        // ExStart:GetTextFromSmartArtNode
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        Presentation presentation = new Presentation("Presentation.pptx");
        try
        {
            ISlide slide = presentation.getSlides().get_Item(0);
            ISmartArt smartArt = (ISmartArt) slide.getShapes().get_Item(0);

            ISmartArtNodeCollection smartArtNodes = smartArt.getAllNodes();
            for (ISmartArtNode smartArtNode : (Iterable<ISmartArtNode>) smartArtNodes)
            {
                for (ISmartArtShape nodeShape : smartArtNode.getShapes())
                {
                    if (nodeShape.getTextFrame() != null)
                        System.out.println(nodeShape.getTextFrame().getText());
                }
            }
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }
    // ExEnd:GetTextFromSmartArtNode
}

