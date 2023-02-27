package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;
import java.awt.Color;

public class FindAndReplaceText
{
    public static void main(String[] args)
    {
        String presentationName = RunExamples.getDataDir_Text() + "TextReplaceExample.pptx";
        String outPath = RunExamples.getOutPath() + "TextReplaceExample-out.pptx";
          
        //ExStart:FindAndReplaceText
        Presentation pres = new Presentation(presentationName);
        try {
            PortionFormat format = new PortionFormat();
            format.setFontHeight(24f);
            format.setFontItalic(NullableBool.True);
            format.getFillFormat().setFillType(FillType.Solid);
            format.getFillFormat().getSolidFillColor().setColor(Color.RED);

            SlideUtil.findAndReplaceText(pres, true, "[this block] ", "my text", format);
            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FontFamily
    }
}
