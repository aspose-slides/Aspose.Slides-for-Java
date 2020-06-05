package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class SetPDFPageSize
{
    public static void main(String[] args)
    {
        //ExStart:SetPDFPageSize
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();

        // Instantiate a Presentation object that represents a presentation file 
        Presentation presentation = new Presentation();

        // Set SlideSize.Type Property 
        presentation.getSlideSize().setSize(SlideSizeType.A4Paper, SlideSizeScaleType.EnsureFit);

        // Set different properties of PDF Options
        PdfOptions opts = new PdfOptions();
        opts.setSufficientResolution(600);

        // Save presentation to disk
        presentation.save(dataDir + "SetPDFPageSize_out.pdf", SaveFormat.Pdf, opts);
        //ExEnd:SetPDFPageSize
    }
}
