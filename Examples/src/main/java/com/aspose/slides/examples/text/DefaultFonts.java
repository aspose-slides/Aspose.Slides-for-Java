package com.aspose.slides.examples.text;

import com.aspose.slides.LoadFormat;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


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
            BufferedImage image = pptx.getSlides().get_Item(0).getThumbnail(1, 1);
            ImageIO.write(image, ".png", new File(dataDir + "output_out.png"));

            // Generate PDF
            pptx.save(dataDir + "output_out.pdf", SaveFormat.Pdf);

            // Generate XPS
            pptx.save(dataDir + "output_out.xps", SaveFormat.Xps);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (pptx != null) pptx.dispose();
        }
        //ExEnd:DefaultFonts
    }
}
