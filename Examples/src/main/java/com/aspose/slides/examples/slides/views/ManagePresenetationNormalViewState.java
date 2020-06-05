package com.aspose.slides.examples.slides.views;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SplitterBarStateType;
import com.aspose.slides.examples.RunExamples;


public class ManagePresenetationNormalViewState
{
    public static void main(String[] args)
    {

        //ExStart:ManagePresenetationNormalViewState
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Views();

        Presentation pres = new Presentation();
        try
        {
            pres.getViewProperties().getNormalViewProperties().setHorizontalBarState(SplitterBarStateType.Restored);
            pres.getViewProperties().getNormalViewProperties().setVerticalBarState(SplitterBarStateType.Maximized);

            pres.getViewProperties().getNormalViewProperties().getRestoredTop().setAutoAdjust(true);
            pres.getViewProperties().getNormalViewProperties().getRestoredTop().setDimensionSize(80);
            pres.getViewProperties().getNormalViewProperties().setShowOutlineIcons(true);

            pres.save(dataDir + "presentation_normal_view_state.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:ManagePresenetationNormalViewState
    }
}

