package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.INotesCommentsLayoutingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.Presentation;
import com.aspose.slides.ResponsiveHtmlController;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RenderingNotesWhileConvertingToHTML {

    public static void main(String[] args) {

        String dataDir = Utils.getSharedDataDir(RenderingNotesWhileConvertingToHTML.class) + "Conversion/";

        //ExStart:RenderingNotesWhileConvertingToHTML
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try {
            HtmlOptions opts = new HtmlOptions();
            INotesCommentsLayoutingOptions options = opts.getNotesCommentsLayouting();
            options.setNotesPosition(NotesPositions.BottomFull);

            // Saving notes pages
            pres.save(dataDir + "output.html", SaveFormat.Html, opts);
        } finally {
            pres.dispose();
        }
        //ExEnd:RenderingNotesWhileConvertingToHTML
    }
}
