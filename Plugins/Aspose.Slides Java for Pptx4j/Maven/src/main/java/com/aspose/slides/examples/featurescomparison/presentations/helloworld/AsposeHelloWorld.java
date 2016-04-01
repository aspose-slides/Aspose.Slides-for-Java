package com.aspose.slides.examples.featurescomparison.presentations.helloworld;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AsposeHelloWorld 
{
    public static void main(String[] args) 
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeHelloWorld.class);

        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = (ISlide)pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

        //Add ITextFrame to the Rectangle
        ashp.addTextFrame("Hello World");

        //Write the PPTX file to disk
        pres.save(dataDir + "AsposeHelloWorld.pptx", SaveFormat.Pptx);

        System.out.println("Done.");
    }
}
