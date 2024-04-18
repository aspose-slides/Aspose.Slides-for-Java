package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class CreateSmartArtChildNoteThumbnail
{
    public static void main(String[] args)
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
        IImage bmp = node.getShapes().get_Item(0).getImage();

        // Save thumbnail
        bmp.save(dataDir + "SmartArt_ChildNote_Thumbnail_out.jpeg", ImageFormat.Jpeg);
        //ExEnd:CreateSmartArtChildNoteThumbnail
    }
}




