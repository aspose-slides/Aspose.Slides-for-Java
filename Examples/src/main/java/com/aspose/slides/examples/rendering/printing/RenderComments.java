package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class RenderComments
{
    public static void main(String[] args)
    {
        //ExStart:RenderComments
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Rendering();
        String resultPath = RunExamples.getOutPath() + "OutPresBitmap.png";

        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        IRenderingOptions renderOptions = new RenderingOptions();
        NotesCommentsLayoutingOptions notesOptions = new NotesCommentsLayoutingOptions();
        notesOptions.setCommentsAreaColor(Color.RED);
        notesOptions.setCommentsAreaWidth(200);
        notesOptions.setCommentsPosition(CommentsPositions.Right);
        notesOptions.setNotesPosition(NotesPositions.BottomTruncated);
        renderOptions.setSlidesLayoutOptions(notesOptions);

        try
        {
            pres.getSlides().get_Item(0).getImage(new Dimension(740, 960)).save(resultPath, ImageFormat.Png);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RenderComments
    }
}
    


