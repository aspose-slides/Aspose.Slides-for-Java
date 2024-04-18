package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class ManageEmbeddedFonts
{
    public static void main(String[] args)
    {
        //ExStart:ManageEmbeddedFonts
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "EmbeddedFonts.pptx");
        try
        {
            // render a slide that contains a text frame that uses embedded "FunSized"
            presentation.getSlides().get_Item(0).getImage(new Dimension(960, 720))
                    .save(dataDir + "picture1_out.png", ImageFormat.Png);

            IFontsManager fontsManager = presentation.getFontsManager();

            // get all embedded fonts
            IFontData[] embeddedFonts = fontsManager.getEmbeddedFonts();

            // find "Calibri" font
            IFontData funSizedEmbeddedFont = null;
            for (IFontData embeddedFont : embeddedFonts)
            {
                if ("Calibri".equals(embeddedFont.getFontName()))
                {
                    funSizedEmbeddedFont = embeddedFont;
                    break;
                }
            }
            // remove "Calibri" font
            if (funSizedEmbeddedFont != null) fontsManager.removeEmbeddedFont(funSizedEmbeddedFont);

            // render the presentation; removed "Calibri" font is replaced to an existing one
            presentation.getSlides().get_Item(0).getImage(new Dimension(960, 720))
                    .save(dataDir + "picture2_out.png", ImageFormat.Png);

            // save the presentation without embedded "Calibri" font
            presentation.save(dataDir + "WithoutManageEmbeddedFonts_out.ppt", SaveFormat.Ppt);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ManageEmbeddedFonts
    }
}
