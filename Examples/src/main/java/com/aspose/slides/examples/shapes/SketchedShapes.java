package com.aspose.slides.examples.shapes;


import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SketchedShapes {

    public static void main(String[] args)
    {
        //ExStart:Chart_GetRange
        //Path for output presentation
        String outPptxFile = RunExamples.OutPath + "SketchedShapes_out.pptx";
        String outPngFile = RunExamples.OutPath + "SketchedShapes_out.png";

        String outPptxFile = RunExamples.OutPath + "SketchedShapes_out.pptx";
        String outPngFile = RunExamples.OutPath + "SketchedShapes_out.png";

        Presentation pres = new Presentation();
        try
        {

            IAutoShape shape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 20, 20, 300, 150);
            shape.getFillFormat().setFillType(FillType.NoFill);

            // Transform shape to sketch of a freehand style
            shape.getLineFormat().getSketchFormat().setSketchType(LineSketchType.Scribble);

            try {
                ImageIO.write(pres.getSlides().get_Item(0).getThumbnail(4/3f, 4/3f), "PNG", new File(outPngFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
            pres.save(outPptxFile, SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:Chart_GetRange
    }

}
