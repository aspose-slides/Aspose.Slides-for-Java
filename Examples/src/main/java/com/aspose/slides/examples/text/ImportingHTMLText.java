package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ImportingHTMLText
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:ImportingHTMLText
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Create Empty presentation instance// Create Empty presentation instance
        Presentation pres = new Presentation();
        try
        {
            // Acesss the default first slide of presentation
            ISlide slide = pres.getSlides().get_Item(0);

            // Adding the AutoShape to accomodate the HTML content
            IAutoShape ashape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 10, 10, (float) pres.getSlideSize().getSize().getWidth() - 20, (float) pres.getSlideSize().getSize().getHeight() - 10);

            ashape.getFillFormat().setFillType(FillType.NoFill);

            // Adding text frame to the shape
            ashape.addTextFrame("");

            // Clearing all paragraphs in added text frame
            ashape.getTextFrame().getParagraphs().clear();

            // Loading the HTML file using stream reader
            String tr = new String(Files.readAllBytes(Paths.get(dataDir + "file.html")));

            // Adding text from HTML stream reader in text frame
            ashape.getTextFrame().getParagraphs().addFromHtml(tr);

            // Saving Presentation
            pres.save(dataDir + "output_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ImportingHTMLText
    }
}
