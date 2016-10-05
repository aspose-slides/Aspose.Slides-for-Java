package com.aspose.slides.examples.Text;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.IFontData;
import com.aspose.slides.IFontsManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ManagingEmbeddedFonts {

	private static final String dataDir = Utils.getSharedDataDir(ManagingEmbeddedFonts.class) + "Text/";
	
	public static void main(String[] args) throws IOException {
		// load the presentation with embedded "Calibri" font in it
		Presentation pres = new Presentation(dataDir + "Pres.pptx");
		try {
			// render the presentation containing the text frame with the text using embedded "Calibri" font
			ImageIO.write(pres.getSlides().get_Item(0).getThumbnail(new Dimension(960, 720)), "PNG", new File(dataDir + "pres-1.png"));

			IFontsManager fontsManager = pres.getFontsManager();

			// get all embedded fonts
			IFontData[] embeddedFonts = fontsManager.getEmbeddedFonts();

			// find "Calibri" font
			IFontData calibriEmbeddedFont = null;
			for (int i = 0; i < embeddedFonts.length; i++) {
				System.out.println(""+ embeddedFonts[i].getFontName());
				if ("Calibri".equals(embeddedFonts[i].getFontName())) {
					calibriEmbeddedFont = embeddedFonts[i];
					break;
				}
			}
			
			// remove "Calibri" font
			fontsManager.removeEmbeddedFont(calibriEmbeddedFont);

			// render the presentation after removing the "FunSized" font resulting in a font replacement from "FunSized" to an existing one
			ImageIO.write(pres.getSlides().get_Item(0).getThumbnail(new Dimension(960, 720)), "PNG", new File(dataDir + "pres-2.png"));

			// save the presentation without embedded "Calibri" font
			pres.save(dataDir + "WithoutEmbeddedFont_out.ppt", SaveFormat.Ppt);
		} finally {
			if (pres != null)
				pres.dispose();
		}
	}
}
