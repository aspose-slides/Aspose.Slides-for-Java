package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SetVideoTrimFromEnd
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String videoFileName = RunExamples.getDataDir_Shapes() + "Wildlife.mp4";

        Presentation pres = new Presentation();
        try {
            ISlide slide = pres.getSlides().get_Item(0);
            IVideo video = pres.getVideos().addVideo(Files.readAllBytes(Paths.get(videoFileName)));
            IVideoFrame videoFrame = slide.getShapes().addVideoFrame(0, 0, 200, 200, video);

            // sets the trimming start time to 12sec
            videoFrame.setTrimFromStart(12000f);

            // sets the triming end time to 16sec
            videoFrame.setTrimFromEnd(14000f);

            // Save presentation
            pres.save(RunExamples.getOutPath() + "VideoTrimming-out.pptx", SaveFormat.Pptx);
        } catch(IOException e) {
        } finally {
            if (pres != null) pres.dispose();
        }
    }
}
