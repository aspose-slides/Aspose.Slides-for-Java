package com.aspose.slides.examples.shapes;

import com.aspose.slides.IVideoFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.VideoPlayModePreset;
import com.aspose.slides.examples.RunExamples;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;




public class AddVideoFrameFromWebSource
{
    //ExStart:AddVideoFrameFromWebSource
    public static void main(String[] args) throws IOException
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        Presentation pres = new Presentation();
        try
        {
            addVideoFromYouTube(pres, "Tj75Arhq5ho");
            pres.save(dataDir + "AddVideoFrameFromWebSource_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }

    private static void addVideoFromYouTube(Presentation pres, String videoId) throws IOException
    {
        //add videoFrame
        IVideoFrame videoFrame = pres.getSlides().get_Item(0).getShapes().addVideoFrame(10, 10, 427, 240, "https://www.youtube.com/embed/" + videoId);
        videoFrame.setPlayMode(VideoPlayModePreset.Auto);

        //load thumbnail
        String thumbnailUri = "http://img.youtube.com/vi/" + videoId + "/hqdefault.jpg";
        URL url = new URL(thumbnailUri);
        URLConnection connection = url.openConnection();
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(10000);
        try (InputStream input = connection.getInputStream();
             ByteArrayOutputStream output = new ByteArrayOutputStream())
        {
            byte[] buffer = new byte[8192];
            for (int count; (count = input.read(buffer)) > 0; )
            {
                output.write(buffer, 0, count);
            }
            output.toByteArray();
            videoFrame.getPictureFormat().getPicture().setImage(pres.getImages().addImage(output.toByteArray()));
        }
    }
    //ExEnd:AddVideoFrameFromWebSource
}




