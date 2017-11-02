package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.Utils;

public class VerifyingThePresentationFileWithoutEvenLoading {

	public static void main(String[] args) {
                  //ExStart:VerifyingThePresentationFileWithoutEvenLoading
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(VerifyingThePresentationFileWithoutEvenLoading.class);

		// Getting the file format using the PresentationFactory class instance
		int format = PresentationFactory.getInstance().getPresentationInfo(dataDir + "Test.pdf").getLoadFormat();
		System.out.println("Format: " + format);

		// It will return "LoadFormat.Unknown" or 255 if the file is other than presentation formats

               //ExEnd:VerifyingThePresentationFileWithoutEvenLoading
	}

}
