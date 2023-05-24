package com.aspose.slides.examples.presentations.lowcode;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class ForEachPortion
{
    public static void main(String[] args)
    {
        String pptxFileName = RunExamples.getDataDir_Slides_Presentations_LowCode() + "ForEachPortion.pptx";

        //ExStart:ForEachPortion
        Presentation pres = new Presentation(pptxFileName);
        try {
            ForEach.portion(pres, true, new ForEach.ForEachPortionCallback() {
                @Override
                public void invoke(Portion portion, Paragraph para, BaseSlide slide, int index) {
                    if (slide instanceof NotesSlide && (portion.getText() != null && !"".equals(portion.getText())))
                        System.out.println(portion.getText() + ", index: " + index);
                }
            });
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ForEachPortion
    }
}
