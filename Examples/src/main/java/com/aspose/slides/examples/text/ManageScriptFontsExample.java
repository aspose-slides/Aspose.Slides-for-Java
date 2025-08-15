package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;

public class ManageScriptFontsExample
{
    public static void main(String[] args)
    {
        //ExStart:ManageScriptFontsExample
        Presentation pres = new Presentation();
        try {
            // Get all script mapping
            Dictionary<String, String> scriptFontMap = pres.getMasterTheme().getFontScheme().getMajor().getScriptFontMap();
            for (KeyValuePair<String, String> kvp : scriptFontMap)
            {
                System.out.println(kvp.getKey() + " = " + kvp.getValue());
            }

            // Get script font
            System.out.println("Font for \"Thaa\" tag is " + pres.getMasterTheme().getFontScheme().getMajor().getScriptFont("Thaa"));

            // Set script font
            pres.getMasterTheme().getFontScheme().getMajor().setScriptFont("Thaa", "Super Thaa");
            pres.getMasterTheme().getFontScheme().getMinor().removeScriptFont("Geor");

            // Check script font
            System.out.println("Font for \"Thaa\" tag is " + pres.getMasterTheme().getFontScheme().getMajor().getScriptFont("Thaa"));
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ManageScriptFontsExample
    }
}
