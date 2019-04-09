/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Presentation.Hyperlinks;

import com.aspose.slides.FillType;
import com.aspose.slides.Hyperlink;
import com.aspose.slides.HyperlinkColorSource;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IPortionFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

/**
 *
 * @author mfazi
 */
public class SetHyperLinkColor {
    public static void main(String[] args) {
     //ExStart:SetHyperLinkColor
     // The path to the documents directory.
         String dataDir = Utils.getDataDir(SetHyperLinkColor.class);
        Presentation presentation = new Presentation();
        try {
         IAutoShape shape1 = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 450, 50, false);
         shape1.addTextFrame("This is a sample of colored hyperlink.");
         IPortionFormat portionFormat = shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat();
         portionFormat.setHyperlinkClick(new Hyperlink("https://www.aspose.com/"));
         portionFormat.getHyperlinkClick().setColorSource(HyperlinkColorSource.PortionFormat);
         portionFormat.getFillFormat().setFillType(FillType.Solid);
         portionFormat.getFillFormat().getSolidFillColor().setColor(java.awt.Color.RED);

         IAutoShape shape2 = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 200, 450, 50, false);
         shape2.addTextFrame("This is a sample of usual hyperlink.");
         shape2.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setHyperlinkClick(new Hyperlink("https://www.aspose.com/"));

         presentation.save(dataDir + "presentation-out.pptx", SaveFormat.Pptx);
        } finally {
         presentation.dispose();
        }
    //ExEnd:SetHyperLinkColor
    }
}
