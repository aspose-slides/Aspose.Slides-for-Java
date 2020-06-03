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

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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




