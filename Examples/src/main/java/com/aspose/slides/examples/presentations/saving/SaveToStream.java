package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


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

