package com.aspose.slides.examples.activex;


/*


public class ManageActiveXControl
{
    public static void main(String[] args)
    {
        //ExStart:ManageActiveXControl
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_ActiveX();

        // Accessing the presentation with  ActiveX controls
        Presentation presentation = new Presentation(dataDir + "ActiveX.pptm");

        // Accessing the first slide in presentation
        ISlide slide = presentation.getSlides().get_Item(0);

        // changing TextBox text
        IControl control = slide.getControls().get_Item(0);

        if ("TextBox1".equals(control.getName()) && control.getProperties() != null)
        {
            String newText = "Changed text";
            control.getProperties().set_Item("Value", newText);

            // changing substitute image. Powerpoint will replace this image during activeX activation, so sometime it's OK to leave image unchanged.

            //Image image = new Bitmap((int)control.Frame.getWidth(), (int)control.Frame.getHeight());
            BufferedImage image = new BufferedImage((int) control.getFrame().getWidth(), (int) control.getFrame().getHeight(), BufferedImage.TYPE_INT_ARGB);
            //Graphics graphics = Graphics.fromImage(image);
            java.awt.Graphics graphics = image.getGraphics();
            //Brush brush = new SolidBrush(Color.fromKnownColor(KnownColor.Window).Clone());
            //graphics.fillRectangle(brush, 0, 0, image.getWidth(), image.getHeight());
            //brush.dispose();

            graphics.setColor(SystemColor.window);
            graphics.fillRect(0, 0, image.getWidth(), image.getHeight());

            //com.aspose.ms.System.Drawing.Font font = new com.aspose.ms.System.Drawing.Font(control.Properties["FontName"], 14);
            java.awt.Font font = new java.awt.Font(control.getProperties().get_Item("FontName"), java.awt.Font.PLAIN, 14);
            //brush = new SolidBrush(Color.fromKnownColor(KnownColor.WindowText).Clone());
            //graphics.drawString(newText, font, brush, 10, 4);
            //brush.dispose();

            graphics.setColor(SystemColor.windowText);
            graphics.setFont(font);
            graphics.drawString(newText, 10, 4);

            //Pen pen = new Pen(Color.fromKnownColor(KnownColor.ControlDark).Clone(), 1);
            //graphics.drawLines(
            //    pen, new com.aspose.ms.System.Drawing.Point[] { new com.aspose.ms.System.Drawing.Point(0, image.getHeight() - 1), new com.aspose.ms.System.Drawing.Point(0, 0), new com.aspose.ms.System.Drawing.Point(image.getWidth() - 1, 0) });
            //pen.dispose();
            //pen = new Pen(Color.fromKnownColor(KnownColor.ControlDarkDark).Clone(), 1);

            //graphics.drawLines(pen, new com.aspose.ms.System.Drawing.Point[] { new com.aspose.ms.System.Drawing.Point(1, image.getHeight() - 2), new com.aspose.ms.System.Drawing.Point(1, 1), new com.aspose.ms.System.Drawing.Point(image.getWidth() - 2, 1) });
            //pen.dispose();

            graphics.setColor(SystemColor.controlDkShadow);
            graphics.drawLine(0, image.getHeight() - 1, 0, 0);
            graphics.drawLine(0, 0, image.getWidth() - 1, 0);

            pen = new Pen(Color.fromKnownColor(KnownColor.ControlLight).Clone(), 1);
            graphics.drawLines(pen, new com.aspose.ms.System.Drawing.Point[]
            {
                    new com.aspose.ms.System.Drawing.Point(1, image.getHeight() - 1), new com.aspose.ms.System.Drawing.Point(image.getWidth() - 1, image.getHeight() - 1),
                    new com.aspose.ms.System.Drawing.Point(image.getWidth() - 1, 1)
            });
            pen.dispose();
            pen = new Pen(Color.fromKnownColor(KnownColor.ControlLightLight).Clone(), 1);
            graphics.drawLines(pen,new com.aspose.ms.System.Drawing.Point[] { new com.aspose.ms.System.Drawing.Point(0, image.getHeight()), new com.aspose.ms.System.Drawing.Point(image.getWidth(), image.getHeight()), new com.aspose.ms.System.Drawing.Point(image.getWidth(), 0) });
            pen.dispose();

            graphics.dispose();
            control.getSubstitutePictureFormat().getPicture().setImage(presentation.getImages().addImage(image));
        }

        // changing Button caption
        control = slide.getControls().get_Item(1);

        if ("CommandButton1".equals(control.getName()) && control.Properties != null)
        {
            String newCaption = "MessageBox";
            control.Properties["Caption"] = newCaption;

            // changing substitute
            BufferedImage image = new Bitmap((int)control.Frame.getWidth(), (int)control.Frame.getHeight());
            Graphics graphics = Graphics.fromImage(image);
            Brush brush = new SolidBrush(Color.fromKnownColor(KnownColor.Control).Clone());
            graphics.fillRectangle(brush, 0, 0, image.getWidth(), image.getHeight());
            brush.dispose();
            com.aspose.ms.System.Drawing.Font font = new com.aspose.ms.System.Drawing.Font(control.Properties["FontName"], 14);
            brush = new SolidBrush(Color.fromKnownColor(KnownColor.WindowText).Clone());
            SizeF tex.setSize(graphics.measureString(newCaption, font, Int32Extensions.MaxValue).Clone());
            graphics.drawString(newCaption, font, brush, (image.getWidth() - textSize.getWidth()) / 2, (image.getHeight() - textSize.getHeight()) / 2);
            brush.dispose();
            Pen pen = new Pen(Color.fromKnownColor(KnownColor.ControlLightLight).Clone(), 1);
            graphics.drawLines(pen, new com.aspose.ms.System.Drawing.Point[] { new com.aspose.ms.System.Drawing.Point(0, image.getHeight() - 1), new com.aspose.ms.System.Drawing.Point(0, 0), new com.aspose.ms.System.Drawing.Point(image.getWidth() - 1, 0) });
            pen.dispose();
            pen = new Pen(Color.fromKnownColor(KnownColor.ControlLight).Clone(), 1);
            graphics.drawLines(pen, new com.aspose.ms.System.Drawing.Point[] { new com.aspose.ms.System.Drawing.Point(1, image.getHeight() - 2), new com.aspose.ms.System.Drawing.Point(1, 1), new com.aspose.ms.System.Drawing.Point(image.getWidth() - 2, 1) });
            pen.dispose();
            pen = new Pen(Color.fromKnownColor(KnownColor.ControlDark).Clone(), 1);
            graphics.drawLines(pen,new com.aspose.ms.System.Drawing.Point[]
            {
                new com.aspose.ms.System.Drawing.Point(1, image.getHeight() - 1),
                new com.aspose.ms.System.Drawing.Point(image.getWidth() - 1, image.getHeight() - 1),
                new com.aspose.ms.System.Drawing.Point(image.getWidth() - 1, 1)
            });
            pen.dispose();
            pen = new Pen(Color.fromKnownColor(KnownColor.ControlDarkDark).Clone(), 1);
            graphics.drawLines(pen,new com.aspose.ms.System.Drawing.Point[] { new com.aspose.ms.System.Drawing.Point(0, image.getHeight()), new com.aspose.ms.System.Drawing.Point(image.getWidth(), image.getHeight()), new com.aspose.ms.System.Drawing.Point(image.getWidth(), 0) });
            pen.dispose();
            graphics.dispose();
            control.getSubstitutePictureFormat().getPicture().setImage(presentation.getImages().addImage(image));
        }

        // Moving ActiveX frames 100 points down
        for (Control ctl : slide.Controls)
        {
            IShapeFrame frame = control.Frame;
            control.Frame = new ShapeFrame(
                frame.X, frame.Y + 100, frame.getWidth(), frame.getHeight(), frame.FlipH, frame.FlipV, frame.Rotation);
        }

        // Save the presentation with Edited ActiveX Controls
        presentation.save(RunExamples.OutPath + "withActiveX-edited_out.pptm", Aspose.getSlides().Export.SaveFormat.Pptm);


        // Now removing controls
        slide.Controls.clear();

        // Saving the presentation with cleared ActiveX controls
        presentation.save(RunExamples.OutPath + "withActiveX.cleared_out.pptm", Aspose.getSlides().Export.SaveFormat.Pptm);
        //ExEnd:ManageActiveXControl
    }
}
*/
