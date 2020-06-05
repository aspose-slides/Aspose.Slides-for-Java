package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;





public class UpdatePresentationPropertiesUsingPropertiesOfAnotherPresentationAsATemplate
{
    //ExStart:UpdatePresPropsUsingPropsOfOtherPresAsATemplate
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

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

    private static void updateByTemplate(String path, IDocumentProperties template)
    {
        IPresentationInfo toUpdate = PresentationFactory.getInstance().getPresentationInfo(path);
        toUpdate.updateDocumentProperties(template);
        toUpdate.writeBindedPresentation(path);
    }
    //ExEnd:UpdatePresPropsUsingPropsOfOtherPresAsATemplate
}
