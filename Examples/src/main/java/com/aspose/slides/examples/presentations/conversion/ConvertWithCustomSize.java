package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class ConvertWithCustomSize
{
    public static void main(String[] args)
    {
        //ExStart:ConvertWithCustomSize
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a Presentation file
        Presentation pres = new Presentation(dataDir + "Convert_Tiff_Custom.pptx");
        try
        {
            // Instantiate the TiffOptions class
            TiffOptions opts = new TiffOptions();

            // Setting compression type
            opts.setCompressionType(TiffCompressionTypes.Default);

            INotesCommentsLayoutingOptions notesOptions = opts.getNotesCommentsLayouting();
            notesOptions.setNotesPosition(NotesPositions.BottomFull);
            // Compression Types

            // Default - Specifies the default compression scheme (LZW).
            // None - Specifies no compression.
            // CCITT3
            // CCITT4
            // LZW
            // RLE

            // Depth depends on the compression type and cannot be set manually.
            // Resolution unit  is always equal to “2” (dots per inch)

            // Setting image DPI
            opts.setDpiX(200);
            opts.setDpiY(100);

            // Set Image Size
            opts.setImageSize(new Dimension(1728, 1078));

            // Save the presentation to TIFF with specified image size
            pres.save(dataDir + "TiffWithCustomSize_out.tiff", SaveFormat.Tiff, opts);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertWithCustomSize
    }
}
