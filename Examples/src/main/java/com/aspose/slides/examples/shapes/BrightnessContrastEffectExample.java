package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class BrightnessContrastEffectExample
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Shapes() + "BrightnessContrast.pptx";

        //ExStart:BrightnessContrastEffectExample
        Presentation presentation = new Presentation(presentationName);
        try {
            // Get slide
            ISlide slide = presentation.getSlides().get_Item(0);

            // Get picture frame
            IPictureFrame pictureFrame = (IPictureFrame)(slide.getShapes().get_Item(0));

            // Get image transform operations
            IImageTransformOperationCollection imageTransform = pictureFrame.getPictureFormat().getPicture().getImageTransform();
            for (IImageTransformOperation effect : imageTransform)
            {
                if (effect instanceof IBrightnessContrast)
                {
                    // Get brightness and contrast values
                    IBrightnessContrast brightnessContrast = (IBrightnessContrast)effect;
                    IBrightnessContrastEffectiveData brightnessContrastData = brightnessContrast.getEffective();

                    System.out.println("Brightness value = " + brightnessContrastData.getBrightness());
                    System.out.println("Contrast value = " + brightnessContrastData.getContrast());
                }
            }
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:BrightnessContrastEffectExample
    }
}
