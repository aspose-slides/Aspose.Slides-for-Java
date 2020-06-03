package com.aspose.slides.examples.tables;

import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class CloningInTable
{
    public static void main(String[] args)
    {
        //ExStart:CloningInTable
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        // Instantiate presentationentation class that representationents PPTX file
        Presentation presentation = new Presentation(dataDir + "presentation.pptx");
        try
        {
            // Access first slide
            ISlide sld = presentation.getSlides().get_Item(0);

            // Define columns with widths and rows with heights
            double[] dblCols = {50, 50, 50};
            double[] dblRows = {50, 30, 30, 30, 30};

            // Add table shape to slide
            ITable table = sld.getShapes().addTable(100, 50, dblCols, dblRows);


            // Add text to the row 1 cell 1
            table.get_Item(0, 0).getTextFrame().setText("Row 1 Cell 1");

            // Add text to the row 1 cell 2
            table.get_Item(1, 0).getTextFrame().setText("Row 1 Cell 2");

            // Clone Row 1 at end of table
            table.getRows().addClone(table.getRows().get_Item(0), false);

            // Add text to the row 2 cell 1
            table.get_Item(0, 1).getTextFrame().setText("Row 2 Cell 1");

            // Add text to the row 2 cell 2
            table.get_Item(1, 1).getTextFrame().setText("Row 2 Cell 2");


            // Clone Row 2 as 4th row of table
            table.getRows().insertClone(3, table.getRows().get_Item(1), false);

            //Cloning first column at end
            table.getColumns().addClone(table.getColumns().get_Item(0), false);

            //Cloning 2nd column at 4th column index
            table.getColumns().insertClone(3, table.getColumns().get_Item(1), false);


            // Write PPTX to Disk
            presentation.save(dataDir + "table_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }
}
//ExEnd:CloningInTable
    
   