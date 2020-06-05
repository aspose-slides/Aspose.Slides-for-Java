package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.PdfAccessPermissions;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SetAccessPermissionsToPDF
{

    public static void main(String[] args)
    {

        //ExStart:SetAccessPermissionsToPDF

        String dataDir = RunExamples.getDataDir_PresentationOpening();

        PdfOptions pdfOptions = new PdfOptions();
        pdfOptions.setPassword("my_password");
        pdfOptions.setAccessPermissions(PdfAccessPermissions.PrintDocument | PdfAccessPermissions.HighQualityPrint);

        Presentation presentation = new Presentation();
        try
        {
            presentation.save(dataDir + "PDFWithPermissions.pdf", SaveFormat.Pdf, pdfOptions);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetAccessPermissionsToPDF


    }
}

