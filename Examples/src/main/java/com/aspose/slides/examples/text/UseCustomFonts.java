package com.aspose.slides.examples.text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class UseCustomFonts
{
    public static void main(String[] args)
    {
        //ExStart:UseCustomFonts
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        String[] loadFonts = new String[]{dataDir + "CustomFonts.ttf"};

        // Load the custom font directory fonts
        FontsLoader.loadExternalFonts(loadFonts);

        // Do Some work and perform presentation/slides rendering
        Presentation presentation = new Presentation(dataDir + "DefaultFonts.pptx");
        try
        {
            presentation.save(dataDir + "NewFonts_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

        // Clear Font Cachce
        FontsLoader.clearCache();
        //ExEnd:UseCustomFonts
    }
}

