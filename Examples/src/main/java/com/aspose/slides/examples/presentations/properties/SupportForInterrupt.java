package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.InterruptionTokenSource;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class SupportForInterrupt
{

    //ExStart:SupportForInterrupt
    public static void main(String[] args) throws InterruptedException
    {

        final String[] dataDir = {RunExamples.getDataDir_PresentationProperties()};

        final InterruptionTokenSource tokenSource = new InterruptionTokenSource();

        Runnable interruption = new Runnable()
        {
            public void run()
            {
                LoadOptions options = new LoadOptions();
                options.setInterruptionToken(tokenSource.getToken());
                Presentation presentation = new Presentation(dataDir[0] + "pres.pptx", options);
                try
                {
                    presentation.save(dataDir[0] + "pres.ppt", SaveFormat.Ppt);
                }
                finally
                {
                    if (presentation != null) presentation.dispose();
                }
            }
        };

        Thread thread = new Thread(interruption);// run action in a separate thread
        thread.start();

        Thread.sleep(10000); // some work

        tokenSource.interrupt();

    }
    //ExEnd:SupportForInterrupt

}



