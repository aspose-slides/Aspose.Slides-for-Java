package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.NullableBool;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;

public class CheckPresentationProtection
{
    public static void main(String[] args)
    {
        //Path for source presentation
        String pptxFile = RunExamples.getDataDir_PresentationProperties() + "modify_pass2.pptx";
        String pptFile = RunExamples.getDataDir_PresentationProperties() + "open_pass1.ppt";

        // Check the Write Protection Password via IPresentationInfo Interface
        IPresentationInfo presentationInfo = PresentationFactory.getInstance().getPresentationInfo(pptxFile);
        boolean isWriteProtectedByPassword = presentationInfo.isWriteProtected() == NullableBool.True && presentationInfo.checkWriteProtection("pass2");
        System.out.println("Is presentation write protected by password = " + isWriteProtectedByPassword);

        // Check the Write Protection Password via IProtectionManager Interface
        Presentation presentation = new Presentation();
        try
        {
            boolean isWriteProtected = presentation.getProtectionManager().checkWriteProtection("pass2");
            System.out.println("Is presentation write protected = " + isWriteProtected);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

        // Check Presentation Open Protection via IPresentationInfo Interface
        presentationInfo = PresentationFactory.getInstance().getPresentationInfo(pptFile);
        if (presentationInfo.isPasswordProtected())
        {
            System.out.println("The presentation '" + pptxFile + "' is protected by password to open.");
        }
    }
}