package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ConvertWithNoteToTiff
{
    public static void main(String[] args)
    {
        //ExStart:ConvertWithNoteToTiff
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "ConvertWithNote.pptx");
        try
        {
            TiffOptions opts = new TiffOptions();
            NotesCommentsLayoutingOptions notesOptions = new NotesCommentsLayoutingOptions();
            notesOptions.setNotesPosition(NotesPositions.BottomFull);
            opts.setSlidesLayoutOptions(notesOptions);
            // Saving the presentation to TIFF notes
            pres.save(dataDir + "TestNotes_out.tiff", SaveFormat.Tiff, opts);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertWithNoteToTiff
    }
}
