package com.aspose.slides.examples.SmartArt;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.OrganizationChartLayoutType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;

public class GetOrSetTheOrganizationChartTypeAssociatedWithCurrentNode {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(GetOrSetTheOrganizationChartTypeAssociatedWithCurrentNode.class);

		// Instantiate Presentation class that represents the PPTX file
		Presentation pres = new Presentation();

		// Add SmartArt BasicProcess
		ISmartArt smart = pres.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 400, 300, SmartArtLayoutType.OrganizationChart);

		// Get or Set the organization chart type
		smart.getNodes().get_Item(0).setOrganizationChartLayout(OrganizationChartLayoutType.LeftHanging);

		// Saving Presentation
		pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
	}

}
