/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

/**
 * @author mfazi
 */
public class ExportToHTMLWithResponsiveLayout {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExportToHTMLWithResponsiveLayout.class);

        //ExStart:ExportToHTMLWithResponsiveLayout
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "SomePresentation.pptx");
        try {
            HtmlOptions saveOptions = new HtmlOptions();
            saveOptions.setSvgResponsiveLayout(true);
            pres.save(dataDir + "SomePresentation-out.html", SaveFormat.Html, saveOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportToHTMLWithResponsiveLayout
    }
}
