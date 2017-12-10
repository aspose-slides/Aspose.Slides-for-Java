package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.Presentation;
import com.aspose.slides.PresentationLockingBehavior;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import java.io.File;
import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.IVideo;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.PresentationLockingBehavior;
import com.aspose.slides.examples.Utils;
import com.aspose.slides.PresentationLockingBehavior;

public class OpenVeryLargePresentation {

	public static final void main(String[] args) {
		//ExStart:OpenVeryLargePresentation
		// The path to the documents directory.
                  String dataDir = Utils.getDataDir(OpenVeryLargePresentation.class);
        
                  final String pathToVeryLargePresentationFile = "veryLargePresentation.pptx";

                  LoadOptions loadOptions = new LoadOptions();
             
                 loadOptions.getBlobManagementOptions().setPresentationLockingBehavior(PresentationLockingBehavior.KeepLocked);

                 
                 
                  Presentation pres = new Presentation(pathToVeryLargePresentationFile);
    try{
            // the huge presentation is loaded and ready to use, but the memory consumption is still low.

           // make any changes to the presentation.
           pres.getSlides().get_Item(0).setName("Very large presentation");

         // presentation will be saved to the other file, the memory consumptions still low during saving.
        pres.save("veryLargePresentation-copy.pptx", SaveFormat.Pptx);

        // can't do that! IO exception will be thrown, because the file is locked while pres objects will
        // not be disposed
        // new File(pathToVeryLargePresentationFile).delete();
    } finally
       {
        pres.dispose();
    }

    // it's ok to do it here, the source file is not locked by pres object
    new File(pathToVeryLargePresentationFile).delete();
}

//ExEnd:OpenVeryLargePresentation
	}
