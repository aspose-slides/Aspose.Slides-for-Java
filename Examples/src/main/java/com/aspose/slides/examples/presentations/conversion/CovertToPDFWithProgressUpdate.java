package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class CovertToPDFWithProgressUpdate
{
    public static void main(String[] args)
    {

        //ExStart:CovertToPDFWithProgressUpdate
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        Presentation presentation = new Presentation(dataDir + "ConvertToPDF.pptx");
        try
        {
            ISaveOptions saveOptions = new PdfOptions();
            saveOptions.setProgressCallback(new ExportProgressHandler());
            presentation.save(dataDir + "ConvertToPDF.pdf", SaveFormat.Pdf, saveOptions);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }


        //ExEnd:CovertToPDFWithProgressUpdate
    }
}

//ExStart:ExportProgressHandler
class ExportProgressHandler implements IProgressCallback
{
    public void reporting(double progressValue)
    {
        // Use progress percentage value here
        long progress = Math.round(progressValue);
        System.out.println(progress + "% file converted");
    }
}

//ExEnd:ExportProgressHandler

