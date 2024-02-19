package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class ConvertToHtml5NotesComments
{
    public static void main(String[] args)
    {
        // Path to source directory
        String dataDir = RunExamples.getDataDir_Conversion();
        String resultPath = RunExamples.getOutPath() + "Html5NotesResult.html";

        //ExStart:ConvertToHtml5NotesComments
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "ConvertWithNote.pptx");
        try {
            NotesCommentsLayoutingOptions notesCommentsLayouting = new NotesCommentsLayoutingOptions();
            notesCommentsLayouting.setNotesPosition(NotesPositions.BottomTruncated);

            Html5Options html5Options = new Html5Options();
            html5Options.setOutputPath(RunExamples.getOutPath());
            html5Options.setNotesCommentsLayouting(notesCommentsLayouting);

            // Save a result
            pres.save(resultPath, SaveFormat.Html5, html5Options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToHtml5NotesComments
    }
}
