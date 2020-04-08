/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class ShowingDisplayUnitLabel {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ShowingDisplayUnitLabel.class);

        //ExStart:ShowingDisplayUnitLabel
        // Creating empty presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 450, 300);
            chart.getAxes().getVerticalAxis().setDisplayUnit(DisplayUnitType.Millions);

            pres.save(dataDir + "chartDisply.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ShowingDisplayUnitLabel
    }

}