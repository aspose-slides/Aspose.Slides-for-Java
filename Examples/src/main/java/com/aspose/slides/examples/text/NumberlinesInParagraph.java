package com.aspose.slides.examples.text;

import com.aspose.slides.*;


public class NumberlinesInParagraph
{
    //ExStart:NumberlinesInParagraph
    public static void main(String[] args)
    {
        Presentation presentation = new Presentation();
        try {
            ISlide sld = presentation.getSlides().get_Item(0);
            IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);
            IParagraph para = ashp.getTextFrame().getParagraphs().get_Item(0);
            IPortion portion = para.getPortions().get_Item(0);
            portion.setText("Aspose Paragraph GetLinesCount() Example");

            System.out.println("Lines Count = " + para.getLinesCount());

            // Change shape width
            ashp.setWidth(250);
            System.out.println("Lines Count after changing shape width = " + para.getLinesCount());
        } finally {
            if (presentation != null) presentation.dispose();
        }
    }
    //ExEnd:NumberlinesInParagraph
}
