package com.aspose.slides.examples.shapes;

import com.aspose.slides.AutoShape;
import com.aspose.slides.IFillFormatEffectiveData;
import com.aspose.slides.IShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

public class SolidFillSchemeColorExamole
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationPath = RunExamples.getDataDir_Shapes() + "FillColor.pptx";

        //ExStart:SolidFillSchemeColorExamole
        Presentation presentation = new Presentation(presentationPath);
        try {
            for (IShape shape : presentation.getSlides().get_Item(0).getShapes())
            {
                if (shape instanceof AutoShape)
                {
                    IFillFormatEffectiveData fillFormat = ((AutoShape)shape).getTextFrame().getParagraphs().get_Item(0)
                            .getPortions().get_Item(0).getPortionFormat().getFillFormat().getEffective();
                    System.out.println("Fill color: " + fillFormat.getSolidFillColor());
                    System.out.println("Fill scheme color: " + fillFormat.getSolidFillSchemeColor());
                }
            }
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SolidFillSchemeColorExamole
    }
}
