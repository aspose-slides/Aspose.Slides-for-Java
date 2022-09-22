package com.aspose.slides.examples.text;

import com.aspose.slides.FontSubstitutionInfo;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

public class GetFontsSubstitution
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        //ExStart:GetFontsSubstitution
        Presentation pres = new Presentation(dataDir + "PresFontsSubst.pptx");
        try {
            for (FontSubstitutionInfo fontSubstitution : pres.getFontsManager().getSubstitutions())
            {
                System.out.println(fontSubstitution.getOriginalFontName() + " -> " + fontSubstitution.getSubstitutedFontName());
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GetFontsSubstitution
    }
}
