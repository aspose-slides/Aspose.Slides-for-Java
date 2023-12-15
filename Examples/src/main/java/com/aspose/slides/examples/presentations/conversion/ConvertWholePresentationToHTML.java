package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ConvertWholePresentationToHTML
{
    public static void main(String[] args)
    {
        //ExStart:ConvertWholePresentationToHTML
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "Convert_HTML.pptx");
        try
        {
            HtmlOptions htmlOpt = new HtmlOptions();
            htmlOpt.setHtmlFormatter(HtmlFormatter.createDocumentFormatter("", false));

            INotesCommentsLayoutingOptions notesOptions = new NotesCommentsLayoutingOptions();
            notesOptions.setNotesPosition(NotesPositions.BottomFull);
            htmlOpt.setSlidesLayoutOptions(notesOptions);

            // Saving the presentation to HTML
            presentation.save(dataDir + "ConvertWholePresentationToHTML_out.html", SaveFormat.Html, htmlOpt);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertWholePresentationToHTML
    }
}
