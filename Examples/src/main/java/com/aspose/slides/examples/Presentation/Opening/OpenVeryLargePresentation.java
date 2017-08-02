package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class OpenVeryLargePresentation {

	public static final void main(String[] args) {
		//ExStart:OpenVeryLargePresentation
		// The path to the documents directory.
                  String dataDir = Utils.getDataDir(OpenVeryLargePresentation.class);
        
                  final String pathToVeryLargePresentationFile = "veryLargePresentation.pptx";

                  LoadOptions loadOptions = new LoadOptions();
               // let's choose the KeepLocked behavior - the "veryLargePresentation.pptx" will be locked for
              // the Presentation's instance lifetime, but we don't need to load it into memory or copy into
             // thetemporary file
                 loadOptions.getBlobManagementOptions().setPresentationLockingBehavior(PresentationLockingBehavior.KeepLocked);

                  Presentation pres = new Presentation(pathToVeryLargePresentationFile, loadOptions);
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
}
