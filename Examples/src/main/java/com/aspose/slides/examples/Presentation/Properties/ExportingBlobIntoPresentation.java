package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.IVideo;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.PresentationLockingBehavior;
import com.aspose.slides.examples.Utils;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExportingBlobIntoPresentation{
         public static final void main(String[] args) throws FileNotFoundException, IOException {
        //ExStart:ExportingBlobIntoPresentation
         // The path to the documents directory.
	 String dataDir = Utils.getDataDir(ExportingBlobIntoPresentation.class);
           // supposed the presentation contains a multiple audios and videos and it size is huge.
    final String hugePresentationWithAudiosAndVideosFile = "Large_Video_File_Test1.pptx";

    LoadOptions loadOptions = new LoadOptions();
    // lock the source file and don't load it into memory
    loadOptions.getBlobManagementOptions().setPresentationLockingBehavior(PresentationLockingBehavior.KeepLocked);

    // create the Presentation's instance, lock the "hugePresentationWithAudiosAndVideos.pptx" file.
    Presentation pres = new Presentation(hugePresentationWithAudiosAndVideosFile, loadOptions);
    try{
        // let's save each video to a file. to prevent memory usage we need a buffer which will be used
        // to exchange tha data from the presentation's video stream to a stream for newly created video file.
        byte[] buffer = new byte[8 * 1024];

        // iterate through the videos
        for (int index = 0; index < pres.getVideos().size() ; index++)
        {
            IVideo video = pres.getVideos().get_Item(index);

            // open the presentation video stream. Please note that we intentionally avoid accessing properties
            // like video.BinaryData - this property returns a byte array containing full video, and that means
            // this bytes will be loaded into memory. We will use video.GetStream, which will return Stream and
            // that allows us to not load the whole video into memory.
            InputStream presVideoStream = video.getStream();
            try{
                OutputStream outputFileStream = new FileOutputStream("video"+index+".avi");
                try{
                    int bytesRead;
                    while ((bytesRead = presVideoStream.read(buffer, 0, buffer.length)) > 0)
                    {
                        outputFileStream.write(buffer, 0, bytesRead);
                    }
                }finally {
                    outputFileStream.close();
                }
            }finally {
                presVideoStream.close();
            }

            // memory consumption will stay low no matter what size the videos or presentation is.
        }

        // do the same for audios if needed.
    }finally {
        pres.dispose();
    }
        // ExEnd:ExportingBlobIntoPresentation
	
}
}