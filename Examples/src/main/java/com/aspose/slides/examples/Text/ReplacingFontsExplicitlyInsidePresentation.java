package com.aspose.slides.examples.Text;

import com.aspose.slides.FontData;
import com.aspose.slides.IFontData;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ReplacingFontsExplicitlyInsidePresentation {

	public static void main(String[] args) {
                 //ExStart:ReplacingFontsExplicitlyInsidePresentation
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReplacingFontsExplicitlyInsidePresentation.class);

		// Load presentation
		Presentation pres = new Presentation(dataDir + "PresContainsArialFont.pptx");

		// Load source font to be replaced
		IFontData sourceFont = new FontData("Arial");

		// Load the replacing font
		IFontData destFont = new FontData("Times New Roman");

		// Replace the fonts
		pres.getFontsManager().replaceFont(sourceFont, destFont);

		// Save the presentation
		pres.save(dataDir + "PresContainsTimesNoewRomanFont.pptx", SaveFormat.Pptx);
               //ExEnd:ReplacingFontsExplicitlyInsidePresentation
	}

}
