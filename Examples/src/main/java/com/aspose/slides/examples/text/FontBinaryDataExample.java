package com.aspose.slides.examples.text;

import com.aspose.slides.FontStyle;
import com.aspose.slides.IFontData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FontBinaryDataExample
{
    public static void main(String[] args) throws IOException
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        //ExStart:FontBinaryDataExample
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try {
            // Retrieve all fonts used in the presentation
            IFontData[] fonts = pres.getFontsManager().getFonts();

            // Get the byte array representing the regular style of the first font in the presentation
            byte[] bytes = pres.getFontsManager().getFontBytes(fonts[0], FontStyle.Regular);

            // The path to output file
            String outFilePath = RunExamples.getOutPath() + fonts[0].getFontName() + ".ttf";

            // Save font
            Files.write(Paths.get(outFilePath), bytes);
        } finally {
            if (pres != null)
                pres.dispose();
        }
        //ExEnd:FontBinaryDataExample
    }
}
