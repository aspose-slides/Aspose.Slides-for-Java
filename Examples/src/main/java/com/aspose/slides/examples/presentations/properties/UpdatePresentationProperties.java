package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;





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
