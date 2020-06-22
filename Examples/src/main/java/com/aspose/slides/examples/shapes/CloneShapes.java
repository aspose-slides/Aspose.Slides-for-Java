package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class CloneShapes
{
    public static void main(String[] args)
    {
        //ExStart:CloneShapes

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate Presentation class
        Presentation srcPres = new Presentation(dataDir + "Source Frame.pptx");
        try
        {
            IShapeCollection sourceShapes = srcPres.getSlides().get_Item(0).getShapes();
            ILayoutSlide blankLayout = srcPres.getMasters().get_Item(0).getLayoutSlides().getByType(SlideLayoutType.Blank);
            ISlide destSlide = srcPres.getSlides().addEmptySlide(blankLayout);
            IShapeCollection destShapes = destSlide.getShapes();
            destShapes.addClone(sourceShapes.get_Item(1), 50, 150 + sourceShapes.get_Item(0).getHeight());
            destShapes.addClone(sourceShapes.get_Item(2));
            destShapes.insertClone(0, sourceShapes.get_Item(0), 50, 150);

            // Write the PPTX file to disk
            srcPres.save(dataDir + "CloneShape_out.pptx", SaveFormat.Pptx);

            //ExEnd:CloneShapes
        }
        finally
        {
            if (srcPres != null) srcPres.dispose();
        }

    }
}





