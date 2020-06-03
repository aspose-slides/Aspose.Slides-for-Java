package com.aspose.slides.examples.presentations.properties;

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


public class UpdatePresentationProperties
{
    public static void main(String[] args)
    {
        //ExStart:UpdatePresentationProperties

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

        // read the info of presentation 
        IPresentationInfo info = PresentationFactory.getInstance().getPresentationInfo(dataDir + "ModifyBuiltinProperties1.pptx");

        // obtain the current properties 
        IDocumentProperties props = info.readDocumentProperties();

        // set the new values of Author and Title fields 
        props.setAuthor("New Author");
        props.setTitle("New Title");

        // update the presentation with a new values 
        info.updateDocumentProperties(props);
        info.writeBindedPresentation(dataDir + "ModifyBuiltinProperties1.pptx");
        //ExEnd:UpdatePresentationProperties
    }
}
