package com.aspose.slides.examples.Slides.Rendering;

import com.aspose.slides.IShape;

import java.io.FileOutputStream;
import java.io.IOException;

import com.aspose.slides.ISlide;
import com.aspose.slides.ISvgShape;
import com.aspose.slides.ISvgShapeFormattingController;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

//ExStart:CustomSvgShapeFormattingController
class CustomSvgShapeFormattingController implements ISvgShapeFormattingController {

    private int m_shapeIndex;

    public CustomSvgShapeFormattingController() {
        m_shapeIndex = 0;
    }

    public CustomSvgShapeFormattingController(int shapeStartIndex) {
        m_shapeIndex = shapeStartIndex;
    }

    public void formatShape(ISvgShape svgShape, IShape shape) {
        svgShape.setId("shape-" + m_shapeIndex++);
    }

}
//ExEnd:CustomSvgShapeFormattingController