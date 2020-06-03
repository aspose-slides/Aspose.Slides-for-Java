package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AnimatingSeries
{
    public static void main(String[] args)
    {
        //ExStart:AnimatingSeries
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Instantiate Presentation class that represents a presentation file 
        Presentation presentation = new Presentation(dataDir + "ExistingChart.pptx");
        try
        {
            // Get reference of the chart object
            ISlide slide = presentation.getSlides().get_Item(0);
            IShapeCollection shapes = slide.getShapes();
            IChart chart = (IChart) shapes.get_Item(0);

            // Animate the series
            slide.getTimeline().getMainSequence().addEffect(chart, EffectType.Fade, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);

            ((Sequence) slide.getTimeline().getMainSequence()).addEffect(chart,
                    EffectChartMajorGroupingType.BySeries, 0,
                    EffectType.Appear, EffectSubtype.None, EffectTriggerType.AfterPrevious);

            ((Sequence) slide.getTimeline().getMainSequence()).addEffect(chart,
                    EffectChartMajorGroupingType.BySeries, 1,
                    EffectType.Appear, EffectSubtype.None, EffectTriggerType.AfterPrevious);

            ((Sequence) slide.getTimeline().getMainSequence()).addEffect(chart,
                    EffectChartMajorGroupingType.BySeries, 2,
                    EffectType.Appear, EffectSubtype.None, EffectTriggerType.AfterPrevious);

            ((Sequence) slide.getTimeline().getMainSequence()).addEffect(chart,
                    EffectChartMajorGroupingType.BySeries, 3,
                    EffectType.Appear, EffectSubtype.None, EffectTriggerType.AfterPrevious);

            // Write the modified presentation to disk 
            presentation.save(dataDir + "AnimatingSeries_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AnimatingSeries
    }
}
