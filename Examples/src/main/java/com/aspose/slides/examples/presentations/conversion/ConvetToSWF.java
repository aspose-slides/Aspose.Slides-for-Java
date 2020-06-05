package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class ConvetToSWF
{
    public static void main(String[] args)
    {
        //ExStart:ConvetToSWF
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "HelloWorld.pptx");
        try
        {
            SwfOptions swfOptions = new SwfOptions();
            swfOptions.setViewerIncluded(false);


            INotesCommentsLayoutingOptions notesOptions = swfOptions.getNotesCommentsLayouting();
            notesOptions.setNotesPosition(NotesPositions.BottomFull);

            // Saving presentation and notes pages
            presentation.save(dataDir + "SaveAsSwf_out.swf", SaveFormat.Swf, swfOptions);
            swfOptions.setViewerIncluded(true);
            presentation.save(dataDir + "SaveNotes_out.swf", SaveFormat.Swf, swfOptions);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvetToSWF
    }
}


 