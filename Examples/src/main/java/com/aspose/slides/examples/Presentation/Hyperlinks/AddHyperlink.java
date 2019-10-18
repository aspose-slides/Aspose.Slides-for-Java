

package com.aspose.slides.examples.Presentation.Hyperlinks;

import com.aspose.slides.Hyperlink;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;


public class AddHyperlink {

    public static void main(String[] args) {
        
        //ExStart:AddHyperlink
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddHyperlink.class);
        
        Presentation presentation = new Presentation();
        
        IAutoShape shape1 = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 600, 50, false);
                shape1.addTextFrame("Aspose: File Format APIs");
                shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setHyperlinkClick(new Hyperlink("https://www.aspose.com/"));
                shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getHyperlinkClick().setTooltip( "More than 70% Fortune 100 companies trust Aspose APIs");
                shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(32);

                presentation.save(dataDir+ "presentation-out.pptx", SaveFormat.Pptx);
        //ExEnd:AddHyperlink
    }
}
