package com.aspose.slides.examples.Slides.Layout;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class CheckSlidesComparison {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CheckSlidesComparison.class);

        //ExStart:CheckSlidesComparison
        // Instantiate Presentation class that represents the presentation file
        Presentation presentation1 = new Presentation(dataDir + "SomePresentation1.pptx");
        try {
            // Instantiate Presentation class that represents the presentation file
            Presentation presentation2 = new Presentation(dataDir + "SomePresentation2.pptx");
            try {
                for (int i = 0; i < presentation1.getMasters().size(); i++) {
                    for (int j = 0; j < presentation2.getMasters().size(); j++) {
                        if (presentation1.getMasters().get_Item(i).equals(presentation2.getMasters().get_Item(j)))
                            System.out.println("SomePresentation1 MasterSlide#" + i + " is equal to SomePresentation2 MasterSlide#" + j);
                    }
                }
            } finally {
                if (presentation2 != null) presentation2.dispose();
            }
        } finally {
            if (presentation1 != null) presentation1.dispose();
        }
        //ExEnd:CheckSlidesComparison
    }

}
