package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SaveToStream
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:SaveToStream
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        // Instantiate a Presentation object that represents a PPT file
        Presentation presentation = new Presentation();
        try
        {

            IAutoShape shape = presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 200, 200);

            // Add text to shape
            shape.getTextFrame().setText("This demo shows how to Create PowerPoint file and save it to Stream.");

            FileOutputStream toStream = new FileOutputStream(new File(dataDir + "Save_As_Stream_out.pptx"));
            presentation.save(toStream, SaveFormat.Pptx);
            toStream.close();
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SaveToStream
    }
}

