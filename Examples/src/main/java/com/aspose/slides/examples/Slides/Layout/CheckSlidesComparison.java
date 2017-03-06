package com.aspose.slides.examples.Slides.Layout;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class CheckSlidesComparison {

	public static void main(String[] args) {
   
         //ExStart:CheckSlidesComparison

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CheckSlidesComparison.class);

		Presentation presentation1 = null;
                 Presentation presentation2 = null;
try {
    presentation1 = new Presentation("SomePresentation1.pptx");
    presentation2 = new Presentation("SomePresentation2.pptx");
    for (int i = 0; i < presentation1.getMasters().size(); i++)
    {
        for (int j = 0; j < presentation2.getMasters().size(); j++)
        {
            if (presentation1.getMasters().get_Item(i).equals(presentation2.getMasters().get_Item(j)))
      System.out.println("SomePresentation1 MasterSlide#" + i +" is equal to SomePresentation2 MasterSlide#" + j);
        }
    }
} finally {
    if (presentation1 != null) {
        presentation1.dispose();
        presentation1 = null;
    }
    if (presentation2 != null) {
        presentation2.dispose();
        presentation2 = null;
    }
}
                  //ExEnd:CheckSlidesComparison
}

}
