package com.aspose.slides.examples.activex;


import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.SystemColor;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ManageActiveXControl
{
    public static void main(String[] args)
    {
        //ExStart:ManageActiveXControl
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_ActiveX();

        // Accessing the presentation with  ActiveX controls
        Presentation presentation = new Presentation(dataDir + "ActiveX.pptm");

        try
        {
            // Accessing the first slide in presentation
            ISlide slide = presentation.getSlides().get_Item(0);

            // changing TextBox text
            IControl control = slide.getControls().get_Item(0);

            if ("TextBox1".equals(control.getName()) && control.getProperties() != null)
            {
                String newText = "Changed text";
                control.getProperties().set_Item("Value", newText);

                // Changing substitute image. PowerPoint will replace this image during activeX activation,
                // so sometime it's OK to leave image unchanged.
                BufferedImage image = new BufferedImage((int) control.getFrame().getWidth(), (int) control.getFrame().getHeight(),
                        BufferedImage.TYPE_INT_ARGB);

                Graphics graphics = image.getGraphics();
                graphics.setColor(SystemColor.window);
                graphics.fillRect(0, 0, image.getWidth(), image.getHeight());

                Font font = new Font(control.getProperties().get_Item("FontName"), Font.PLAIN, 16);
                graphics.setColor(SystemColor.windowText);
                graphics.setFont(font);
                graphics.drawString(newText, 10, 20);

                graphics.setColor(SystemColor.controlShadow);
                graphics.drawLine(0, image.getHeight() - 1, 0, 0);
                graphics.drawLine(0, 0, image.getWidth() - 1, 0);

                graphics.setColor(SystemColor.controlDkShadow);
                graphics.drawLine(1, image.getHeight() - 2, 1, 1);
                graphics.drawLine(1, 1, image.getWidth() - 2, 1);

                graphics.setColor(SystemColor.controlHighlight);
                graphics.drawLine(1, image.getHeight() - 1, image.getWidth() - 1, image.getHeight() - 1);
                graphics.drawLine(image.getWidth() - 1, image.getHeight() - 1, image.getWidth() - 1, 1);

                graphics.setColor(SystemColor.controlLtHighlight);
                graphics.drawLine(0, image.getHeight(), image.getWidth(), image.getHeight());
                graphics.drawLine(image.getWidth(), image.getHeight(), image.getWidth(), 0);

                graphics.dispose();
                control.getSubstitutePictureFormat().getPicture().setImage(presentation.getImages().addImage(image));
            }

            // Changing Button caption
            control = presentation.getSlides().get_Item(0).getControls().get_Item(1);

            if (control.getName().equalsIgnoreCase("CommandButton1") && control.getProperties() != null)
            {
                String newCaption = "Show MessageBox";
                control.getProperties().set_Item("Caption", newCaption);
                // Changing substitute
                BufferedImage image = new BufferedImage((int) control.getFrame().getWidth(), (int) control.getFrame().getHeight(),
                        BufferedImage.TYPE_INT_ARGB);
                Graphics graphics = image.getGraphics();
                graphics.setColor(SystemColor.control);
                graphics.fillRect(0, 0, image.getWidth(), image.getHeight());

                Font font = new Font(control.getProperties().get_Item("FontName"), Font.PLAIN, 16);
                graphics.setColor(SystemColor.windowText);
                graphics.setFont(font);
                FontMetrics metrics = graphics.getFontMetrics(font);
                graphics.drawString(newCaption, (image.getWidth() - metrics.stringWidth(newCaption)) / 2, 20);

                graphics.setColor(SystemColor.controlLtHighlight);
                graphics.drawLine(0, image.getHeight() - 1, 0, 0);
                graphics.drawLine(0, 0, image.getWidth() - 1, 0);

                graphics.setColor(SystemColor.controlHighlight);
                graphics.drawLine(1, image.getHeight() - 2, 1, 1);
                graphics.drawLine(1, 1, image.getWidth() - 2, 1);

                graphics.setColor(SystemColor.controlShadow);
                graphics.drawLine(1, image.getHeight() - 1, image.getWidth() - 1, image.getHeight() - 1);
                graphics.drawLine(image.getWidth() - 1, image.getHeight() - 1, image.getWidth() - 1, 1);

                graphics.setColor(SystemColor.controlDkShadow);
                graphics.drawLine(0, image.getHeight(), image.getWidth(), image.getHeight());
                graphics.drawLine(image.getWidth(), image.getHeight(), image.getWidth(), 0);

                graphics.dispose();
                control.getSubstitutePictureFormat().getPicture().setImage(presentation.getImages().addImage(image));
            }

            // Moving ActiveX frames 100 points down
            for (IControl ctl : slide.getControls())
            {
                IShapeFrame frame = control.getFrame();
                control.setFrame(new ShapeFrame(
                        frame.getX(), frame.getY() + 100, frame.getWidth(), frame.getHeight(),
                        frame.getFlipH(), frame.getFlipV(), frame.getRotation()));
            }

            // Save the presentation with Edited ActiveX Controls
            presentation.save(RunExamples.getOutPath() + "withActiveX-edited_out.pptm", SaveFormat.Pptm);

            // Now removing controls
            slide.getControls().clear();

            // Saving the presentation with cleared ActiveX controls
            presentation.save(RunExamples.getOutPath() + "withActiveX.cleared_out.pptm", SaveFormat.Pptm);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ManageActiveXControl
    }
}

