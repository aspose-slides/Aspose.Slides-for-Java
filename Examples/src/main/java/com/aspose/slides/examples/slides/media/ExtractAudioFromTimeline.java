package com.aspose.slides.examples.slides.media;

import com.aspose.slides.ISequence;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExtractAudioFromTimeline
{
    public static void main(String[] args)
    {
        String pptxFile = RunExamples.getDataDir_Slides_Presentations_Media() + "AnimationAudio.pptx";
        String outMediaPath = RunExamples.getOutPath() +  "MediaTimeline.mpg";

        //ExStart:ExtractAudioFromTimeline
        Presentation pres = new Presentation(pptxFile);
        try {
            // Gets first slide of the presentation
            ISlide slide = pres.getSlides().get_Item(0);

            // Gets the effects sequence for the slide
            ISequence effectsSequence = slide.getTimeline().getMainSequence();

            // Extracts the effect sound in byte array
            byte[] audio = effectsSequence.get_Item(0).getSound().getBinaryData();

            // Saves effect sound to media file
            Files.write(Paths.get(outMediaPath), audio);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExtractAudioFromTimeline
    }
}
