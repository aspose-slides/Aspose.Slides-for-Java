package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AddImageinsideTableCell
{
    public static void main(String[] args)
    {
        //ExStart:AddImageinsideTableCell
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();
        String outputDir = RunExamples.getOutPath();

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
            IImage image = Images.fromFile(dataDir + "aspose-logo.jpg");

            // Create an IPPImage object using the bitmap object
            IPPImage imgx1 = presentation.getImages().addImage(image);

            // Add image to first table cell
            tbl.get_Item(0, 0).getCellFormat().getFillFormat().setFillType(FillType.Picture);
            tbl.get_Item(0, 0).getCellFormat().getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Stretch);
            tbl.get_Item(0, 0).getCellFormat().getFillFormat().getPictureFillFormat().getPicture().setImage(imgx1);

            // Save PPTX to Disk
            presentation.save(outputDir + "Image_In_TableCell_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddImageinsideTableCell
    }
}
