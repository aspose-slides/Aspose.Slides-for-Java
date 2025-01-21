package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.ISvgImage;
import com.aspose.slides.SvgImage;
import com.aspose.slides.examples.RunExamples;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertSvgToEmf
{
    public static void main(String[] args)
    {
        // The path to the document directory.
        String dataDir = RunExamples.getDataDir_Conversion();
        //Out path
        String resultPath = RunExamples.getOutPath() + "SvgAsEmf.emf";

        //ExStart:ConvertSvgToEmf
        try {
            // Creates the new SVG image
            ISvgImage svgImage = new SvgImage(Files.readAllBytes(Paths.get(dataDir + "content.svg")));
            // Saves the SVG image as a metafile
            FileOutputStream fileStream = new FileOutputStream(resultPath);
            svgImage.writeAsEmf(fileStream);
            fileStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd:ConvertSvgToEmf
    }
}
