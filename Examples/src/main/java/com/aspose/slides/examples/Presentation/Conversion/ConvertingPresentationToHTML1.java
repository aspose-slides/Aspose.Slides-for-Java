package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.INotesCommentsLayoutingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToHTML1 {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertingPresentationToHTML1.class);

        //ExStart:ConvertingPresentationToHTML1
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try {
            HtmlOptions htmlOpt = new HtmlOptions();
            htmlOpt.setHtmlFormatter(HtmlFormatter.createDocumentFormatter("", false));

            INotesCommentsLayoutingOptions options = htmlOpt.getNotesCommentsLayouting();
            options.setNotesPosition(NotesPositions.BottomFull);

            // Saving the presentation to HTML
            pres.save(dataDir + "demo.html", SaveFormat.Html, htmlOpt);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertingPresentationToHTML1
    }

}