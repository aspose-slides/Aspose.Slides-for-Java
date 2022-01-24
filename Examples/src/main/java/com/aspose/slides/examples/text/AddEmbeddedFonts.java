package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AddEmbeddedFonts
{
    public static void main(String[] args)
    {
        //ExStart:AddEmbeddedFonts
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Load presentation
        Presentation presentation = new Presentation(dataDir + "Fonts.pptx");

        // Load source font to be replaced
        IFontData sourceFont = new FontData("Arial");


        IFontData[] allFonts = presentation.getFontsManager().getFonts();
        IFontData[] embeddedFonts = presentation.getFontsManager().getEmbeddedFonts();
        for (IFontData font : allFonts)
        {
            boolean embeddedFontsContainsFont = false;
            for (int i = 0; i < embeddedFonts.length; i++)
            {
                if (embeddedFonts[i].equals(font))
                {
                    embeddedFontsContainsFont = true;
                    break;
                }
            }
            if (!embeddedFontsContainsFont)
            {
                presentation.getFontsManager().addEmbeddedFont(font, EmbedFontCharacters.All);

                embeddedFonts = presentation.getFontsManager().getEmbeddedFonts();
            }
        }

        // Save the presentation
        presentation.save(dataDir + "AddEmbeddedFont_out.pptx", SaveFormat.Pptx);
        //ExEnd:AddEmbeddedFonts
    }
}
