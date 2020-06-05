package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.LoadFormat;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;





public class GetFileFormat
{
    public static void main(String[] args)
    {
        //ExStart:GetFileFormat
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationOpening();
        IPresentationInfo info = PresentationFactory.getInstance().getPresentationInfo(dataDir + "HelloWorld.pptx");
        switch (info.getLoadFormat())
        {
            case LoadFormat.Pptx:
            {
                break;
            }

            case LoadFormat.Unknown:
            {
                break;
            }
        }
        //ExEnd:GetFileFormat
    }
}


