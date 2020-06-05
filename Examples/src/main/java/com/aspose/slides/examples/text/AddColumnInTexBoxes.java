package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AddColumnInTexBoxes
{
    public static void main(String[] args)
    {
        // ExStart:AddColumnInTexBoxes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        Presentation presentation = new Presentation();
        try
        {
            // Get the first slide of presentation
            ISlide slide = presentation.getSlides().get_Item(0);

            // Add an AutoShape of Rectangle type
            IAutoShape aShape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 300, 300);

            // Add TextFrame to the Rectangle
            aShape.addTextFrame("All these columns are limited to be within a single text container -- " +
                    "you can add or delete text and the new or remaining text automatically adjusts " +
                    "itself to flow within the container. You cannot have text flow from one container " +
                    "to other though -- we told you PowerPoint's column options for text are limited!");

            // Get text format of TextFrame
            ITextFrameFormat format = aShape.getTextFrame().getTextFrameFormat();

            // Specify number of columns in TextFrame
            format.setColumnCount(3);

            // Specify spacing between columns
            format.setColumnSpacing(10);

// Save created presentation
            presentation.save("ColumnCount.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

    }
    // ExEnd:AddColumnInTexBoxes
}
