package com.aspose.slides.examples.Text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class ExportingParagraphsTextToHTML {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExportingParagraphsTextToHTML.class);

        //ExStart:ExportingParagraphsTextToHTML
        // Load the presentation file
        Presentation pres = new Presentation(dataDir + "DemoFile.pptx");
        try {
            // Access the default first slide of presentation
            ISlide slide = pres.getSlides().get_Item(0);

            // Desired index
            int index = 0;

            // Accessing the added shape
            IAutoShape ashape = (IAutoShape) slide.getShapes().get_Item(index);

            // Creating output HTML file
            OutputStream os = new FileOutputStream(dataDir + "file.html");
            Writer writer = new OutputStreamWriter(os, StandardCharsets.UTF_8);

            //Extracting first paragraph as HTML
            // Writing Paragraphs data to HTML by providing paragraph starting index, total paragraphs to be copied
            writer.write(ashape.getTextFrame().getParagraphs().exportToHtml(0, ashape.getTextFrame().getParagraphs().getCount(), null));
            writer.close();
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportingParagraphsTextToHTML
    }

}
