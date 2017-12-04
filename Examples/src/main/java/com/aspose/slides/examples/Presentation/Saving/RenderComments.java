package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class RenderComments {

	public static void main(String[] args) {

		// The path to the documents directory.
		//ExStart:RenderComments
                String dataDir = Utils.getDataDir(RenderComments.class);
                Presentation _document = new Presentation(presentationStream)
                ISlide slide = _document.getSlides().get_Item(pageNumber - 1);
                Dimension2D size = _document.getSlideSize().getSize();

                BufferedImage image = new BufferedImage((int)size.getWidth(), (int)size.getHeight(), BufferedImage.TYPE_INT_ARGB);

                java.awt.Graphics graphics = image.createGraphics();
             try
              {
              slide.renderToGraphics(renderNotes, graphics);
              }
               finally 
              {
               if (graphics != null) graphics.dispose();
              }
  
             imageToStream(image, outputStream);

              //ExEnd:RenderComments
	}
}
