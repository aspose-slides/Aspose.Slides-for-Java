package com.aspose.slides.examples.slides.hyperlinks;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class MutableHyperlink
{

    public static void main(String[] args)
    {

        //ExStart:MutableHyperlink
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Hyperlink();

        Presentation presentation = new Presentation();
        try
        {

            IAutoShape shape1 = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 600, 50, false);
            shape1.addTextFrame("Aspose: File Format APIs");
            shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setHyperlinkClick(new Hyperlink("https://www.aspose.com/"));
            shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getHyperlinkClick().setTooltip("More than 70% Fortune 100 companies trust Aspose APIs");
            shape1.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(32);

            presentation.save(dataDir + "presentation-out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:MutableHyperlink

    }
}

