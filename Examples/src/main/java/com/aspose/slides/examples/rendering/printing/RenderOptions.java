package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.IRenderingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.Presentation;
import com.aspose.slides.RenderingOptions;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class RenderOptions {

    // This example demonstrates one of the possible use cases of IRenderingOptions interface
    //(getting slide thumbnails with different default font and slide's notes shown)
    public static void main(String[] args) throws IOException
    {
        //ExStart:RenderOptions
        // The path to the document.
        String presPath = RunExamples.getDataDir_Rendering() + "RenderingOptions.pptx";

        Presentation pres = new Presentation(presPath);
        try {
            IRenderingOptions renderingOpts = new RenderingOptions();
            renderingOpts.getNotesCommentsLayouting().setNotesPosition(NotesPositions.BottomTruncated);

            ImageIO.write(pres.getSlides().get_Item(0).getThumbnail(renderingOpts, 4 / 3f, 4 / 3f),
                    "PNG", new File(RunExamples.getOutPath() + "RenderingOptions-Slide1-Original.png"));

            renderingOpts.getNotesCommentsLayouting().setNotesPosition(NotesPositions.None);
            renderingOpts.setDefaultRegularFont("Arial Black");
            ImageIO.write(pres.getSlides().get_Item(0).getThumbnail(renderingOpts, 4 / 3f, 4 / 3f),
                    "PNG", new File(RunExamples.getOutPath() + "RenderingOptions-Slide1-ArialBlackDefault.png"));

            renderingOpts.setDefaultRegularFont("Arial Narrow");
            ImageIO.write(pres.getSlides().get_Item(0).getThumbnail(renderingOpts, 4 / 3f, 4 / 3f),
                    "PNG", new File(RunExamples.getOutPath() + "RenderingOptions-Slide1-ArialNarrowDefault.png"));
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RenderOptions
    }

}
