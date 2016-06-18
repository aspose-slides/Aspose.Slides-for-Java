package com.aspose.slides.examples.Text;

import com.aspose.slides.FontData;
import com.aspose.slides.FontSubstCondition;
import com.aspose.slides.FontSubstRule;
import com.aspose.slides.FontSubstRuleCollection;
import com.aspose.slides.IFontData;
import com.aspose.slides.IFontSubstRule;
import com.aspose.slides.IFontSubstRuleCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class RuleBasedFontsReplacementInsidePresentation {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RuleBasedFontsReplacementInsidePresentation.class);

		// Load presentation
		Presentation pres = new Presentation(dataDir + "Fonts.pptx");

		// Load source font to be replaced
		IFontData sourceFont = new FontData("SomeRareFont");

		// Load the replacing font
		IFontData destFont = new FontData("Arial");

		// Add font rule for font replacement
		IFontSubstRule fontSubstRule = new FontSubstRule(sourceFont, destFont, FontSubstCondition.WhenInaccessible);

		// Add rule to font substitute rules collection
		IFontSubstRuleCollection fontSubstRuleCollection = new FontSubstRuleCollection();
		fontSubstRuleCollection.add(fontSubstRule);

		// Add font rule collection to rule list
		pres.getFontsManager().setFontSubstRuleList(fontSubstRuleCollection);

	}

}
