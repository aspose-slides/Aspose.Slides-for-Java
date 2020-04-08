package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class AnimatingSeriesElements {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AnimatingSeriesElements.class);

        //ExStart:AnimatingSeriesElements
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation(dataDir + "ExistingChart.pptx");
        try {
            ISlide slide = pres.getSlides().get_Item(0);
            IShapeCollection shapes = slide.getShapes();
            IChart chart = (IChart) shapes.get_Item(0);

            slide.getTimeline().getMainSequence().addEffect(chart, EffectType.Fade, EffectSubtype.None, EffectTriggerType.AfterPrevious);

            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 0, 0, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 0, 1, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 0, 2, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 0, 3, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);

            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 1, 0, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 1, 1, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 1, 2, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 1, 3, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);

            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 2, 0, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 2, 1, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 2, 2, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);
            slide.getTimeline().getMainSequence().addEffect(chart, EffectChartMinorGroupingType.ByElementInSeries, 2, 3, EffectType.Appear, EffectSubtype.None,
                    EffectTriggerType.AfterPrevious);

            pres.save(dataDir + "Sample_Element.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AnimatingSeriesElements
    }

}
