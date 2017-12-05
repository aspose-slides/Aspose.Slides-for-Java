package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class RenderComments {

	public static void main(String[] args) {

		// The path to the documents directory.
		//ExStart:RenderComments
                String dataDir = Utils.getDataDir(RenderComments.class);
                   
                Presentation pres = new Presentation(path+"testexample.pptx");

                BufferedImage image = new BufferedImage(740, 960, BufferedImage.TYPE_INT_ARGB);
                java.awt.Graphics graphics = image.createGraphics();
            try
            {
               pres.getSlides().get_Item(0).renderToGraphics(true, (Graphics2D) graphics);    
            }
           finally 
            {
              if (graphics != null) graphics.dispose();
            }
              ImageIO.write(image, "png", new java.io.File(path+"OutPresBitmap123.png"));
            }
    
            //ExEnd:RenderComments	
           }
          }
