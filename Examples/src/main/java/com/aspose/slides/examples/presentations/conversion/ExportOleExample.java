package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;

public class ExportOleExample
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // The path to output file.
        String outFilePath = RunExamples.getOutPath() + "PresOleExample.pdf";

        //ExStart:ExportOleExample
        Presentation pres = new Presentation(dataDir + "PresOleExample.pptx");
        try {
            PdfOptions options = new PdfOptions();
            // Include OLE data into exported PDF.
            options.setIncludeOleData(true);
            // Save result
            pres.save(outFilePath, SaveFormat.Pdf, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportOleExample
    }
}
