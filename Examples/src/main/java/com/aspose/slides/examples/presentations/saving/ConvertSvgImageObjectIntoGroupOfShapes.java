package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ConvertSvgImageObjectIntoGroupOfShapes
{
    public static void main(String[] args)
    {

        //ExStart:ConvertSvgImageObjectIntoGroupOfShapes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        Presentation pres = new Presentation(dataDir + "image.pptx");
        try
        {
            PictureFrame pFrame = (PictureFrame) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            ISvgImage svgImage = pFrame.getPictureFormat().getPicture().getImage().getSvgImage();
            if (svgImage != null)
            {
                // Convert svg image into group of shapes
                IGroupShape groupShape = pres.getSlides().get_Item(0).getShapes().
                        addGroupShape(svgImage, pFrame.getFrame().getX(), pFrame.getFrame().getY(),
                                pFrame.getFrame().getWidth(), pFrame.getFrame().getHeight());
                // remove source svg image from presentation
                pres.getSlides().get_Item(0).getShapes().remove(pFrame);
            }
            pres.save(dataDir + "image_group.pptx", SaveFormat.Pptx);
        }
        finally
        {
            pres.dispose();
        }
        //ExEnd:ConvertSvgImageObjectIntoGroupOfShapes
    }

}

