package com.aspose.slides.examples.slides.media;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;




public class ExtractVideo
{
    public static void main(String[] args) throws IOException
    {

        //ExStart:ExtractVideo
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Media();

        // Instantiate a Presentation object that represents a presentation file 
        Presentation presentation = new Presentation(dataDir + "Video.pptx");

        for (ISlide slide : presentation.getSlides())
        {
            for (IShape shape : presentation.getSlides().get_Item(0).getShapes())
            {
                if (shape instanceof VideoFrame)
                {
                    IVideoFrame vf = (IVideoFrame) shape;
                    String type = vf.getEmbeddedVideo().getContentType();
                    int ss = type.lastIndexOf('/');
                    type = type.substring(ss + 1);
                    byte[] buffer = vf.getEmbeddedVideo().getBinaryData();
                    FileOutputStream fop = new FileOutputStream(dataDir + "NewVideo_out." + type);
                    try
                    {
                        fop.write(buffer);
                        fop.flush();
                        fop.close();
                    }
                    finally
                    {
                        if (presentation != null) presentation.dispose();
                    }
                }
            }
        }
        //ExEnd:ExtractVideo
    }
}
