/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Table;

import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class LockAspectRatio {
    public static void main(String[] args) {
                
        //ExStart:LockAspectRatio

	// The path to the documents directory.
        String dataDir = Utils.getDataDir(LockAspectRatio.class);
 
        Presentation pres = new Presentation(dataDir + "pres.pptx");
        try
        {
            ITable table = (ITable)pres.getSlides().get_Item(0).getShapes().get_Item(0);
            System.out.println("Lock aspect ratio set: " + table.getGraphicalObjectLock().getAspectRatioLocked());

            table.getGraphicalObjectLock().setAspectRatioLocked(!table.getGraphicalObjectLock().getAspectRatioLocked()); // invert

            pres.save(dataDir + "pres-out.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:LockAspectRatio
    }
}
