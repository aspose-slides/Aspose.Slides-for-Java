package com.aspose.slides.examples.text;

import com.aspose.slides.FontsLoader;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class LoadExternalFont

{
    public static void main(String[] args) throws IOException
    {
        // ExStart:LoadExternalFont

        // The path to the documents directory.

        String dataDir = RunExamples.getDataDir_Text();


        // loading presentation uses SomeFont which is not installed on the system
        Presentation pres = new Presentation();
        try
        {
            // load SomeFont from file into the byte array
            Path path = Paths.get(dataDir + "CustomFonts.ttf");
            byte[] fontData = Files.readAllBytes(path);

            // load font represented as byte array
            FontsLoader.loadExternalFont(fontData);

            // font SomeFont will be available during the rendering or other operations
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }

    // ExEnd:LoadExternalFont

}


