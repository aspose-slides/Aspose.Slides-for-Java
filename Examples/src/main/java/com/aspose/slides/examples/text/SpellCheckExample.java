package com.aspose.slides.examples.text;

import com.aspose.slides.AutoShape;
import com.aspose.slides.IPortion;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class SpellCheckExample
{
    public static void main(String[] args)
    {
        String presentationName = RunExamples.getDataDir_Text() + "SpellChecksExample.pptx";
        String outPath = RunExamples.getOutPath() + "SpellChecksExample-out.pptx";

        //ExStart:SpellCheckExample
        Presentation pres = new Presentation(presentationName);
        try {
            // Access the first portion of text inside the first shape on the first slide
            IPortion portion = ((AutoShape)pres.getSlides().get_Item(0).getShapes().get_Item(0)).
                    getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0);

            // Read spell checking property
            System.out.println("SpellCheck is " + portion.getPortionFormat().getSpellCheck());

            // Disable spell checking for this text portion
            portion.getPortionFormat().setSpellCheck(false);

            // Save the modified presentation
            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SpellCheckExample
    }
}
