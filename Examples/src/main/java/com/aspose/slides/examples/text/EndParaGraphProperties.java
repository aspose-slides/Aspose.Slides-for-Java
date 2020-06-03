package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class EndParaGraphProperties
{
    public static void main(String[] args)
    {
        //ExStart:EndParaGraphProperties
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        Presentation pres = new Presentation();
        try
        {
            IAutoShape shape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 10, 10, 200, 250);

            Paragraph para1 = new Paragraph();
            para1.getPortions().add(new Portion("Sample text"));

            Paragraph para2 = new Paragraph();
            para2.getPortions().add(new Portion("Sample text 2"));
            PortionFormat endParagraphPortionFormat = new PortionFormat();
            endParagraphPortionFormat.setFontHeight(48);
            endParagraphPortionFormat.setLatinFont(new FontData("Times New Roman"));
            para2.setEndParagraphPortionFormat(endParagraphPortionFormat);

            shape.getTextFrame().getParagraphs().add(para1);
            shape.getTextFrame().getParagraphs().add(para2);

            pres.save(RunExamples.OutPath + "pres.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
    //ExEnd:EndParaGraphProperties
}


