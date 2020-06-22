package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;


public class VerifyingPresentationWithoutloading
{
    public static void main(String[] args)
    {
        //ExStart:VerifyingPresentationWithoutloading
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationOpening();

        int format = PresentationFactory.getInstance().getPresentationInfo(dataDir + "HelloWorld.pptx").getLoadFormat();
        // It will return "LoadFormat.Unknown" if the file is other than presentation formats  
        //ExEnd:VerifyingPresentationWithoutloading
    }
}

