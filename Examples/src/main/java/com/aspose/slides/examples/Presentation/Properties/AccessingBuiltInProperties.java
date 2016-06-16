package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AccessingBuiltInProperties {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AccessingBuiltInProperties.class);

		// Instantiate the Presentation class that represents the presentation
		Presentation pres = new Presentation(dataDir + "Presentation.pptx");

		// Create a reference to IDocumentProperties object associated with
		// Presentation
		IDocumentProperties dp = pres.getDocumentProperties();

		// Display the built-in properties
		System.out.println("Category : " + dp.getCategory());
		System.out.println("Current Status : " + dp.getContentStatus());
		System.out.println("Creation Date : " + dp.getCreatedTime());
		System.out.println("Author : " + dp.getAuthor());
		System.out.println("Description : " + dp.getComments());
		System.out.println("KeyWords : " + dp.getKeywords());
		System.out.println("Last Modified By : " + dp.getLastSavedBy());
		System.out.println("Supervisor : " + dp.getManager());
		System.out.println("Modified Date : " + dp.getLastSavedTime());
		System.out.println("Presentation Format : " + dp.getPresentationFormat());
		System.out.println("Last Print Date : " + dp.getLastPrinted());
		System.out.println("Is Shared between producers : " + dp.getSharedDoc());
		System.out.println("Subject : " + dp.getSubject());
		System.out.println("Title : " + dp.getTitle());

	}

}