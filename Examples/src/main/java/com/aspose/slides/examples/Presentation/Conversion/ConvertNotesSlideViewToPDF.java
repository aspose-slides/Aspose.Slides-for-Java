

package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.INotesCommentsLayoutingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class ConvertNotesSlideViewToPDF {

    	public static void main(String[] args) {
            
                //ExStart:ConvertNotesSlideViewToPDF

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ConvertNotesSlideViewToPDF.class);

		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "NotesFile.pptx");
		
                 PdfOptions pdfOptions = new PdfOptions();
                INotesCommentsLayoutingOptions options = pdfOptions.getNotesCommentsLayouting();
                options.setNotesPosition(NotesPositions.BottomFull);
		// Save the presentation to PDF
		pres.save(dataDir + "Pdf_Notes_out.pdf", SaveFormat.Pdf, pdfOptions);
            //ExEnd:ConvertNotesSlideViewToPDF

	}
}
