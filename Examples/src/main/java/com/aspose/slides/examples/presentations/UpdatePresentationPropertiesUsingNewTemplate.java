package com.aspose.slides.examples.presentations;

import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class UpdatePresentationPropertiesUsingNewTemplate
{
    //ExStart:UpdatePresentationPropertiesUsingNewTemplate
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

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

    private static void updateByTemplate(String path, IDocumentProperties template)
    {
        IPresentationInfo toUpdate = PresentationFactory.getInstance().getPresentationInfo(path);
        toUpdate.updateDocumentProperties(template);
        toUpdate.writeBindedPresentation(path);
    }
    //ExEnd:UpdatePresentationPropertiesUsingNewTemplate
}
