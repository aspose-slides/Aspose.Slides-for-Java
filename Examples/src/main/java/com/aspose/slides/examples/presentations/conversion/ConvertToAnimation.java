package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.io.IOException;

/*
Aspose.Slides can play presentations and generate a set of frames for an entire animation with a specific frame per second (FPS).
Those frames can then be used to create a video through tools like FFmpeg.

This Java code demonstrates a presentation to video export operation with frames set at 30FPS
*/
public class ConvertToAnimation
{
    public static void main(String[] args)
    {
        //ExStart:ConvertToAnimation
        String presentationName = RunExamples.getDataDir_Conversion() + "SimpleAnimations.pptx";
        final String outPath = RunExamples.getOutPath();
        final int FPS = 30;

        Presentation pres = new Presentation(presentationName);
        try {
            PresentationAnimationsGenerator animationsGenerator = new PresentationAnimationsGenerator(pres);
            try {
                PresentationPlayer player = new PresentationPlayer(animationsGenerator, 33);
                try {
                    player.setFrameTick(new PresentationPlayer.FrameTick() {
                        public void invoke(PresentationPlayer sender, FrameTickEventArgs arg) {
                            arg.getFrame().save(outPath + "frame_" + sender.getFrameIndex() + ".png");
                        }
                    });
                    animationsGenerator.run(pres.getSlides());
                } finally {
                    if (player != null) player.dispose();
                }
            } finally {
                if (animationsGenerator != null) animationsGenerator.dispose();
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToAnimation
    }
}
