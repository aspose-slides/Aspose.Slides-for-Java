package com.aspose.slides.examples.presentations.conversion;



/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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
  
    

    
   
