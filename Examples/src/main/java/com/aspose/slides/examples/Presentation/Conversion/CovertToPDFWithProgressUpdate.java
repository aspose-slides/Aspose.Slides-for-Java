/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.IProgressCallback;
import com.aspose.slides.ISaveOptions;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

/**
 *
 * @author mfazi
 */
public class CovertToPDFWithProgressUpdate {
    
    public static void main(String[] args) {
        
    
                    //ExStart:CovertToPDFWithProgressUpdate

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CovertToPDFWithProgressUpdate.class);
                
                Presentation presentation = new Presentation(dataDir + "ConvertToPDF.pptx");
                try
                {
                    ISaveOptions saveOptions = new PdfOptions();
                    saveOptions.setProgressCallback((IProgressCallback) new ExportProgressHandler());
                    presentation.save(dataDir + "ConvertToPDF.pdf", SaveFormat.Pdf, saveOptions);
                }finally {
                    presentation.dispose();
                }
                //ExEnd:CovertToPDFWithProgressUpdate
                
}
}

//ExStart:ExportProgressHandler
class ExportProgressHandler implements IProgressCallback {
    public void reporting(double progressValue) {
        // Use progress percentage value here
    }
}
//ExEnd:ExportProgressHandler