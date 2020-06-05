package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class CustomChildNodesInSmartArt
{
    public static void main(String[] args)
    {
        //ExStart:CustomChildNodesInSmartArt
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Load the desired the presentation
        Presentation pres = new Presentation(dataDir + "AccessChildNodes.pptx");

        {
            ISmartArt smart = pres.getSlides().get_Item(0).getShapes().addSmartArt(20, 20, 600, 500, SmartArtLayoutType.OrganizationChart);

            // Move SmartArt shape to new position
            ISmartArtNode node = smart.getAllNodes().get_Item(1);
            ISmartArtShape shape = node.getShapes().get_Item(1);
            shape.setX(shape.getX() + (shape.getWidth() * 2));
            shape.setY(shape.getY() - (shape.getHeight() / 2));

            // Change SmartArt shape's widths
            node = smart.getAllNodes().get_Item(2);
            shape = node.getShapes().get_Item(1);
            shape.setWidth(shape.getWidth() + (shape.getWidth() / 2));

            // Change SmartArt shape's height
            node = smart.getAllNodes().get_Item(3);
            shape = node.getShapes().get_Item(1);
            shape.setHeight(shape.getHeight() + (shape.getHeight() / 2));

            // Change SmartArt shape's rotation
            node = smart.getAllNodes().get_Item(4);
            shape = node.getShapes().get_Item(1);
            shape.setRotation(90);

            pres.save(dataDir + "SmartArt.pptx", SaveFormat.Pptx);
        }
        //ExEnd:CustomChildNodesInSmartArt
    }
}
