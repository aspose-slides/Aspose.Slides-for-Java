package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddingCustomDocumentProperties {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingCustomDocumentProperties.class);

		Presentation presPPTX = new Presentation();

		// Getting Document Properties
		IDocumentProperties dProps = presPPTX.getDocumentProperties();

		// Adding Custom properties
		dProps.set_Item("New Custom", 12);
		dProps.set_Item("My Name", "Mudassir");
		dProps.set_Item("Custom", 124);

		// Getting property name at particular index
		String getPropertyName = dProps.getPropertyName(2);

		// Removing selected property
		dProps.remove(getPropertyName);

		// Saving presentation
		presPPTX.save(dataDir + "CustomDemo.pptx", SaveFormat.Pptx);

	}

}
