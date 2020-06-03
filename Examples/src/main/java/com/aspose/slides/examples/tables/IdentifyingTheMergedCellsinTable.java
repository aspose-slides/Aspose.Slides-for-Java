package com.aspose.slides.examples.tables;

import com.aspose.slides.ICell;
import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;
/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class IdentifyingTheMergedCellsinTable
{
    public static void main(String[] args)
    {
        // ExStart:IdentifyingTheMergedCellsinTable
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();


        Presentation pres = new Presentation(dataDir + "SomePresentationWithTable.pptx");
        try
        {
            ITable table = (ITable) pres.getSlides().get_Item(0).getShapes().get_Item(0); // assuming that Slide#0.Shape#0 is a table
            for (int i = 0; i < table.getRows().size(); i++)
            {
                for (int j = 0; j < table.getColumns().size(); j++)
                {
                    ICell currentCell = table.getRows().get_Item(i).get_Item(j);
                    if (currentCell.isMergedCell())
                    {
                        System.out.println(String.format("Cell {0};{1} is a part of merged cell with RowSpan={2} and ColSpan={3} starting from Cell {4};{5}.",
                                i, j, currentCell.getRowSpan(), currentCell.getColSpan(), currentCell.getFirstRowIndex(), currentCell.getFirstColumnIndex()));


                    }
                }

            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }


        // ExEnd:IdentifyingTheMergedCellsinTable
    }
}


