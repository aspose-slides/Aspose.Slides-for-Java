/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Presentation.Hyperlinks;

import com.aspose.slides.Hyperlink;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IPortionFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

/**
 * @author mfazi
 */
public class MutableHyperlink {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(MutableHyperlink.class);

        //ExStart:MutableHyperlink
        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation();
        try {
            IAutoShape shape1 = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 600, 50, false);
            shape1.addTextFrame("Aspose: File Format APIs");
            IPortionFormat portionFormat = shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat();
            portionFormat.setHyperlinkClick(new Hyperlink("https://www.aspose.com/"));
            portionFormat.getHyperlinkClick().setTooltip("More than 70% Fortune 100 companies trust Aspose APIs");
            portionFormat.setFontHeight(32);

            presentation.save(dataDir + "presentation-out.pptx", SaveFormat.Pptx);
        } finally {
            presentation.dispose();
        }
        //ExEnd:MutableHyperlink
    }

}
