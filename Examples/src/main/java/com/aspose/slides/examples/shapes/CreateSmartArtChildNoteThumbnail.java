package com.aspose.slides.examples.shapes;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class CreateSmartArtChildNoteThumbnail
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:CreateSmartArtChildNoteThumbnail
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Instantiate Presentation class that represents the PPTX file 
        Presentation pres = new Presentation();

        // Add SmartArt 
        ISmartArt smart = pres.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 400, 300, SmartArtLayoutType.BasicCycle);

        // Obtain the reference of a node by using its Index  
        ISmartArtNode node = smart.getNodes().get_Item(1);

        // Get thumbnail
        BufferedImage bmp = node.getShapes().get_Item(0).getThumbnail();

        // Save thumbnail
        ImageIO.write(bmp, ".jpeg", new File(dataDir + "SmartArt_ChildNote_Thumbnail_out.jpeg"));
        //ExEnd:CreateSmartArtChildNoteThumbnail
    }
}




