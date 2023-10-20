package com.aspose.slides.examples.shapes;

import com.aspose.slides.IInk;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;
import java.awt.*;

public class InkManagementExample
{
    //ExStart:InkManagementExample
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Shapes() + "SimpleInk.pptx";
        // Path to output document
        String outFilePath = RunExamples.getOutPath() + "SimpleInk_out.pptx";

        Presentation presentation = new Presentation(presentationName);
        try {
            // Get Ink shape
            IInk inkShape = (IInk)presentation.getSlides().get_Item(0).getShapes().get_Item(0);

            if (inkShape != null)
            {
                System.out.println("Width of the Ink shape = " + inkShape.getWidth());
                System.out.println("Height of the Ink shape = " + inkShape.getHeight());
                System.out.println("Brush height of the trace = " + inkShape.getTraces()[0].getBrush().getSize().getWidth());
                System.out.println("Brush color of the trace = " + inkShape.getTraces()[0].getBrush().getColor());

                // Change color and size of the brush
                inkShape.getTraces()[0].getBrush().setColor(Color.RED);
                inkShape.getTraces()[0].getBrush().setSize(new Dimension(10, 5));
            }

            // Save presentation
            presentation.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
    }
    //ExEnd:InkManagementExample
}
