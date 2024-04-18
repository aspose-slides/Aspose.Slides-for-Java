package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class RenderOptions {

    // This example demonstrates one of the possible use cases of IRenderingOptions interface
    //(getting slide thumbnails with different default font and slide's notes shown)
    public static void main(String[] args)
    {
        //ExStart:RenderOptions
        // The path to the document.
        String presPath = RunExamples.getDataDir_Rendering() + "RenderingOptions.pptx";

        Presentation pres = new Presentation(presPath);
        try {
            IRenderingOptions renderingOpts = new RenderingOptions();
            INotesCommentsLayoutingOptions notesOptions = new NotesCommentsLayoutingOptions();
            notesOptions.setNotesPosition(NotesPositions.BottomTruncated);
            renderingOpts.setSlidesLayoutOptions(notesOptions);

            pres.getSlides().get_Item(0).getImage(renderingOpts, 4 / 3f, 4 / 3f)
                    .save(RunExamples.getOutPath() + "RenderingOptions-Slide1-Original.png", ImageFormat.Png);

            renderingOpts.setSlidesLayoutOptions(null);
            renderingOpts.setDefaultRegularFont("Arial Black");
            pres.getSlides().get_Item(0).getImage(renderingOpts, 4 / 3f, 4 / 3f)
                    .save(RunExamples.getOutPath() + "RenderingOptions-Slide1-ArialBlackDefault.png", ImageFormat.Png);

            renderingOpts.setDefaultRegularFont("Arial Narrow");
            pres.getSlides().get_Item(0).getImage(renderingOpts, 4 / 3f, 4 / 3f)
                    .save(RunExamples.getOutPath() + "RenderingOptions-Slide1-ArialNarrowDefault.png", ImageFormat.Png);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RenderOptions
    }

}
