package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;

public class DeleteEmbeddedBinaryObjects
{
    public static void main(String[] args)
    {
        String pptxFileName = RunExamples.getDataDir_PresentationOpening() + "OlePptx.pptx";
        String outPath = RunExamples.getOutPath() + "OlePptx-out.pptx";
        //ExStart:ExportOleExample
        // Create loading options.
        LoadOptions loadOption = new LoadOptions();
        loadOption.setDeleteEmbeddedBinaryObjects(true);

        // Numbers of frames in a presentation.
        int emptyOleFrames;
        // Number of empty frames in a presentation.
        int oleFramesCount;

        Presentation pres = new Presentation(pptxFileName, loadOption);
        try {
            oleFramesCount = GetOleObjectFrameCount(pres.getSlides());
            System.out.println("Number of OLE frames in source presentation = " + oleFramesCount);

            pres.save(outPath, SaveFormat.Pptx);
            Presentation outPres = new Presentation(outPath);
            try {
                oleFramesCount = GetOleObjectFrameCount(outPres.getSlides());
                System.out.println("Number of OLE frames in resulting presentation = " + oleFramesCount);
            } finally {
                if (outPres != null) outPres.dispose();
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportOleExample
    }

    private static int GetOleObjectFrameCount(ISlideCollection slides)
    {
        int oleFramesCount = 0;
        int emptyOleFrames = 0;

        for (ISlide sld : slides)
        {
            for (IShape shape : sld.getShapes())
            {
                if (shape instanceof OleObjectFrame)
                {
                    OleObjectFrame objectFrame = (OleObjectFrame) shape;

                    oleFramesCount++;

                    byte[] embeddedData = objectFrame.getEmbeddedData().getEmbeddedFileData();
                    if (embeddedData == null || embeddedData.length == 0)
                        emptyOleFrames++;
                }
            }
        }

        System.out.println("Number of empty OLE frames in source presentation = " + emptyOleFrames);

        return oleFramesCount;
    }
}
