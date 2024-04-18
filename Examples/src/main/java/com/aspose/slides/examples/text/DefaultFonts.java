package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class DefaultFonts
{
    public static void main(String[] args)
    {
        //ExStart:DefaultFonts
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Use load options to define the default regualr and asian fonts// Use load options to define the default regualr and asian fonts
        LoadOptions loadOptions = new LoadOptions(LoadFormat.Auto);
        loadOptions.setDefaultRegularFont("Wingdings");
        loadOptions.setDefaultAsianFont("Wingdings");

        // Load the presentation
        Presentation pptx = new Presentation(dataDir + "DefaultFonts.pptx", loadOptions);
        try
        {
            // Generate slide thumbnail
            pptx.getSlides().get_Item(0).getImage(1, 1).save(dataDir + "output_out.png", ImageFormat.Png);

            // Generate PDF
            pptx.save(dataDir + "output_out.pdf", SaveFormat.Pdf);

            // Generate XPS
            pptx.save(dataDir + "output_out.xps", SaveFormat.Xps);
        }
        finally
        {
            if (pptx != null) pptx.dispose();
        }
        //ExEnd:DefaultFonts
    }
}
