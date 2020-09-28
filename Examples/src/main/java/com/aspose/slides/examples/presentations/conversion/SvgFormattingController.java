package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.FileOutputStream;

public class SvgFormattingController {

    // Code below shows how to use ISvgShapeAndTextFormattingController interface for
    // tspan Id attribute manipulation.

    //ExStart:SvgFormattingController
    public static void main(String[] args) throws Exception
    {
        String dataDir = RunExamples.getDataDir_Conversion();
        String pptxFileName = dataDir + "Convert_Svg_Custom.pptx";
        String outSvgFileName = RunExamples.getOutPath() + "Convert_Svg_Custom.svg";

        Presentation pres = new Presentation(pptxFileName);
        try {
            SVGOptions svgOptions = new SVGOptions();
            svgOptions.setShapeFormattingController(new CustomSvgShapeFormattingController(0));

            FileOutputStream fs = new FileOutputStream(outSvgFileName);
            try {
                pres.getSlides().get_Item(0).writeAsSvg(fs, svgOptions);
            } finally {
                if (fs != null) fs.close();
            }
        } finally {
            if (pres != null) pres.dispose();
        }
    }

    static class CustomSvgShapeFormattingController implements ISvgShapeAndTextFormattingController
    {
        private int m_shapeIndex, m_portionIndex, m_tspanIndex;

        public CustomSvgShapeFormattingController(int shapeStartIndex)
        {
            m_shapeIndex = shapeStartIndex;
            m_portionIndex = 0;
        }
        public void formatShape(ISvgShape svgShape, IShape shape)
        {
            svgShape.setId(String.format("shape-%d", m_shapeIndex++));
            m_portionIndex = m_tspanIndex = 0;
        }
        public void formatText(ISvgTSpan svgTSpan, IPortion portion, ITextFrame textFrame)
        {
            int paragraphIndex = 0; int portionIndex = 0;
            for (int i = 0; i < textFrame.getParagraphs().getCount(); i++)
            {
                portionIndex = textFrame.getParagraphs().get_Item(i).getPortions().indexOf(portion);
                if (portionIndex > -1) { paragraphIndex = i; break; }
            }
            if (m_portionIndex != portionIndex)
            {
                m_tspanIndex = 0;
                m_portionIndex = portionIndex;
            }
            svgTSpan.setId(String.format("paragraph-%d_portion-%d_%d", paragraphIndex, m_portionIndex, m_tspanIndex++));
        }
    }
    //ExEnd:SvgFormattingController
}
