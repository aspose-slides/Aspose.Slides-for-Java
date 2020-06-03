package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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



