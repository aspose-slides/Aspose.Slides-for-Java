package com.aspose.slides.examples.presentations;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class ModifyBuiltinProperties
{
    public static void main(String[] args)
    {
        //ExStart:ModifyBuiltinProperties
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

        // Instantiate the Presentation class that represents the Presentation
        Presentation presentation = new Presentation(dataDir + "ModifyBuiltinProperties.pptx");

        // Create a reference to IDocumentProperties object associated with Presentation
        IDocumentProperties documentProperties = presentation.getDocumentProperties();

        // Set the builtin properties
        documentProperties.setAuthor("Aspose.Slides for .NET");
        documentProperties.setTitle("Modifying Presentation Properties");
        documentProperties.setSubject("Aspose Subject");
        documentProperties.setComments("Aspose Description");
        documentProperties.setManager("Aspose Manager");

        // Save your presentation to a file
        presentation.save(dataDir + "DocumentProperties_out.pptx", SaveFormat.Pptx);
        //ExEnd:ModifyBuiltinProperties
    }
}
