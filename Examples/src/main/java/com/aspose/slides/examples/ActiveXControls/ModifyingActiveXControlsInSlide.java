package com.aspose.slides.examples.ActiveXControls;

import java.awt.FontMetrics;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;

import com.aspose.slides.IControl;
import com.aspose.slides.IShapeFrame;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeFrame;
import com.aspose.slides.examples.Utils;

public class ModifyingActiveXControlsInSlide {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ModifyingActiveXControlsInSlide.class);
                //ExStart:ModifyingActiveXControlsInSlide
		// Accessing the presentation with ActiveX controls
		Presentation pres = new Presentation(dataDir + "ActiveX.pptm");

		// Accessing the first slide in presentation
		ISlide slide = pres.getSlides().get_Item(0);

		// changing TextBox text
		IControl control = slide.getControls().get_Item(0);

		if (control.getName() == "TextBox1" && control.getProperties() != null) {
			String newText = "Changed text";
			control.getProperties().set_Item("Value", newText);

			// Changing substitute image. PowerPoint will replace this image during activeX activation, 
			// so sometime it's OK to leave image unchanged.
			BufferedImage image = new BufferedImage((int) control.getFrame().getWidth(), (int) control.getFrame().getHeight(), 
						BufferedImage.TYPE_INT_ARGB);

			java.awt.Graphics graphics = image.getGraphics();
			graphics.setColor(SystemColor.window);
			graphics.fillRect(0, 0, image.getWidth(), image.getHeight());

			java.awt.Font font = new java.awt.Font(control.getProperties().get_Item("FontName"), java.awt.Font.PLAIN, 16);
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
			control.getSubstitutePictureFormat().getPicture().setImage(pres.getImages().addImage(image));
		}

		// Changing Button caption
		control = pres.getSlides().get_Item(0).getControls().get_Item(1);

		if (control.getName().equalsIgnoreCase("CommandButton1") && control.getProperties() != null) {
			String newCaption = "Show MessageBox";
			control.getProperties().set_Item("Caption", newCaption);
			// Changing substitute
			BufferedImage image = new BufferedImage((int) control.getFrame().getWidth(), (int) control.getFrame().getHeight(), 
						BufferedImage.TYPE_INT_ARGB);
			java.awt.Graphics graphics = image.getGraphics();
			graphics.setColor(SystemColor.control);
			graphics.fillRect(0, 0, image.getWidth(), image.getHeight());

			java.awt.Font font = new java.awt.Font(control.getProperties().get_Item("FontName"), java.awt.Font.PLAIN, 16);
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
			control.getSubstitutePictureFormat().getPicture().setImage(pres.getImages().addImage(image));
		}

		// moving 100 points down
		for (IControl ctl : pres.getSlides().get_Item(0).getControls()) {
			IShapeFrame frame = ctl.getFrame();
			ctl.setFrame(new ShapeFrame(frame.getX(), frame.getY() + 100, 
					frame.getWidth(), frame.getHeight(), frame.getFlipH(), frame.getFlipV(), frame.getRotation()));
		}
		pres.save(dataDir + "withActiveX-edited_java.pptm", SaveFormat.Pptm);

		// removing controls
		pres.getSlides().get_Item(0).getControls().clear();
		pres.save(dataDir + "withActiveX-cleared_java.pptm", SaveFormat.Pptm);
               //ExEnd:ModifyingActiveXControlsInSlide
	}

}
