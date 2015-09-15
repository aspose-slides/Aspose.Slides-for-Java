/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package  com.aspose.slides.examples.Tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class RemoveRowColumn
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RemoveRowColumn.class);

        Presentation pres = new Presentation();

        ISlide slide = pres.getSlides().get_Item(0);
        double[] colWidth = { 100, 50, 30 };
        double[] rowHeight = { 30, 50, 30 };

        ITable table = slide.getShapes().addTable(100, 100, colWidth, rowHeight);

        table.getRows().removeAt(1, false);
        table.getColumns().removeAt(1, false);

        pres.save(dataDir+ "TestTable.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




