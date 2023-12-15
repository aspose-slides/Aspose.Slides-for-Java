package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class PresentationToTIFFWithCustomImagePixelFormat
{
    public static void main(String[] args)
    {
        //ExStart:PresentationToTIFFWithCustomImagePixelFormat
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a Presentation file
        Presentation presentation = new Presentation(dataDir + "DemoFile.pptx");
        try
        {
            TiffOptions options = new TiffOptions();

            options.setPixelFormat(ImagePixelFormat.Format8bppIndexed);
            INotesCommentsLayoutingOptions notesOptions = new NotesCommentsLayoutingOptions();
            notesOptions.setNotesPosition(NotesPositions.BottomFull);
            options.setSlidesLayoutOptions(notesOptions);

            // Save the presentation to TIFF with specified image size
            presentation.save(dataDir + "Tiff_With_Custom_Image_Pixel_Format_out.tiff", SaveFormat.Tiff, options);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:PresentationToTIFFWithCustomImagePixelFormat
    }
}

