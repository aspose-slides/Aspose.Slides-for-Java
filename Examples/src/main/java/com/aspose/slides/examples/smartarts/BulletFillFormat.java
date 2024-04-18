package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class BulletFillFormat
{
    public static void main(String[] args)
    {

        //ExStart:BulletFillFormat
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();
        String outputDir = RunExamples.getOutPath();

        Presentation presentation = new Presentation();
        try
        {
            ISmartArt smart = presentation.getSlides().get_Item(0).getShapes().addSmartArt(10, 10, 500, 400, SmartArtLayoutType.VerticalPictureList);
            ISmartArtNode node = smart.getAllNodes().get_Item(0);

            if (node.getBulletFillFormat() != null)
            {
                IImage img = Images.fromFile(dataDir + "aspose-logo.jpg");
                IPPImage image = presentation.getImages().addImage(img);
                node.getBulletFillFormat().setFillType(FillType.Picture);
                node.getBulletFillFormat().getPictureFillFormat().getPicture().setImage(image);
                node.getBulletFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Stretch);
            }
            presentation.save(outputDir + "out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:BulletFillFormat
    }
}

