package com.aspose.slides.examples.Slides.Rendering;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RenderEmoji {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RenderEmoji.class);

        //ExStart:RenderEmoji
        Presentation pres = new Presentation(dataDir + "presemoji.pptx");
        try {
            pres.save(dataDir + "Emoji.pdf", SaveFormat.Pdf);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RenderEmoji
    }
}