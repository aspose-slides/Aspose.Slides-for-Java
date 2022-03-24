/*
 * Copyright (c) 2009-2022. Aspose Pty Ltd. All Rights Reserved.
 */

package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class IsTextShape
{
    public static void main(String[] args)
    {
        //ExStart:IsTextShape
        String presentationPath = RunExamples.getDataDir_Shapes() + "CheckTextShapes.pptx";

        Presentation pres = new Presentation(presentationPath);
        try {
            for (IShape shape : pres.getSlides().get_Item(0).getShapes())
            {
                if (shape instanceof AutoShape)
                {
                    AutoShape autoShape = (AutoShape)shape;
                    System.out.println(autoShape.isTextBox() ? "shape is text box" : "shape is not text box");
                }
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:IsTextShape
    }
}
