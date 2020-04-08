package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.ILayoutSlide;
import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideLayoutType;
import com.aspose.slides.examples.Utils;

public class CloningShapesInSlides {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CloningShapesInSlides.class);

        //ExStart:CloningShapesInSlides
        // Instantiate Presentation class
        Presentation srcPres = new Presentation(dataDir + "Source Frame.pptx");
        try {
            // Accessing source slide shape collection
            IShapeCollection sourceShapes = srcPres.getSlides().get_Item(0).getShapes();

            ILayoutSlide blankLayout = srcPres.getMasters().get_Item(0).getLayoutSlides().getByType(SlideLayoutType.Blank);

            ISlide destSlide = srcPres.getSlides().addEmptySlide(blankLayout);

            // Accessing destination slide shape collection
            IShapeCollection destShapes = destSlide.getShapes();

            // Clone shapes by using different methods
            destShapes.addClone(sourceShapes.get_Item(1), 50, 150 + sourceShapes.get_Item(0).getHeight());
            destShapes.addClone(sourceShapes.get_Item(2));
            destShapes.addClone(sourceShapes.get_Item(3), 50, 200, 50, 50);
            destShapes.addClone(sourceShapes.get_Item(4));
            // destShapes.addClone(sourceShapes.get_Item(5), 300, 300, 50, 200);
            destShapes.insertClone(0, sourceShapes.get_Item(0), 50, 150);

            // Write the PPTX file to disk
            srcPres.save(dataDir + "CloneShape.pptx", SaveFormat.Pptx);
        } finally {
            if (srcPres != null) srcPres.dispose();
        }
        //ExEnd:CloningShapesInSlides
    }
}
