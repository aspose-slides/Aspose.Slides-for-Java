/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.BubbleSizeRepresentationType;
import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

/**
 * @author mfazi
 */
public class SupportOfBubbleSizeRepresentation {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SupportOfBubbleSizeRepresentation.class);

        //ExStart:SupportOfBubbleSizeRepresentation
        // Instantiate the presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Bubble, 50, 50, 600, 400, true);
            chart.getChartData().getSeriesGroups().get_Item(0).setBubbleSizeRepresentation(BubbleSizeRepresentationType.Width);

            pres.save(dataDir + "Presentation.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SupportOfBubbleSizeRepresentation
    }
}
