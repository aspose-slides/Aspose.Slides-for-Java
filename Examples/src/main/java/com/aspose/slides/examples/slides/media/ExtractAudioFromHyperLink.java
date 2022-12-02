package com.aspose.slides.examples.slides.media;

import com.aspose.slides.IHyperlink;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ExtractAudioFromHyperLink
{
    public static void main(String[] args)
    {
        //ExStart:ExtractAudioFromHyperLink
        String pptxFile = RunExamples.getDataDir_Slides_Presentations_Media() + "HyperlinkSound.pptx";
        String outMediaPath = RunExamples.getOutPath() + "HyperlinkSound.mpg";

        Presentation pres = new Presentation(pptxFile);
        try {
            // Gets the first shape hyperlink
            IHyperlink link = pres.getSlides().get_Item(0).getShapes().get_Item(0).getHyperlinkClick();

            if (link.getSound() != null) {
                // Extracts the hyperlink sound in byte array
                byte[] audioData = link.getSound().getBinaryData();

                // Saves effect sound to media file
                Files.write(Paths.get(outMediaPath), audioData);
            }
        } catch(IOException e) {
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExtractAudioFromHyperLink
    }
}
