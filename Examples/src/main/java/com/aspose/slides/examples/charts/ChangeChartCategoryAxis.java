package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ChangeChartCategoryAxis
{
    public static void main(String[] args)
    {
        //ExStart:ChangeChartCategoryAxis
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        Presentation presentation = new Presentation(dataDir + "ExistingChart.pptx");
        try
        {
            IChart chart = (IChart) presentation.getSlides().get_Item(0).getShapes().get_Item(0);
            chart.getAxes().getHorizontalAxis().setCategoryAxisType(CategoryAxisType.Date);
            chart.getAxes().getHorizontalAxis().setAutomaticMajorUnit(false);
            chart.getAxes().getHorizontalAxis().setMajorUnit(1);
            chart.getAxes().getHorizontalAxis().setMajorUnitScale(TimeUnitType.Months);
            presentation.save(dataDir + "ChangeChartCategoryAxis_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ChangeChartCategoryAxis
    }
}
