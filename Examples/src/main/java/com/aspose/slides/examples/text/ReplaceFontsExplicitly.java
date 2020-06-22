package com.aspose.slides.examples.text;

import com.aspose.slides.FontData;
import com.aspose.slides.IFontData;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class ReplaceFontsExplicitly
{
    public static void main(String[] args)
    {
        //ExStart:ReplaceFontsExplicitly
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Load presentation
        Presentation presentation = new Presentation(dataDir + "Fonts.pptx");

        // Load source font to be replaced
        IFontData sourceFont = new FontData("Arial");

        // Load the replacing font
        IFontData destFont = new FontData("Times New Roman");

        // Replace the fonts
        presentation.getFontsManager().replaceFont(sourceFont, destFont);

        // Save the presentation
        presentation.save(dataDir + "UpdatedFont_out.pptx", SaveFormat.Pptx);
        //ExEnd:ReplaceFontsExplicitly
    }
}
