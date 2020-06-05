package com.aspose.slides.examples.text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.examples.RunExamples;


public class GetFontsFolders
{
    public static void main(String[] args)
    {
        //ExStart:GetFontsFolders
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        //The following line shall return folders where font files are searched.
        //Those are folders that have been added with LoadExternalFonts method as well as system font folders.
        String[] fontFolders = FontsLoader.getFontFolders();

        //ExEnd:GetFontsFolders
    }
}

