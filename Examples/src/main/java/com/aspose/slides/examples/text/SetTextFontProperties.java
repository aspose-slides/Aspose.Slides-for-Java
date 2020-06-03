package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;





public class SetTextFontProperties
{
    public static void main(String[] args)
    {
        //ExStart:SetTextFontProperties
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Instantiate Presentation
        Presentation presentation = new Presentation();
        try
        {

            // Get first slide
            ISlide sld = presentation.getSlides().get_Item(0);

            // Add an AutoShape of Rectangle type
            IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 50, 50, 200, 50);

            // Remove any fill style associated with the AutoShape
            ashp.getFillFormat().setFillType(FillType.NoFill);

            // Access the TextFrame associated with the AutoShape
            ITextFrame tf = ashp.getTextFrame();
            tf.setText("Aspose TextBox");

            // Access the Portion associated with the TextFrame
            IPortion port = tf.getParagraphs().get_Item(0).getPortions().get_Item(0);

            // Set the Font for the Portion
            port.getPortionFormat().setLatinFont(new FontData("Times New Roman"));

            // Set Bold property of the Font
            port.getPortionFormat().setFontBold(NullableBool.True);

            // Set Italic property of the Font
            port.getPortionFormat().setFontItalic(NullableBool.True);

            // Set Underline property of the Font
            port.getPortionFormat().setFontUnderline(TextUnderlineType.Single);

            // Set the Height of the Font
            port.getPortionFormat().setFontHeight(25);

            // Set the color of the Font
            port.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            port.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);

            // Write the PPTX to disk 
            presentation.save(dataDir + "SetTextFontProperties_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetTextFontProperties
    }
}

