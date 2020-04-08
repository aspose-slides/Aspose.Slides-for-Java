package com.aspose.slides.examples.Text;

import com.aspose.slides.FontFallBackRule;
import com.aspose.slides.FontFallBackRulesCollection;
import com.aspose.slides.IFontFallBackRule;
import com.aspose.slides.IFontFallBackRulesCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

import java.io.IOException;
import javax.imageio.ImageIO;


public class RenderingWithFallBackFont {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RenderingWithFallBackFont.class);

        //ExStart:RenderingWithFallBackFont
        // Create new instance of a rules collection
        IFontFallBackRulesCollection rulesList = new FontFallBackRulesCollection();

        // create a number of rules
        rulesList.add(new FontFallBackRule(0x400, 0x4FF, "Times New Roman"));

        for (IFontFallBackRule fallBackRule : rulesList) {
            //Trying to remove FallBack font "Tahoma" from loaded rules
            fallBackRule.remove("Tahoma");

            //And to update of rules for specified range
            if ((fallBackRule.getRangeEndIndex() >= 0x4000) && (fallBackRule.getRangeStartIndex() < 0x5000))
                fallBackRule.addFallBackFonts("Verdana");
        }

        //Also we can remove any existing rules from list
        if (rulesList.size() > 0)
            rulesList.remove(rulesList.get_Item(0));

        // Create an instance of Presentation class
        Presentation pres = new Presentation(dataDir + "input.pptx");
        try {
            //Assigning a prepared rules list for using
            pres.getFontsManager().setFontFallBackRulesCollection(rulesList);

            // Rendering of thumbnail with using of initialized rules collection and saving to PNG
            ImageIO.write(pres.getSlides().get_Item(0).getThumbnail(1f, 1f), "PNG", new java.io.File(dataDir + "Slide_0.png"));
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RenderingWithFallBackFont
    }
}
