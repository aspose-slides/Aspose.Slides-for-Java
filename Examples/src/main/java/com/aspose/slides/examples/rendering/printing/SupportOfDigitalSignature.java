package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.DigitalSignature;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SupportOfDigitalSignature
{

    public static void main(String[] args)
    {

        //ExStart:SupportOfDigitalSignature

        String dataDir = RunExamples.getDataDir_Rendering();
        String outPath = RunExamples.getOutPath();

        Presentation pres = new Presentation();
        try
        {

            DigitalSignature signature = new DigitalSignature(dataDir + "testsignature1.pfx", "testpass1");


            signature.setComments("Aspose.Slides digital signing test.");


            pres.getDigitalSignatures().add(signature);


            pres.save(outPath + "SomePresentationSigned.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:SupportOfDigitalSignature


    }
}

