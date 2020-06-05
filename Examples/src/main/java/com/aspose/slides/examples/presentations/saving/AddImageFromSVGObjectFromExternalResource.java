package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AddImageFromSVGObjectFromExternalResource
{
    public static void main(String[] args) throws IOException
    {

        //ExStart:AddImageFromSVGObjectFromExternalResource
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();
        String outPptxPath = dataDir + "presentation_external.pptx";

        Presentation p = new Presentation();
        try
        {
            String svgContent = new String(Files.readAllBytes(Paths.get(dataDir + "image1.svg")));
            ISvgImage svgImage = new SvgImage(svgContent, new ExternalResourceResolver(), dataDir);
            IPPImage ppImage = p.getImages().addImage(svgImage);
            p.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, ppImage.getWidth(), ppImage.getHeight(), ppImage);
            p.save(outPptxPath, SaveFormat.Pptx);
        }
        finally
        {
            if (p != null) p.dispose();
        }

        //ExEnd:AddImageFromSVGObjectFromExternalResource
    }
}

