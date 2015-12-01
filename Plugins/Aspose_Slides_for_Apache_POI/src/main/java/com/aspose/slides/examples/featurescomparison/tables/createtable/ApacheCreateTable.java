package com.aspose.slides.examples.featurescomparison.tables.createtable;

import java.awt.Color;
import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Line;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.Table;
import org.apache.poi.hslf.model.TableCell;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.RichTextRun;
import org.apache.poi.hslf.usermodel.SlideShow;

import com.aspose.slides.examples.Utils;

public class ApacheCreateTable
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheCreateTable.class);

        // table data
        String[][] data = { { "INPUT FILE", "NUMBER OF RECORDS" },
                        { "Item File", "11,559" }, { "Vendor File", "300" },
                        { "Purchase History File", "10,000" },
                        { "Total # of requisitions", "10,200,038" } };

        SlideShow ppt = new SlideShow();

        Slide slide = ppt.createSlide();
        // create a table of 5 rows and 2 columns
        Table table = new Table(5, 2);
        for (int i = 0; i < data.length; i++)
        {
                for (int j = 0; j < data[i].length; j++)
                {
                        TableCell cell = table.getCell(i, j);
                        cell.setText(data[i][j]);

                        RichTextRun rt = cell.getTextRun().getRichTextRuns()[0];
                        rt.setFontName("Arial");
                        rt.setFontSize(10);

                        cell.setVerticalAlignment(TextBox.AnchorMiddle);
                        cell.setHorizontalAlignment(TextBox.AlignCenter);
                }
        }

        // set table borders
        Line border = table.createBorder();
        border.setLineColor(Color.black);
        border.setLineWidth(1.0);
        table.setAllBorders(border);

        // set width of the 1st column
        table.setColumnWidth(0, 300);
        // set width of the 2nd column
        table.setColumnWidth(1, 150);

        slide.addShape(table);
        table.moveTo(100, 100);

        FileOutputStream out = new FileOutputStream(dataDir + "Table_Apache_Out.ppt");
        ppt.write(out);
        out.close();

        System.out.println("Program executed successfully");
    }
}