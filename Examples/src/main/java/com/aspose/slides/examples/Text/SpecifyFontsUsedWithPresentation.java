package com.aspose.slides.examples.Text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class EmbedFontsInHtml {

	public static void main(String[] args) {

		ExStart:SpecifyFontsUsedWithPresentation
               // The path to the documents directory.
		String dataDir = Utils.getDataDir(EmbedFontsInHtml.class);
                byte[] memoryFont1 = ReadAllBytesFromFile("customfonts\\CustomFont1.ttf");
                byte[] memoryFont2 = ReadAllBytesFromFile("customfonts\\CustomFont2.ttf");

                ILoadOptions loadOptions = new LoadOptions();
                loadOptions.getDocumentLevelFontSources().setFontFolders(new String[] { "assets\\fonts", "global\\fonts" });
                loadOptions.getDocumentLevelFontSources().setMemoryFonts(new byte[][] { memoryFont1, memoryFont2 });
                IPresentation presentation = CreatePresentation("MyPresentation.pptx", loadOptions);
        try{
                //work with the presentation
               //CustomFont1, CustomFont2 as well as fonts from assets\fonts & global\fonts folders and their subfolders are available to the presentation
           }          
            finally {
               presentation.dispose();
           }
	
                  
//                ExEnd:SpecifyFontsUsedWithPresentation 
}
