package com.aspose.slides.examples.text;

import com.aspose.slides.IFontData;
import com.aspose.slides.IFontsManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class ManageEmbeddedFonts
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:ManageEmbeddedFonts
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "EmbeddedFonts.pptx");
        try
        {
            // render a slide that contains a text frame that uses embedded "FunSized"
            BufferedImage image1 = presentation.getSlides().get_Item(0).getThumbnail(new Dimension(960, 720));
            ImageIO.write(image1, ".png", new File(dataDir + "picture1_out.png"));

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
            BufferedImage image2 = presentation.getSlides().get_Item(0).getThumbnail(new Dimension(960, 720));
            ImageIO.write(image2, ".png", new File(dataDir + "picture2_out.png"));

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
