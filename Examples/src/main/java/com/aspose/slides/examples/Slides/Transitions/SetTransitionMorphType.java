/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Transitions;

import com.aspose.slides.IMorphTransition;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionMorphType;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.Utils;

/**
 *
 * @author mfazi
 */
public class SetTransitionMorphType {
    
   public static void main(String[] args){
    
        //ExStart:SetTransitionMorphType
	// The path to the documents directory.
	String dataDir = Utils.getDataDir(SimpleTransition.class);
        Presentation presentation = new Presentation(dataDir+"presentation.pptx");
        try
        {
            presentation.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Morph);
            ((IMorphTransition)presentation.getSlides().get_Item(0).getSlideShowTransition().getValue()).setMorphType(TransitionMorphType.ByWord);
            presentation.save(dataDir+"presentation-out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            presentation.dispose();
        }
    //ExEnd:SetTransitionMorphType
    }
    
}
