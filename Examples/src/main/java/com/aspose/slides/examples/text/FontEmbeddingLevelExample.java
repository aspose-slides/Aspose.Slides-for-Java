package com.aspose.slides.examples.text;

import com.aspose.slides.FontStyleType;
import com.aspose.slides.IFontData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;

public class FontEmbeddingLevelExample
{
    public static void main(String[] args) throws IOException
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        //ExStart:FontEmbeddingLevelExample
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try {
            // Retrieve all fonts used in the presentation
            IFontData[] fontDatas = pres.getFontsManager().getFonts();

            // Get the byte array representing the regular style of the first font in the presentation
            byte[] bytes = pres.getFontsManager().getFontBytes(fontDatas[0], FontStyleType.Regular);

            // Determine the embedding level of the font
            int embeddingLevel = pres.getFontsManager().getFontEmbeddingLevel(bytes, fontDatas[0].getFontName());

            // Print embedding level to console
            System.out.println(String.format("Font \"%s\" has \"%d\" Embedding Level", fontDatas[0].getFontName(), embeddingLevel));
        } finally {
            if (pres != null)
                pres.dispose();
        }
        //ExEnd:FontEmbeddingLevelExample
    }
}
