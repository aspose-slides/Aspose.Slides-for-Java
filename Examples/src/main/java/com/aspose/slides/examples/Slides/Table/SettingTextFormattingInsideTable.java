package com.aspose.slides.examples.Slides.Table;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.ParagraphFormat;
import com.aspose.slides.PortionFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.TextAlignment;
import com.aspose.slides.TextFrameFormat;
import com.aspose.slides.TextVerticalType;
import com.aspose.slides.examples.Utils;

public class SettingTextFormattingInsideTable {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SettingTextFormattingInsideTable.class);

        //ExStart:SettingTextFormattingInsideTable
        // Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation(dataDir + "presWithTable.pptx");
        try {
            // Access first slide
            ISlide sld = pres.getSlides().get_Item(0);
            ITable someTable = (ITable) sld.getShapes().get_Item(0); // let's say that the first shape on the first slide is a table

            // setting table cells' font height
            PortionFormat portionFormat = new PortionFormat();
            portionFormat.setFontHeight(25);
            someTable.setTextFormat(portionFormat);

            // setting table cells' text alignment and right margin in one call
            ParagraphFormat paragraphFormat = new ParagraphFormat();
            paragraphFormat.setAlignment(TextAlignment.Right);
            paragraphFormat.setMarginRight(20);
            someTable.setTextFormat(paragraphFormat);

            // setting table cells' text vertical type
            TextFrameFormat textFrameFormat = new TextFrameFormat();
            textFrameFormat.setTextVerticalType(TextVerticalType.Vertical);
            someTable.setTextFormat(textFrameFormat);

            // Save the PPTX to Disk
            pres.save(dataDir + "Textbox.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SettingTextFormattingInsideTable
    }

}
