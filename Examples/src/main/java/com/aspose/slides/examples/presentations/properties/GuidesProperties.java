package com.aspose.slides.examples.presentations.properties;

/*
This example demonstrates how to add the new vertical and horizontal drawing guides to a PowerPoint presentation.
*/

import com.aspose.slides.IDrawingGuide;
import com.aspose.slides.IDrawingGuidesCollection;
import com.aspose.slides.Orientation;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.awt.geom.Dimension2D;

public class GuidesProperties
{
    public static void main(String[] args)
    {
        String outFilePath = RunExamples.getOutPath() + "GuidesProperties-out.pptx";

        //ExStart:GuidesProperties
        Presentation pres = new Presentation();
        try {
            // Getting slide size
            Dimension2D slideSize = pres.getSlideSize().getSize();
            // Getting the collection of the drawing guides
            IDrawingGuidesCollection guides = pres.getViewProperties().getSlideViewProperties().getDrawingGuides();
            // Adding the new vertical drawing guide to the right of the slide center
            guides.add(Orientation.Vertical, (float)(slideSize.getWidth() / 2) + 12.5f);
            // Adding the new horizontal drawing guide below the slide center
            guides.add(Orientation.Horizontal, (float)(slideSize.getHeight() / 2) + 12.5f);

            // Getting the collection of the drawing guides for first master slide
            guides = pres.getMasters().get_Item(0).getDrawingGuides();
            // Adding the new vertical drawing guide to the right of the slide center
            guides.add(Orientation.Vertical, (float)(slideSize.getWidth() / 2 + 20f));

            // Print the drawing guides of the first master slide
            for (int i = 0 ; i < guides.getCount(); i++)
            {
                IDrawingGuide guide = guides.get_Item(i);
                System.out.println(guide.getOrientation() + " " + guide.getPosition() + " " + guide.getColor());
            }

            // Change the color of the first drawing guide of the master slide
            guides.get_Item(0).setColor(Color.GREEN);

            // Print the drawing guides of the first master slide
            for (int i = 0 ; i < guides.getCount(); i++)
            {
                IDrawingGuide guide = guides.get_Item(i);
                System.out.println(guide.getOrientation() + " " + guide.getPosition() + " " + guide.getColor());
            }

            // Save presentation
            pres.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GuidesProperties
    }
}
