package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.SmartArtNode;
import com.aspose.slides.SmartArtNodeCollection;
import com.aspose.slides.examples.Utils;

public class AddingSmartArtShapeNodeAtSpecificPosition {

    public static void main(String[] args) {
        //ExStart:AddingSmartArtShapeNodeAtSpecificPosition
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingSmartArtShapeNodeAtSpecificPosition.class);

        // Creating a presentation instance
        Presentation pres = new Presentation();
        try {
            // Access the presentation slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Add Smart Art IShape
            ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.StackedList);

            // Accessing the SmartArt node at index 0
            ISmartArtNode node = smart.getAllNodes().get_Item(0);

            // Adding new child node at position 2 in parent node
            SmartArtNode chNode = (SmartArtNode) node.getChildNodes().addNodeByPosition(2);

            // Add Text
            chNode.getTextFrame().setText("Sample Text Added");

            // Save Presentation
            pres.save(dataDir + "AddSmartArtNodeByPosition.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingSmartArtShapeNodeAtSpecificPosition
    }

}
