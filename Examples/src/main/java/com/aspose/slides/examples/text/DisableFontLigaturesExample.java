package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;
import java.io.IOException;

public class DisableFontLigaturesExample
{
    public static void main(String[] args) throws IOException
    {
        String presentationName = RunExamples.getDataDir_Text() + "TextLigatures.pptx";
        String outPathEnabled = RunExamples.getOutPath() + "EnableLigatures-out.html";
        String outPathDisabled = RunExamples.getOutPath() + "DisableLigatures-out.html";

        //ExStart:DisableFontLigaturesExample
        Presentation pres = new Presentation(presentationName);
        try {
            // Save with enabled ligatures
            pres.save(outPathEnabled, SaveFormat.Html);

            // Configure export options
            HtmlOptions options = new HtmlOptions();
            options.setDisableFontLigatures(true); // Disable ligatures in rendered text

            // Export presentation to HTML with disabled ligatures
            pres.save(outPathDisabled, SaveFormat.Html, options);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:DisableFontLigaturesExample
    }
}
