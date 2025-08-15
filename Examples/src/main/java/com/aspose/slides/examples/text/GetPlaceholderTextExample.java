package com.aspose.slides.examples.text;

import com.aspose.slides.*;

public class GetPlaceholderTextExample
{
    public static void main(String[] args)
    {
        //ExStart:GetPlaceholderTextExample
        Presentation presentation = new Presentation();
        try {
            // Add new slide based on LayoutSlides[0]
            ISlide slide = presentation.getSlides().addEmptySlide(presentation.getLayoutSlides().get_Item(0));

            // Search for specified text in a slide, including its layout (layout template text)
            for (ITextFrame textFrame : SlideUtil.getTextBoxesContainsText(slide, "Click", true))
            {
                // Set text for TextFrame
                System.out.println("A text block with the specified text was found.");
                textFrame.setText("The new text!");
            }

            // Find all “Text” placeholders on a slide:
            for (IShape shape : SlideUtil.findShapesByPlaceholderType(slide, PlaceholderType.CenteredTitle))
            {
                System.out.println("Placeholder of type PlaceholderType.CenteredTitle was found.");
                ((IAutoShape)shape).getTextFrame().setText("This is a Text placeholder.");
            }
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:GetPlaceholderTextExample
    }
}
