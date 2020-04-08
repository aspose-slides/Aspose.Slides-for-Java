/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Views;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SplitterBarStateType;
import com.aspose.slides.examples.Utils;

/**
 * @author mfazi
 */
public class ManagePresenetationNormalViewState {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ManagePresenetationNormalViewState.class);

        //ExStart:ManagePresenetationNormalViewState
        // Create an instance of Presentation class
        Presentation pres = new Presentation();
        try {
            pres.getViewProperties().getNormalViewProperties().setHorizontalBarState(SplitterBarStateType.Restored);
            pres.getViewProperties().getNormalViewProperties().setVerticalBarState(SplitterBarStateType.Maximized);

            pres.getViewProperties().getNormalViewProperties().getRestoredTop().setAutoAdjust(true);
            pres.getViewProperties().getNormalViewProperties().getRestoredTop().setDimensionSize(80);
            pres.getViewProperties().getNormalViewProperties().setShowOutlineIcons(true);

            pres.save(dataDir + "presentation_normal_view_state.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ManagePresenetationNormalViewState
    }
}
