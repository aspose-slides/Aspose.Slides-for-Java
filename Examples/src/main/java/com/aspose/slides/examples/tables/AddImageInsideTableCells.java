package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class AddImageInsideTableCells
{
    public static void main(String[] args) throws IOException
    {
        // ExStart:AddImageinsideTableCell
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        // Instantiate Presentation class object
        Presentation presentation = new Presentation();
        try
        {
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
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        // ExEnd:AddImageinsideTableCell
    }
}
