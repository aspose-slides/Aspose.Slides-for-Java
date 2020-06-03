package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





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
