package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class RenderingEmoji
{
    //ExStart:RenderingEmoji
    public static void main(String[] args)
    {
        
        String dataDir = RunExamples.getDataDir_Rendering();

        Presentation pres = new Presentation(dataDir + "input.pptx");

        pres.save(dataDir + "emoji.pdf", SaveFormat.Pdf);
    }

}
//ExEnd:RenderingEmoji

