package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.ISvgImage;
import com.aspose.slides.Presentation;
import com.aspose.slides.SvgImage;
import com.aspose.slides.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class ConvertToEmf
{
    public static void main(String[] args)
    {
        // The path to the document directory.
        String dataDir = RunExamples.getDataDir_Conversion();
        //Out path
        String resultPath = RunExamples.getOutPath() + "Result.emf";

        //ExStart:ConvertToEmf
        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "HelloWorld.pptx");
        try {
            FileOutputStream fileStream = new FileOutputStream(resultPath);
            // Saves the first slide as a metafille
            presentation.getSlides().get_Item(0).writeAsEmf(fileStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertToEmf
    }
}
