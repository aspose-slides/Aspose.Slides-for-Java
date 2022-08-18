package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
This code demonstrates an operation where we added a picture for a slide background, added Duotone effect with styled colors,
and then we got the effective duotone colors with which the background will be rendered.
*/
public class DuotoneEffectsPVI
{
    public static void main(String[] args)
    {
        //ExStart:DuotoneEffectsPVI
        Presentation presentation = new Presentation();
        try {
            byte[] imageBytes = Files.readAllBytes(Paths.get(RunExamples.getDataDir_Shapes() + "aspose-logo.jpg"));

            // Add image to presentation
            IPPImage backgroundImage = presentation.getImages().addImage(imageBytes);

            // Set background in first slide
            presentation.getSlides().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
            presentation.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Picture);
            presentation.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().
                    getPicture().setImage(backgroundImage);

            // Add Duotone effect to background
            IDuotone duotone = presentation.getSlides().get_Item(0).getBackground().getFillFormat().
                    getPictureFillFormat().getPicture().getImageTransform().addDuotoneEffect();

            // Set Doutone properties
            duotone.getColor1().setColorType(ColorType.Scheme);
            duotone.getColor1().setSchemeColor(SchemeColor.Accent1);
            duotone.getColor2().setColorType(ColorType.Scheme);
            duotone.getColor2().setSchemeColor(SchemeColor.Dark2);

            // Get Effective values of the Duotone effect
            IDuotoneEffectiveData duotoneEffective = duotone.getEffective();

            // Show effective values
            System.out.println("Duotone effective color1: " + duotoneEffective.getColor1());
            System.out.println("Duotone effective color2: " + duotoneEffective.getColor2());
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:DuotoneEffectsPVI
    }
}
