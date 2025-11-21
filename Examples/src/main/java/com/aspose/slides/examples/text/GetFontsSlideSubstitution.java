package com.aspose.slides.examples.text;

import com.aspose.slides.FontSubstitutionInfo;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

/*
Thise example demonstrates how to obtain information about fonts
that will be substituted during the rendering of the specified slides.
*/
public class GetFontsSlideSubstitution
{
    public static void main(String[] args)
    {
        // The path to the document directory.
        String dataDir = RunExamples.getDataDir_Text();

        //ExStart:GetFontsSlideSubstitution
        Presentation pres = new Presentation(dataDir + "PresFontsSubst.pptx");
        try {
            for (FontSubstitutionInfo fontSubstitution : pres.getFontsManager().getSubstitutions(new int[] {1, 2}))
            {
                System.out.println(fontSubstitution.getOriginalFontName() + " -> " + fontSubstitution.getSubstitutedFontName());
            }
        } finally {
            if (pres != null) pres.dispose();
        }

        //ExEnd:GetFontsSlideSubstitution
    }
}
