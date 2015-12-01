package com.aspose.slides.examples.featurescomparison.slides.convertslidetoimage;

import org.apache.poi.xslf.util.PPTX2PNG;

import com.aspose.slides.examples.Utils;

public class ApacheConvertToImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApacheConvertToImage.class);

        PPTX2PNG.main(new String[]{dataDir + "presentation.pptx"});
    }
}
