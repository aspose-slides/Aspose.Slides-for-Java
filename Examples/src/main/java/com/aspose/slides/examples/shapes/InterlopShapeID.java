package com.aspose.slides.examples.shapes;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class InterlopShapeID
{
    //ExStart:InterlopShapeID
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        Presentation presentation = new Presentation("Presentation.pptx");
        try
        {
            // Getting unique shape identifier in slide scope
            long officeInteropShapeId = presentation.getSlides().get_Item(0).getShapes().get_Item(0).getOfficeInteropShapeId();


        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }
    //ExEnd:InterlopShapeID
}

