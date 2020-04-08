/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.ISmartArtShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;


public class CustomChildNodesInSmartArt {


    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CustomChildNodesInSmartArt.class);

        //ExStart:CustomChildNodesInSmartArt
        // Instantiate Presentation Class
        Presentation pres = new Presentation(dataDir + "SimpleSmartArt.pptx");
        try {
            ISmartArt smart = pres.getSlides().get_Item(0).getShapes().addSmartArt(20, 20, 600, 500, SmartArtLayoutType.OrganizationChart);

            // Move SmartArt shape to new position
            ISmartArtNode node = smart.getAllNodes().get_Item(1);
            ISmartArtShape shape = node.getShapes().get_Item(1);
            shape.setX(shape.getX() + shape.getWidth() * 2);
            shape.setY(shape.getY() - shape.getHeight() * 2);

            // Change SmartArt shape's widths
            node = smart.getAllNodes().get_Item(2);
            shape = node.getShapes().get_Item(1);
            shape.setWidth(shape.getWidth() + shape.getWidth() * 2);

            // Change SmartArt shape's height
            node = smart.getAllNodes().get_Item(3);
            shape = node.getShapes().get_Item(1);
            shape.setHeight(shape.getHeight() + shape.getHeight() * 2);

            // Change SmartArt shape's rotation
            node = smart.getAllNodes().get_Item(4);
            shape = node.getShapes().get_Item(1);
            shape.setRotation(90);

            pres.save(dataDir + "SmartArt.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CustomChildNodesInSmartArt
    }

}
