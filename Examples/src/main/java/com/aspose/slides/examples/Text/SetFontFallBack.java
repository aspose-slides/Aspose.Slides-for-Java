package com.aspose.slides.examples.Text;

import com.aspose.slides.FontFallBackRule;
import com.aspose.slides.IFontFallBackRule;
import com.aspose.slides.examples.Utils;


public class SetFontFallBack {

    public static void main(String[] args) {

        //ExStart:SetFontFallBack
        long startUnicodeIndex = 0x0B80;
        long endUnicodeIndex = 0x0BFF;

        IFontFallBackRule firstRule = new FontFallBackRule(startUnicodeIndex, endUnicodeIndex, "Vijaya");
        IFontFallBackRule secondRule = new FontFallBackRule(0x3040, 0x309F, "MS Mincho, MS Gothic");

        //Also the fonts list can be added in several ways:
        String[] fontNames = new String[]{"Segoe UI Emoji, Segoe UI Symbol", "Arial"};

        IFontFallBackRule thirdRule = new FontFallBackRule(0x1F300, 0x1F64F, fontNames);
        //ExEnd:SetFontFallBack
    }
}
