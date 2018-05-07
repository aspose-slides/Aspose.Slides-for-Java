package com.aspose.slides.examples.Presentation.Hyperlinks;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemovingHyperlinksInsidePresentation {

	public static void main(String[] args) {
	

		// The path to the documents directory.

        	String dataDir = Utils.getDataDir(RemovingHyperlinksInsidePresentation.class);

	//ExStart:RemovingHyperlinksInsidePresentation
        
		//Instantiate a Presentation object that represents a PPTX file
		Presentation pres = new Presentation(dataDir + "PresentationWithHyperlinks.pptx");

		//Removing the Hyperlinks from presentation
		pres.getHyperlinkQueries().removeAllHyperlinks();

		//Writing the presentation as a PPTX file
		pres.save(dataDir + "TestSaved.pptx", SaveFormat.Pptx);

	//ExEnd:RemovingHyperlinksInsidePresentation
          }

}
