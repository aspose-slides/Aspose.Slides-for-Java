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
public class HighlightText {
    
        
    public static void main(String[] args) {
        
        //ExStart:HighlightText
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(HighlightText.class);
        Presentation presentation = new Presentation(dataDir + "SomePresentation.pptx");
        ((AutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightText("title", java.awt.Color.LIGHT_GRAY); // highlighting all words 'important'
        TextHighlightingOptions options = new TextHighlightingOptions();
        options.setWholeWordsOnly(true);
        ((AutoShape) presentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().highlightText("to", java.awt.Color.DARK_GRAY, options); // highlighting all separate 'the' occurrences
        presentation.save(dataDir + "SomePresentation-out.pptx", SaveFormat.Pptx);
         //ExEnd:HighlightText
        }
}
