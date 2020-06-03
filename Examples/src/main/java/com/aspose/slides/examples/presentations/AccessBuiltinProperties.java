package com.aspose.slides.examples.presentations;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AccessBuiltinProperties
{
    public static void main(String[] args)
    {
        //ExStart:AccessBuiltinProperties

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation(dataDir + "AccessBuiltin Properties.pptx");

        // Create a reference to IDocumentProperties object associated with Presentation
        IDocumentProperties documentProperties = pres.getDocumentProperties();

        // Display the builtin properties
        System.out.println("Category : " + documentProperties.getCategory());
        System.out.println("Current Status : " + documentProperties.getContentStatus());
        System.out.println("Creation Date : " + documentProperties.getCreatedTime());
        System.out.println("Author : " + documentProperties.getAuthor());
        System.out.println("Description : " + documentProperties.getComments());
        System.out.println("KeyWords : " + documentProperties.getKeywords());
        System.out.println("Last Modified By : " + documentProperties.getLastSavedBy());
        System.out.println("Supervisor : " + documentProperties.getManager());
        System.out.println("Modified Date : " + documentProperties.getLastSavedTime());
        System.out.println("Presentation Format : " + documentProperties.getPresentationFormat());
        System.out.println("Last Print Date : " + documentProperties.getLastPrinted());
        System.out.println("Is Shared between producers : " + documentProperties.getSharedDoc());
        System.out.println("Subject : " + documentProperties.getSubject());
        System.out.println("Title : " + documentProperties.getTitle());
        //ExEnd:AccessBuiltinProperties            
    }
}
