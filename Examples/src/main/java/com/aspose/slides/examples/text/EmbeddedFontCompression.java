package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.nio.file.Files;
import java.nio.file.Paths;

public class EmbeddedFontCompression
{
    public static void main(String[] args) throws Exception
    {
        String presentationName = RunExamples.getDataDir_Text() + "presWithEmbeddedFonts.pptx";
        String outPath = RunExamples.getOutPath() + "presWithEmbeddedFonts-out.pptx";

        //ExStart:EmbeddedFontCompression
        Presentation pres = new Presentation(presentationName);
        try {
            // Compress embedded fonts
            Compress.compressEmbeddedFonts(pres);
            // Save result
            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if(pres != null) pres.dispose();
        }

        // Get source file info
        byte[] sourceFile = Files.readAllBytes(Paths.get(presentationName));
        System.out.println(String.format("Source file size = %d bytes", sourceFile.length));
        // Get result file info
        byte[] outputFile = Files.readAllBytes(Paths.get(outPath));
        System.out.println(String.format("Result file size = %d bytes", outputFile.length));
        //ExEnd:EmbeddedFontCompression
    }

}
