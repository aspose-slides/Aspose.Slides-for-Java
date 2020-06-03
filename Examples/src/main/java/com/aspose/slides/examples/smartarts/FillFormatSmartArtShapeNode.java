package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class FillFormatSmartArtShapeNode
{
    public static void main(String[] args)
    {
        //ExStart.getFillFormat().martArtShapeNode
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        Presentation presentation = new Presentation();
        try
        {
            // Accessing the slide
            ISlide slide = presentation.getSlides().get_Item(0);

            // Adding SmartArt shape and nodes
            ISmartArt chevron = slide.getShapes().addSmartArt(10, 10, 800, 60, SmartArtLayoutType.ClosedChevronProcess);
            ISmartArtNode node = chevron.getAllNodes().addNode();
            node.getTextFrame().setText("Some text");

            // Setting node fill color
            for (ISmartArtShape item : node.getShapes())
            {
                item.getFillFormat().setFillType(FillType.Solid);
                item.getFillFormat().getSolidFillColor().setColor(Color.RED);
            }

            // Saving Presentation
            presentation.save(dataDir + "FillFormat_SmartArt_ShapeNode_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd.getFillFormat().martArtShapeNode
    }
}

