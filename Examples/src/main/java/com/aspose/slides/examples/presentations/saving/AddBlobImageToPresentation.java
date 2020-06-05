package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.FileInputStream;


public class AddBlobImageToPresentation
{
    public static void main(String[] args)
    {

        //ExStart:AddBlobImageToPresentation

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        String pathToLargeImage = dataDir + "large_image.jpg";

        // create a new presentation which will contain this image
        Presentation pres = new Presentation();
        try
        {
            // supposed we have the large image file we want to include into the presentation
            FileInputStream fip = new FileInputStream(dataDir + "large_image.jpg");
            try
            {
                // let's add the image to the presentation - we choose KeepLocked behavior, because we not
                // have an intent to access the "largeImage.png" file.
                IPPImage img = pres.getImages().addImage(fip, LoadingStreamBehavior.KeepLocked);
                pres.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, 300, 200, img);

                // save the presentation. Despite that the output presentation will be
                // large, the memory consumption will be low the whole lifetime of the pres object
                pres.save(dataDir + "presentationWithLargeImage.pptx", SaveFormat.Pptx);
            }
            finally
            {
                fip.close();
            }
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            pres.dispose();
        }

        //ExEnd:AddBlobImageToPresentation

    }
}

