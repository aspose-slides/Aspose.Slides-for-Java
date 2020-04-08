package com.aspose.slides.examples.Text;

import com.aspose.slides.AutoShape;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.PlaceholderType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.io.IOException;


public class AddCustomPromptText {
    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddCustomPromptText.class);

        //ExStart:AccessPromptText
        // Create an instance of Presentation class
        Presentation pres = new Presentation(dataDir + "Presentation2.pptx");
        try {
            ISlide slide = pres.getSlides().get_Item(0);
            for (IShape shape : slide.getSlide().getShapes()) {
                if (shape.getPlaceholder() != null && shape instanceof AutoShape) {
                    String text = "";
                    if (shape.getPlaceholder().getType() == PlaceholderType.CenteredTitle) // title - the text is empty, PowerPoint displays "Click to add title".
                    {
                        text = "Click to add custom title";
                    } else if (shape.getPlaceholder().getType() == PlaceholderType.Subtitle) // the same for subtitle.
                    {
                        text = "Click to add custom subtitle";
                    }
                    ((IAutoShape) shape).getTextFrame().setText(text);
                    System.out.println("Placeholder with text: " + text);
                }
            }

            pres.save(dataDir + "Placeholders_PromptText.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddCustomPromptText
    }
}
