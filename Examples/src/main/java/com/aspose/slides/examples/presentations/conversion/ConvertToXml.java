package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

public class ConvertToXml
{
    public static void main(String[] args) {
        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "Example.xml";

        //ExStart:ConvertToPdfUnsupportedFontStyles
        // Create a new presentation
        Presentation pres = new Presentation();
        try {
            // Save presentation in XML
            pres.save(outFilePath, SaveFormat.Xml);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToPdfUnsupportedFontStyles
    }
}
