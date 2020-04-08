/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Transitions;

import com.aspose.slides.AutoShape;
import com.aspose.slides.IShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

/**
 * @author mfazi
 */
public class SupportOfMorphTransition {
    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SimpleTransition.class);

        //ExStart:SupportOfMorphTransition
        // Create an instance of Presentation class
        Presentation presentation = new Presentation();
        try {
            AutoShape autoshape = (AutoShape) presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 400, 100);
            autoshape.getTextFrame().setText("Test text");

            presentation.getSlides().addClone(presentation.getSlides().get_Item(0));

            IShape shape = presentation.getSlides().get_Item(1).getShapes().get_Item(0);
            shape.setX(shape.getX() + 100);
            shape.setY(shape.getY() + 50);
            shape.setWidth(shape.getWidth() - 200);
            shape.setHeight(shape.getHeight() - 10);

            presentation.getSlides().get_Item(1).getSlideShowTransition().setType(com.aspose.slides.TransitionType.Morph);

            presentation.save(dataDir + "presentation-out.pptx", SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SupportOfMorphTransition
    }

}
