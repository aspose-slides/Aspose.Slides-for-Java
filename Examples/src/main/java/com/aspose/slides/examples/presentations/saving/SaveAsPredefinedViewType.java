package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ViewType;
import com.aspose.slides.examples.RunExamples;





public class SaveAsPredefinedViewType
{
    public static void main(String[] args)
    {
        //ExStart:SaveAsPredefinedViewType
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        // Opening the presentation file
        Presentation presentation = new Presentation();

        // Setting view type 
        presentation.getViewProperties().setLastView(ViewType.SlideMasterView);

        // Saving presentation
        presentation.save(dataDir + "SetViewType_out.pptx", SaveFormat.Pptx);
        //ExEnd:SaveAsPredefinedViewType
    }
}

