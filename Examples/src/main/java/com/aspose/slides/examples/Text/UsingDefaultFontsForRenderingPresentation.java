package com.aspose.slides.examples.Text;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.LoadFormat;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class UsingDefaultFontsForRenderingPresentation {

	public static void main(String[] args) throws IOException {
                   //ExStart:UsingDefaultFontsForRenderingPresentation
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(UsingDefaultFontsForRenderingPresentation.class);

		// Use load options to define the default regualr and asian fonts
		LoadOptions lo = new LoadOptions(LoadFormat.Auto);
		lo.setDefaultRegularFont("Wingdings");
		lo.setDefaultAsianFont("Wingdings");

		// Do Some work and perform presentation/slides rendering
		Presentation presentation = new Presentation(dataDir + "DemoFile.pptx");

		// Generate slide thumbnail
		BufferedImage image = presentation.getSlides().get_Item(0).getThumbnail(1, 1);
		ImageIO.write(image, "png", new File("output.png"));

		// Generate PDF
		presentation.save(dataDir + "output.pdf", SaveFormat.Pdf);

		// Generate XPS
		presentation.save(dataDir + "output.xps", SaveFormat.Xps);
            //ExEnd:UsingDefaultFontsForRenderingPresentation
	}
}
