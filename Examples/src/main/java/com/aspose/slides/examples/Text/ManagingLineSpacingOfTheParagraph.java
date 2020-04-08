package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ManagingLineSpacingOfTheParagraph {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ManagingLineSpacingOfTheParagraph.class);

        //ExStart:ManagingLineSpacingOfTheParagraph
        // Loading a presentation with an AutoShape having some text in it.
        Presentation pres = new Presentation(dataDir + "Paragraphs.pptx");
        try {
            // Obtain a slide's reference by its index
            ISlide sld = pres.getSlides().get_Item(0);

            // Access the TextFrame
            ITextFrame tf = ((IAutoShape) sld.getShapes().get_Item(0)).getTextFrame();

            // Access the Paragraph
            IParagraph para = tf.getParagraphs().get_Item(0);

            // Set properties of Paragraph
            para.getParagraphFormat().setSpaceWithin(80);
            para.getParagraphFormat().setSpaceBefore(40);
            para.getParagraphFormat().setSpaceAfter(40);

            // SAVING presentation
            pres.save(dataDir + "LineSpacing.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ManagingLineSpacingOfTheParagraph
    }

}
