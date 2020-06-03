package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SetTextFormattingInsideTable
{
    public static void main(String[] args)
    {
        //ExStart:Se.getTextFormat().ingInsideTable
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();
        // Create an instance of Presentation class
        Presentation presentation = new Presentation(dataDir + "pres.pptx");
        ISlide slide = presentation.getSlides().get_Item(0);

        ITable someTable = (ITable) presentation.getSlides().get_Item(0).getShapes().get_Item(0); // let's say that the first shape on the first slide is a table

        // setting table cells' font height
        PortionFormat portionFormat = new PortionFormat();
        portionFormat.setFontHeight(25);
        someTable.setTextFormat(portionFormat);

        // setting table cells' text alignment and right margin in one call
        ParagraphFormat paragraphFormat = new ParagraphFormat();
        paragraphFormat.setAlignment(TextAlignment.Right);
        paragraphFormat.setMarginRight(20);
        someTable.setTextFormat(paragraphFormat);

        // setting table cells' text vertical type
        TextFrameFormat textFrameFormat = new TextFrameFormat();
        textFrameFormat.setTextVerticalType(TextVerticalType.Vertical);
        someTable.setTextFormat(textFrameFormat);


        presentation.save(dataDir + "result.pptx", SaveFormat.Pptx);
        //ExEnd:Se.getTextFormat().ingInsideTable
    }
}


