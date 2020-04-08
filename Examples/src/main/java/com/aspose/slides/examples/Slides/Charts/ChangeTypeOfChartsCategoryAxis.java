package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.CategoryAxisType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TimeUnitType;
import com.aspose.slides.examples.Utils;

public class ChangeTypeOfChartsCategoryAxis {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ChangeTypeOfChartsCategoryAxis.class);

        //ExStart:ChangeTypeOfChartsCategoryAxis
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation(dataDir + "ExistingChart.pptx");
        try {
            IChart chart = (IChart) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            chart.getAxes().getHorizontalAxis().setCategoryAxisType(CategoryAxisType.Date);
            chart.getAxes().getHorizontalAxis().setAutomaticMajorUnit(false);
            chart.getAxes().getHorizontalAxis().setMajorUnit(1);
            chart.getAxes().getHorizontalAxis().setMajorUnitScale(TimeUnitType.Months);
            pres.save(dataDir + "Sample.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ChangeTypeOfChartsCategoryAxis
    }
}
