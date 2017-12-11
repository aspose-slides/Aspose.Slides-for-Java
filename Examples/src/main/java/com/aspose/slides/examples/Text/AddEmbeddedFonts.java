package com.aspose.slides.examples.Text;

import com.aspose.slides.EmbedFontCharacters;
import com.aspose.slides.FontsLoader;
import com.aspose.slides.IFontData;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddEmbeddedFonts  {

	public static void main(String[] args) {
            
// ExStart:AddEmbeddedFonts
		// The path to the documents directory.
		
         String dataDir = Utils.getDataDir(AddEmbeddedFonts.class);
Presentation pres=new Presentation(dataDir+"");
IFontData[] allFonts = pres.getFontsManager().getFonts();
IFontData[] embeddedFonts = pres.getFontsManager().getEmbeddedFonts();
for (IFontData font : except(allFonts, embeddedFonts))
{
pres.getFontsManager().addEmbeddedFont(font,EmbedFontCharacters.All);
}
              // ExEnd:AddEmbeddedFonts
	
}

    private static Iterable<IFontData> except(IFontData[] allFonts, IFontData[] embeddedFonts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
