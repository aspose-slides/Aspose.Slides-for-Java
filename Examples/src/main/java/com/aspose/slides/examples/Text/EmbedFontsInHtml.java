package com.aspose.slides.examples.Text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.ILoadOptions;
import com.aspose.slides.IPresentation;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;
import java.io.IOException;

public class EmbedFontsInHtml {

	public static void main(String[] args) throws IOException {

		//ExStart:EmbedFontsInHtml

               // The path to the documents directory.
		String dataDir = Utils.getDataDir(EmbedFontsInHtml.class);
             //   byte[] memoryFont1 = ReadAllBytesFromFile("customfonts\\CustomFont1.ttf");
              //  byte[] memoryFont2 = ReadAllBytesFromFile("customfonts\\CustomFont2.ttf");
                  Path path = Paths.get("path/to/file");
                 byte[] memoryFont1 = Files.readAllBytes(path);
                  byte[] memoryFont2 = Files.readAllBytes(path);
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
	
                  
             //ExEnd:EmbedFontsInHtml
}

    private static IPresentation CreatePresentation(String myPresentationpptx, ILoadOptions loadOptions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}