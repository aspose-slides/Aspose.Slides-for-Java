package com.aspose.slides.examples.Text;

import com.aspose.slides.IPresentation;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


import java.io.IOException;

public class EmbedFontsInHtml {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(EmbedFontsInHtml.class);

        //ExStart:EmbedFontsInHtml
        Path path = Paths.get("path/to/font");
        byte[] memoryFont1 = Files.readAllBytes(path);

        LoadOptions loadOptions = new LoadOptions();
        loadOptions.getDocumentLevelFontSources().setFontFolders(new String[]{"assets\\fonts", "global\\fonts"});
        loadOptions.getDocumentLevelFontSources().setMemoryFonts(new byte[][]{memoryFont1});

        // Create an instance of Presentation class
        IPresentation presentation = new Presentation(dataDir + "MyPresentation.pptx", loadOptions);
        try {
            //work with the presentation
            //CustomFont1, CustomFont2 as well as fonts from assets\fonts & global\fonts folders and their subfolders are available to the presentation
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:EmbedFontsInHtml
    }

}