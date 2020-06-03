package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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
                if (embeddedFonts.equals(font)) embeddedFontsContainsFont = true;
            }
            if (!embeddedFontsContainsFont)
            {
                presentation.getFontsManager().addEmbeddedFont(font, EmbedFontCharacters.All);
            }
        }

        // Save the presentation
        presentation.save(dataDir + "AddEmbeddedFont_out.pptx", SaveFormat.Pptx);
        //ExEnd:AddEmbeddedFonts
    }
}
