package com.aspose.slides.examples.text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class ExportingHTMLText
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:ExportingHTMLText
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Load the presentation file
        Presentation pres = new Presentation(dataDir + "ExportingHTMLText.pptx");
        try
        {

            // Acesss the default first slide of presentation
            ISlide slide = pres.getSlides().get_Item(0);

            // Desired index
            int index = 0;

            // Accessing the added shape
            IAutoShape ashape = (IAutoShape) slide.getShapes().get_Item(index);

            //Writing Paragraphs data to HTML by providing paragraph starting index, total paragraphs to be copied
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dataDir + "output_out.html"), StandardCharsets.UTF_8));
            try
            {
                out.write(ashape.getTextFrame().getParagraphs().exportToHtml(0, ashape.getTextFrame().getParagraphs().getCount(), null));
            }
            finally
            {
                out.close();
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportingHTMLText
    }
}
