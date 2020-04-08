package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.INotesCommentsLayoutingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SwfOptions;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToSWF {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToSWF.class);

        //ExStart:ConvertingPresentationToSWF
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "Sample.pptx");
        try {
            SwfOptions swfOptions = new SwfOptions();
            swfOptions.setViewerIncluded(false);

            INotesCommentsLayoutingOptions options = swfOptions.getNotesCommentsLayouting();
            options.setNotesPosition(NotesPositions.BottomFull);
            // Saving presentation
            pres.save(dataDir + "Sample.swf", SaveFormat.Swf, swfOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToSWF
    }

}
