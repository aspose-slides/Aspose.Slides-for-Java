package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

/*
The following code sample demonstrates how to insert HTML content into the presentation slide collection, starting from the empty space on the slide with index equal to 0.
*/
public class ImportHtmlSlideExample
{
    public static void main(String[] args)
    {
        // The path to html document
        String htmlFileName = RunExamples.getDataDir_Conversion() + "TestHtml.html";

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "OutputConvertedHtml.pptx";

        //ExStart:ImportHtmlSlideExample
        Presentation presentation = new Presentation();
        try {
            FileInputStream inputStream = new FileInputStream(htmlFileName);
            presentation.getSlides().insertFromHtml(0, inputStream, true);
            inputStream.close();

            // Save the presentation
            presentation.save(outFilePath, SaveFormat.Pptx);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ImportHtmlSlideExample
    }
}
