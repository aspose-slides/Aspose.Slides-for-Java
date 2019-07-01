package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.NotesCommentsLayoutingOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RenderComments {

	public static void main(String[] args) throws IOException {

		// The path to the documents directory.
		//ExStart:RenderComments
                String dataDir = Utils.getDataDir(RenderComments.class);
                   
                Presentation pres = new Presentation(dataDir+"presentation.pptx");

                BufferedImage image = new BufferedImage(740, 960, BufferedImage.TYPE_INT_ARGB);
                java.awt.Graphics graphics = image.createGraphics();
                NotesCommentsLayoutingOptions opts = new NotesCommentsLayoutingOptions();
            try
            {
                
               pres.getSlides().get_Item(0).renderToGraphics(opts, (Graphics2D) graphics);    
            }
           finally 
            {
              if (graphics != null) graphics.dispose();
            }
              ImageIO.write(image, "png", new java.io.File(dataDir+"OutPresBitmap123.png"));
            }
    
            //ExEnd:RenderComments	
           }
          
