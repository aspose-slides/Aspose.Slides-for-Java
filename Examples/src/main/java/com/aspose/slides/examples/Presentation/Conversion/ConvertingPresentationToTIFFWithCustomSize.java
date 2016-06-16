package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TiffCompressionTypes;
import com.aspose.slides.TiffOptions;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToTIFFWithCustomSize {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ConvertingPresentationToTIFFWithCustomSize.class);

		// Instantiate a Presentation object that represents a Presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		// Instantiate the TiffOptions class
		TiffOptions opts = new TiffOptions();

		// Setting compression type
		// Possible values are:
		// Default - Specifies the default compression scheme (LZW).
		// None - Specifies no compression.
		// CCITT3
		// CCITT4
		// LZW
		// RLE
		opts.setCompressionType(TiffCompressionTypes.Default);

		// Depth – depends on the compression type and cannot be set manually.
		// Resolution unit – is always equal to “2” (dots per inch)

		// Setting image DPI
		opts.setDpiX(200);
		opts.setDpiY(100);

		// Set Image Size
		opts.setImageSize(new java.awt.Dimension(1728, 1078));

		// Save the presentation to TIFF with specified image size
		pres.save(dataDir + "demo.tiff", SaveFormat.Tiff, opts);

	}

}
