package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.SmartArtNode;
import com.aspose.slides.SmartArtNodeCollection;
import com.aspose.slides.examples.Utils;

public class AccessingSmartArtShapeChildNodeAtSpecificPosition {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessingSmartArtShapeChildNodeAtSpecificPosition.class);

        //ExStart:AccessingSmartArtShapeChildNodeAtSpecificPosition
        // Instantiate the presentation
        Presentation pres = new Presentation();
        try {
            // Accessing the first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Adding the SmartArt shape in first slide
            ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.StackedList);

            // Accessing the SmartArt node at index 0
            ISmartArtNode node = smart.getAllNodes().get_Item(0);

            // Accessing the child node at position 1 in parent node
            int position = 1;
            SmartArtNode chNode = (SmartArtNode) node.getChildNodes().get_Item(position);

            // Printing the SmartArt child node parameters
            System.out.print("Text = " + chNode.getTextFrame().getText() + ",  Level = " + chNode.getLevel() + ", Position = " + chNode.getPosition());
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessingSmartArtShapeChildNodeAtSpecificPosition
    }

}
