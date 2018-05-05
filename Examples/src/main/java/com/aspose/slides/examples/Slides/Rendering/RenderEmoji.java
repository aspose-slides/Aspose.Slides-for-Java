
package com.aspose.slides.examples.Slides.Rendering;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class RenderEmoji {
  
    public static void main(String[] args) {
        //ExStart:RenderEmoji
        String dataDir = Utils.getDataDir(RenderEmoji.class);
        Presentation pres = new Presentation();
        pres.save("Emoji.pptx", SaveFormat.Pdf);
        //ExEnd:RenderEmoji
} 
}