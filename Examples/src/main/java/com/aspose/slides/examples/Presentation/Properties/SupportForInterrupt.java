package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.InterruptionTokenSource;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.awt.Dimension;
import java.io.ByteArrayOutputStream;


public class SupportForInterrupt {

    public static void main(String[] args) throws InterruptedException {

        final String dataDir = Utils.getDataDir(SupportForInterrupt.class);

        //ExStart:SupportForInterrupt
        final InterruptionTokenSource tokenSource = new InterruptionTokenSource();

        Runnable interruption = new Runnable() {
            public void run() {
                LoadOptions loadOptions = new LoadOptions();
                loadOptions.setInterruptionToken(tokenSource.getToken());

                Presentation pres = new Presentation(dataDir + "pres.pptx", loadOptions);
                try {
                    pres.getSlides().get_Item(0).getThumbnail(new Dimension(960, 720));
                    pres.save(new ByteArrayOutputStream(), SaveFormat.Pdf);
                } finally {
                    pres.dispose();
                }
            }
        };

        Thread thread = new Thread(interruption);// run action in a separate thread
        thread.start();

        Thread.sleep(5000); // some work

        tokenSource.interrupt();
        //ExEnd:SupportForInterrupt

    }
}