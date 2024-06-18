package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class HighlightText
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        //ExStart:HighlightText
        Presentation presentation = new Presentation(dataDir + "SomePresentation.pptx");
        // highlighting all words 'title'
        ((AutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightText("title", Color.BLUE);
        TextSearchOptions textSearchOptions = new TextSearchOptions();
        textSearchOptions.setWholeWordsOnly(true);
        // highlighting all separate 'to' occurrences
        ((AutoShape)presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightText("to", Color.MAGENTA, textSearchOptions, null);

        presentation.save(RunExamples.getOutPath() + "SomePresentation-out2.pptx", SaveFormat.Pptx);

        //ExEnd:HighlightText
    }
}

