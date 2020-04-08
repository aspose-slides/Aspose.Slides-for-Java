package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.IVideo;
import com.aspose.slides.LoadingStreamBehavior;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AddingBlobToPresentation {
    public static final void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingBlobToPresentation.class);

        //ExStart:AddingBlobToPresentation
        // create a new presentation which will contain this video
        Presentation pres = new Presentation();
        try {
            // supposed we have the very large video file we want to include into the presentation
            InputStream fileStream = new FileInputStream(dataDir + "veryLargeVideo.avi");
            try {
                // let's add the video to the presentation - we choose KeepLocked behavior, because we not
                // have an intent to access the "veryLargeVideo.avi" file.
                IVideo video = pres.getVideos().addVideo(fileStream, LoadingStreamBehavior.KeepLocked);
                pres.getSlides().get_Item(0).getShapes().addVideoFrame(0, 0, 480, 270, video);

                // save the presentation. Despite that the output presentation will be very large, the memory
                // consumption will be low the whole lifetime of the pres object
                pres.save(dataDir + "presentationWithLargeVideo.pptx", SaveFormat.Pptx);
            } finally {
                fileStream.close();
            }
        } finally {
            pres.dispose();
        }
        //ExEnd:AddingBlobToPresentation
    }
}

	

