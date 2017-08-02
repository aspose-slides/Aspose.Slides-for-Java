package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.Utils;

public class AddingBlobToPresentation{
         public static final void main(String[] args) {
        //ExStart:AddingBlobToPresentation
         // The path to the documents directory.
	 String dataDir = Utils.getDataDir(AddingBlobToPresentation.class);
        // supposed we have the very large video file we want to include into the presentation
       final String pathToVeryLargeVideo = "veryLargeVideo.avi";

    // create a new presentation which will contain this video
    Presentation pres = new Presentation();
    try{
        InputStream fileStream = new FileInputStream(pathToVeryLargeVideo);
        try{
            // let's add the video to the presentation - we choose KeepLocked behavior, because we not
            // have an intent to access the "veryLargeVideo.avi" file.
            IVideo video = pres.getVideos().addVideo(fileStream, LoadingStreamBehavior.KeepLocked);
            pres.getSlides().get_Item(0).getShapes().addVideoFrame(0, 0, 480, 270, video);

            // save the presentation. Despite that the output presentation will be very large, the memory
            // consumption will be low the whole lifetime of the pres object
            pres.save("presentationWithLargeVideo.pptx", SaveFormat.Pptx);
        }finally {
            fileStream.close();
        }
    }finally {
        pres.dispose();
    }
}     
    }
//ExEnd:AddingBlobToPresentation
	
}
}