package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class EffectTextBoxParagraph
{
    public static void main(String[] args)
    {
        //ExStart:EffectTextBoxParagraph
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "Test.pptx");
        try
        {
            ISequence sequence = pres.getSlides().get_Item(0).getTimeline().getMainSequence();
            IAutoShape autoShape = (IAutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(1);

            for (IParagraph paragraph : autoShape.getTextFrame().getParagraphs())
            {
                IEffect[] effects = sequence.getEffectsByParagraph(paragraph);

                if (effects.length > 0)
                    System.out.println("Paragraph \"" + paragraph.getText() + "\" has " + effects[0].getType() + " effect.");
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:EffectTextBoxParagraph
    }
}

