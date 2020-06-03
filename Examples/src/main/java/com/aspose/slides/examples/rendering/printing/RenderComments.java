package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.CommentsPositions;
import com.aspose.slides.NotesCommentsLayoutingOptions;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.*;
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


public class RenderComments
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:RenderComments
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Rendering();
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        NotesCommentsLayoutingOptions opts = new NotesCommentsLayoutingOptions();
        opts.setCommentsAreaColor(Color.RED);

        opts.setCommentsAreaWidth(200);
        opts.setCommentsPosition(CommentsPositions.Right);
        opts.setNotesPosition(NotesPositions.BottomTruncated);

        try
        {
            BufferedImage image = new BufferedImage(740, 960, BufferedImage.TYPE_INT_ARGB);
            java.awt.Graphics graphics = image.createGraphics();
            try
            {
                pres.getSlides().get_Item(0).renderToGraphics(opts, (Graphics2D) graphics);
            }
            finally
            {
                if (graphics != null) graphics.dispose();
            }
            ImageIO.write(image, "png", new File(dataDir + "OutPresBitmap123.png"));
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
    //ExEnd:RenderComments
}
    


