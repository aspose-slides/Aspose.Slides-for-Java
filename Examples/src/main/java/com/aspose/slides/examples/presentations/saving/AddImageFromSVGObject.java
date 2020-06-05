package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AddImageFromSVGObject
{
    public static void main(String[] args) throws IOException
    {

        //ExStart:AddImageFromSVGObject
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();
        String svgPath = dataDir + "sample.svg";
        String outPptxPath = dataDir + "presentation.pptx";
        Presentation p = new Presentation();
        try
        {
            String svgContent = new String(Files.readAllBytes(Paths.get(dataDir + "sample.svg")));
            ISvgImage svgImage = new SvgImage(svgContent);
            IPPImage ppImage = p.getImages().addImage(svgImage);
            p.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, ppImage.getWidth(), ppImage.getHeight(), ppImage);
            p.save(dataDir + "presentation.pptx", SaveFormat.Pptx);
        }
        finally
        {
            p.dispose();
        }

        //ExEnd:AddImageFromSVGObject
    }
}

