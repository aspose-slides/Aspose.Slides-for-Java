package com.aspose.slides.examples.asposefeatures.smartart.managesmartart;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.Utils;

public class AsposeSmartArt
{
    public static void main(String[] args)  
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeSmartArt.class);

        //==================
        //Adding Smart Art
        //==================

        //Instantiate Presentation Class
        Presentation pres = new Presentation();

        //Get first slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Add Smart Art Shape
        ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.BasicBlockList);

        //Saving presentation
        pres.save(dataDir + "AsposeSmartArt_Out.pptx", SaveFormat.Pptx);

        //=====================
        //Accessing Smart Art
        //=====================
        //Get first slide
        ISlide slide0 = pres.getSlides().get_Item(0);

        //Traverse through every shape inside first slide
        for(IShape shape : slide0.getShapes())
        {
            //Check if shape is of SmartArt type
            if (shape instanceof ISmartArt)
            {
                //Typecast shape to SmartArtEx
                ISmartArt smartArt = (ISmartArt)shape;
            }
        }
        System.out.println("Smart Art added and Accessed.");
    }
}