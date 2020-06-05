package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.LoadFormat;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;





public class LoadFormatEnumeration
{
    public static void main(String[] args)
    {
        //ExStart:LoadFormatEnumeration
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationOpening();
        boolean isOldFormat = PresentationFactory.getInstance().getPresentationInfo(dataDir + "presentation.ppt").getLoadFormat() == LoadFormat.Ppt95;


    }
    //ExEnd:LoadFormatEnumeration
}


