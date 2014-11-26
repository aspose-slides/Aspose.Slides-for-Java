/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.defaultfonts.java;

import com.aspose.slides.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class DefaultFonts
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/defaultfonts/data/";
        //Use load options to define the default regualr and asian fonts
        LoadOptions lo = new LoadOptions(LoadFormat.Auto);
        lo.setDefaultRegularFont("Wingdings");
        lo.setDefaultAsianFont("Wingdings");

        //Do Some work and perform presentation/slides rendering
        Presentation presentation = new Presentation(dataDir+ "input.pptx");

        //Generate slide thumbnail
        BufferedImage image = presentation.getSlides().get_Item(0).getThumbnail(1, 1);
        ImageIO.write(image, "png", new File(dataDir+ "output.png"));

        //Generate PDF
        presentation.save("output.pdf", SaveFormat.Pdf);

        //Generate XPS
        presentation.save(dataDir+ "output.xps", SaveFormat.Xps);

    }
}




