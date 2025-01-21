package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.PptxOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class RefreshThumbnailPresentation
{
    public static void main(String[] args)
    {
        //Path for source presentation
        String pptxFile = RunExamples.getDataDir_PresentationSaving() + "Image.pptx";
        //Out path
        String resultPath = RunExamples.getOutPath() + "result_with_old_thumbnail.pptx";

        //ExStart:RefreshThumbnailPresentation
        Presentation pres = new Presentation(pptxFile);
        try {
            PptxOptions pptxOptions = new PptxOptions();
            pptxOptions.setRefreshThumbnail(false);
            //Remove all shapes from the slide
            pres.getSlides().get_Item(0).getShapes().clear();
            //Save presentation
            pres.save(resultPath, SaveFormat.Pptx, pptxOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RefreshThumbnailPresentation
    }
}
