/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Text;

import com.aspose.slides.AutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextHighlightingOptions;
import com.aspose.slides.examples.Utils;

/**
 *
 * @author mfazi
 */
public class HighlightTextUsingRegx {
    
        public static void main(String[] args) {
        
            //ExStart:HighlightTextUsingRegx
            // The path to the documents directory.
            String dataDir = Utils.getDataDir(HighlightTextUsingRegx.class);
            Presentation presentation = new Presentation(dataDir + "SomePresentation.pptx");
            TextHighlightingOptions options = new TextHighlightingOptions();
            ((AutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightRegex("\\b[^\\s]{4,}\\b", java.awt.Color.YELLOW, options); // highlighting all words with 10 symbols or longer
            presentation.save(dataDir + "SomePresentation-out.pptx", SaveFormat.Pptx);
            //ExEnd:HighlightTextUsingRegx
        }
}
