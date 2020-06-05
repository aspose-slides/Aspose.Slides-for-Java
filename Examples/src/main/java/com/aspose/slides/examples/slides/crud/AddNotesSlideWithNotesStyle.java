package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class AddNotesSlideWithNotesStyle
{
    public static void main(String[] args)
    {
        //ExStart:AddNotesSlideWithNotesStyle
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Presentation class that represents the presentation file
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");
        try
        {
            IMasterNotesSlide notesMaster = presentation.getMasterNotesSlideManager().getMasterNotesSlide();

            if (notesMaster != null)
            {
                // Get MasterNotesSlide text style
                ITextStyle notesStyle = notesMaster.getNotesStyle();

                //Set symbol bullet for the first level paragraphs
                IParagraphFormat paragraphFormat = notesStyle.getLevel(0);
                paragraphFormat.getBullet().setType(BulletType.Symbol);
            }

            // Save the PPTX file to the Disk
            presentation.save(dataDir + "AddNotesSlideWithNotesStyle_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddNotesSlideWithNotesStyle
    }
}



