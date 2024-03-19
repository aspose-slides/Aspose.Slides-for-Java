package com.aspose.slides.examples.slides.hyperlinks;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class ExternalUrlOriginal
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Hyperlink();

        //ExStart:ExternalUrlOriginal

        // Instantiate Presentation class
        Presentation presentation = new Presentation(dataDir + "ExternalUrlOriginal.pptx");
        try {
            IPortion portion = ((AutoShape)presentation.getSlides().get_Item(0)
                    .getShapes().get_Item(1)).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0);

            // Shows fake hyperlink
            System.out.println("Fake External Hyperlink : " + portion.getPortionFormat().getHyperlinkClick().getExternalUrl());

            // Shows real hyperlink
            System.out.println("Real External Hyperlink : " + portion.getPortionFormat().getHyperlinkClick().getExternalUrlOriginal());
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ExternalUrlOriginal
    }
}
