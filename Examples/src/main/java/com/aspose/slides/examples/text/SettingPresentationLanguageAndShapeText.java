package com.aspose.slides.examples.text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;


public class SettingPresentationLanguageAndShapeText
{
    public static void main(String[] args)
    {
        // ExStart:SettingPresentationLanguageAndShapeText
        Presentation pres = new Presentation();
        try
        {
            IAutoShape shape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 50, 50, 200, 50);
            shape.addTextFrame("Text to apply spellcheck language");
            shape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLanguageId("en-EN");

            pres.save(RunExamples.getOutPath() + "test1.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
    // ExEnd:SettingPresentationLanguageAndShapeText
}

