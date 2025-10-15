package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class RenderingNotesWhileConvertingToHTML
{
    public static void main(String[] args)
    {
        //ExStart:RenderingNotesWhileConvertingToHTML
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try
        {
            HtmlOptions opt = new HtmlOptions();

            NotesCommentsLayoutingOptions options = new NotesCommentsLayoutingOptions();
            options.setNotesPosition(NotesPositions.BottomFull);
            opt.setSlidesLayoutOptions(options);

            // Saving notes pages
            pres.save(dataDir + "Output.html", SaveFormat.Html, opt);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RenderingNotesWhileConvertingToHTML
    }
}
