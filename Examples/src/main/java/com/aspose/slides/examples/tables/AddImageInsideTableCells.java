package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AddImageInsideTableCells
{
    public static void main(String[] args) throws IOException
    {
        // ExStart:AddImageinsideTableCell
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        // Instantiate Presentation class object
        Presentation presentation = new Presentation();

        // Access first slide
        ISlide islide = presentation.getSlides().get_Item(0);

        // Define columns with widths and rows with heights
        double[] dblCols = {150, 150, 150, 150};
        double[] dblRows = {100, 100, 100, 100, 90};

        // Add table shape to slide
        ITable tbl = islide.getShapes().addTable(50, 50, dblCols, dblRows);

        // Creating a BufferedImage Image object to hold the image file
        BufferedImage image = ImageIO.read(new File(dataDir + "aspose-logo.jpg"));

        // Create an IPPImage object using the bitmap object
        IPPImage imgx1 = presentation.getImages().addImage(image);

        // Add image to first table cell
        tbl.get_Item(0, 0).getCellFormat().getFillFormat().setFillType(FillType.Picture);
        tbl.get_Item(0, 0).getCellFormat().getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Stretch);
        tbl.get_Item(0, 0).getCellFormat().getFillFormat().getPictureFillFormat().getPicture().setImage(imgx1);
        tbl.get_Item(0, 0).getCellFormat().getFillFormat().getPictureFillFormat().setCropRight(20);
        tbl.get_Item(0, 0).getCellFormat().getFillFormat().getPictureFillFormat().setCropLeft(20);
        tbl.get_Item(0, 0).getCellFormat().getFillFormat().getPictureFillFormat().setCropTop(20);
        tbl.get_Item(0, 0).getCellFormat().getFillFormat().getPictureFillFormat().setCropBottom(20);
        // Save PPTX to Disk
        presentation.save(dataDir + "Image_In_TableCell_out.pptx", SaveFormat.Pptx);
        // ExEnd:AddImageinsideTableCell
    }
}
