/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IChart;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;


public class AddingCustomLines {
    public static void main(String[] args) {


    //ExStart:AddingCustomLines    
        // The path to the documents directory.
	String dataDir = Utils.getDataDir(AddingCustomLines.class);
        
        Presentation pres = new Presentation();
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 100, 100, 500, 400);
            IAutoShape shape = chart.getUserShapes().getShapes().addAutoShape(ShapeType.Line, 0, chart.getHeight()/2, chart.getWidth(), 0);
            shape.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            shape.getLineFormat().getFillFormat().getSolidFillColor().setColor(java.awt.Color.RED);
            pres.save(dataDir + "Presentation.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingCustomLines   
                
    }
}
