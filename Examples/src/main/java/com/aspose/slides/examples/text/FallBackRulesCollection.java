package com.aspose.slides.examples.text;

import com.aspose.slides.FontFallBackRule;
import com.aspose.slides.FontFallBackRulesCollection;
import com.aspose.slides.IFontFallBackRulesCollection;
import com.aspose.slides.Presentation;


public class FallBackRulesCollection
{
    public static void main(String[] args)
    {

        //ExStart:FallBackRulesCollection

        Presentation presentation = new Presentation();
        try
        {
            IFontFallBackRulesCollection userRulesList = new FontFallBackRulesCollection();

            userRulesList.add(new FontFallBackRule(0x0B80, 0x0BFF, "Vijaya"));
            userRulesList.add(new FontFallBackRule(0x3040, 0x309F, "MS Mincho, MS Gothic"));

            presentation.getFontsManager().setFontFallBackRulesCollection(userRulesList);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:FallBackRulesCollection

    }
}

