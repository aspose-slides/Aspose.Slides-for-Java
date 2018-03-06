package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.Utils;

public class AdvancedDocumentProperties {

	public static void main(String[] args) {
		// The path to the resource directory.
    	//ExStart:AdvancedDocumentProperties
         String dataDir = Utils.getSharedDataDir(AdvancedDocumentProperties.class) + "Properties/";
		readAndUpdateDocumentProperties(dataDir);
		
		usePropertiesOfAPresentationAsATemplateToUpdateOtherPresentations(dataDir);
		createNewTemplateAndUpdateMultiplePresentations(dataDir);
	}

	public static void readAndUpdateDocumentProperties(String dataDir) {
		// read the info of presentation
		IPresentationInfo info = PresentationFactory.getInstance().getPresentationInfo(dataDir + "presentation.pptx");

		// obtain the current properties
		IDocumentProperties props = info.readDocumentProperties();

		// set the new values of Author and Title fields
		props.setAuthor("New Author");
		props.setTitle("New Title");

		// update the presentation with a new values
		info.updateDocumentProperties(props);
		info.writeBindedPresentation(dataDir + "presentation.pptx");
	}

	/*
	 * There's an another way to use properties of a particular presentation as
	 * a template to update properties in other presentations:
	 */
	public static void usePropertiesOfAPresentationAsATemplateToUpdateOtherPresentations(String dataDir) {
		DocumentProperties template;
		IPresentationInfo info = PresentationFactory.getInstance().getPresentationInfo(dataDir + "template.pptx");
		template = (DocumentProperties) info.readDocumentProperties();

		template.setAuthor("Template Author");
		template.setTitle("Template Title");
		template.setCategory("Template Category");
		template.setKeywords("Keyword1, Keyword2, Keyword3");
		template.setCompany("Our Company");
		template.setComments("Created from template");
		template.setContentType("Template Content");
		template.setSubject("Template Subject");

		updateByTemplate(dataDir + "doc1.pptx", template);
		updateByTemplate(dataDir + "doc2.odp", template);
		updateByTemplate(dataDir + "doc3.ppt", template);
	}

	/*
	 * A new template can be created from scratch and then used to update
	 * multiple presentations
	 */
	public static void createNewTemplateAndUpdateMultiplePresentations(String dataDir) {
		DocumentProperties template = new DocumentProperties();
		template.setAuthor("Template Author");
		template.setTitle("Template Title");
		template.setCategory("Template Category");
		template.setKeywords("Keyword1, Keyword2, Keyword3");
		template.setCompany("Our Company");
		template.setComments("Created from template");
		template.setContentType("Template Content");
		template.setSubject("Template Subject");

		updateByTemplate(dataDir + "doc1.pptx", template);
		updateByTemplate(dataDir + "doc2.odp", template);
		updateByTemplate(dataDir + "doc3.ppt", template);
	}

	private static void updateByTemplate(String path, IDocumentProperties template) {
		IPresentationInfo toUpdate = PresentationFactory.getInstance().getPresentationInfo(path);
		toUpdate.updateDocumentProperties(template);
		toUpdate.writeBindedPresentation(path);
	}
     //ExEnd:AdvancedDocumentProperties
}
