package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class VerticallyAlignText
{
    public static void main(String[] args)
    {
        //ExStart:VerticallyAlignText
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        // Get the first slide 
        ISlide slide = presentation.getSlides().get_Item(0);

        // Define columns with widths and rows with heights
        double[] dblCols = {120, 120, 120, 120};
        double[] dblRows = {100, 100, 100, 100};

        // Add table shape to slide
        ITable tbl = slide.getShapes().addTable(100, 50, dblCols, dblRows);
        tbl.getRows().get_Item(1).get_Item(0).getTextFrame().setText("10");
        tbl.getRows().get_Item(2).get_Item(0).getTextFrame().setText("20");
        tbl.getRows().get_Item(3).get_Item(0).getTextFrame().setText("30");

        // Accessing the text frame
        ITextFrame txtFrame = tbl.get_Item(0, 0).getTextFrame();

        // Create the Paragraph object for text frame
        IParagraph paragraph = txtFrame.getParagraphs().get_Item(0);

        // Create Portion object for paragraph
        IPortion portion = paragraph.getPortions().get_Item(0);
        portion.setText("Text here");
        portion.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
        portion.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);

        // Aligning the text vertically
        ICell cell = tbl.get_Item(0, 0);
        cell.setTextAnchorType(TextAnchorType.Center);
        cell.setTextVerticalType(TextVerticalType.Vertical270);

        // Save Presentation
        presentation.save(dataDir + "Vertical_Align_Text_out.pptx", SaveFormat.Pptx);
        //ExEnd:VerticallyAlignText
    }
}


