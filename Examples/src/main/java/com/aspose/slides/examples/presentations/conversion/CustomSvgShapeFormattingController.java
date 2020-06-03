package com.aspose.slides.examples.presentations.conversion;






import com.aspose.slides.IShape;
import com.aspose.slides.ISvgShape;
import com.aspose.slides.ISvgShapeFormattingController;

//ExStart:CustomSvgShapeFormattingController
public class CustomSvgShapeFormattingController implements ISvgShapeFormattingController

{
    private int m_shapeIndex;

    public CustomSvgShapeFormattingController()
    {
        m_shapeIndex = 0;
    }

    public void formatShape(ISvgShape svgShape, IShape shape)
    {
        svgShape.setId(String.format("shape-{0}", m_shapeIndex++));
    }

}
//ExEnd:CustomSvgShapeFormattingController    
  
    

    
   
