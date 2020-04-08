/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Text;

import com.aspose.slides.AutoShape;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.TextFrameFormat;
import com.aspose.slides.examples.Utils;

/**
 * @author mfazi
 */
public class AddColumnsinTextFrame {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddColumnsinTextFrame.class);

        //ExStart:AddColumnsinTextFrame
        // Create an instance of Presentation class
        Presentation pres = new Presentation();
        try {
            // Get the first slide of presentation
            ISlide slide = pres.getSlides().get_Item(0);
            IAutoShape shape1 = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 300, 300);
            TextFrameFormat format = (TextFrameFormat) shape1.getTextFrame().getTextFrameFormat();

            format.setColumnCount(2);
            shape1.getTextFrame().setText("All these columns are limited to be within a single text container -- " +
                    "you can add or delete text and the new or remaining text automatically adjusts " +
                    "itself to flow within the container. You cannot have text flow from one container " +
                    "to other though -- we told you PowerPoint's column options for text are limited!");

            pres.save(dataDir + "ColumnsTest.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddColumnsinTextFrame
    }
}
