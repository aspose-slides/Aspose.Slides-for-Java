package com.aspose.slides.examples.text;

import com.aspose.slides.IPresentation;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SpecifyFontsUsedWithPresentation
{
    public static void main(String[] args) throws IOException
    {
        // ExStart:SpecifyFontsUsedWithPresentation
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        byte[] memoryFont1 = Files.readAllBytes(Paths.get(dataDir + "customfonts\\CustomFont1.ttf"));
        byte[] memoryFont2 = Files.readAllBytes(Paths.get(dataDir + "customfonts\\CustomFont2.ttf"));

        LoadOptions loadOptions = new LoadOptions();
        loadOptions.getDocumentLevelFontSources().setFontFolders(new String[]{"assets\\fonts", "global\\fonts"});
        loadOptions.getDocumentLevelFontSources().setMemoryFonts(new byte[][]{memoryFont1, memoryFont2});

        IPresentation presentation = new Presentation("MyPresentation.pptx", loadOptions);
        try
        {
            //work with the presentation
            //CustomFont1, CustomFont2 as well as fonts from assets\fonts & global\fonts folders and their subfolders are available to the presentation
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        // ExEnd:SpecifyFontsUsedWithPresentation
    }
}

