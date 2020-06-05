package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class HighlightText
{
    public static void main(String[] args)
    {

        //ExStart:HighlightText
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        Presentation presentation = new Presentation(dataDir + "SomePresentation.pptx");
        ((AutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightText("title", new Color(PresetColor.LightBlue));
        TextHighlightingOptions tmp0 = new TextHighlightingOptions();
        tmp0.setWholeWordsOnly(true); // highlighting all words 'important'
        ((AutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightText("to", new Color(PresetColor.Violet), tmp0); // highlighting all separate 'the' occurrences
        presentation.save(dataDir + "SomePresentation-out2.pptx", SaveFormat.Pptx);

        //ExEnd:HighlightText
    }
}

