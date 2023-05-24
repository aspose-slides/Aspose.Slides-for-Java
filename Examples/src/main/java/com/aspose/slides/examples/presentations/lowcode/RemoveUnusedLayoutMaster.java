
package com.aspose.slides.examples.presentations.lowcode;

import com.aspose.slides.Presentation;
import com.aspose.slides.Compress;
import com.aspose.slides.examples.RunExamples;

public class RemoveUnusedLayoutMaster
{

    public static void main(String[] args)
    {
        //ExStart:RemoveUnusedLayoutMaster

        String pptxFileName = RunExamples.getDataDir_Slides_Presentations_LowCode() + "MultipleMaster.pptx";

        Presentation pres = new Presentation(pptxFileName);
        try {
            System.out.println("Master slides number in source presentation = " + pres.getMasters().size());
            System.out.println("Layout slides number in source presentation = " + pres.getLayoutSlides().size());

            Compress.removeUnusedMasterSlides(pres);
            Compress.removeUnusedLayoutSlides(pres);

            System.out.println("Master slides number in result presentation = " + pres.getMasters().size());
            System.out.println("Layout slides number in result presentation = " + pres.getLayoutSlides().size());
        } finally {
            if (pres != null) pres.dispose();
        }

        //ExEnd:RemoveUnusedLayoutMaster
    }

}
