package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.IImage;
import com.aspose.slides.ISvgImage;
import com.aspose.slides.ImageFormat;
import com.aspose.slides.MarkdownExportType;
import com.aspose.slides.MarkdownSaveOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/*
This example shows how to control the process of saving and referencing images in the resulting Markdown file
using the ImageSaving and SvgImageSaving events.
*/
public class ConvertImagesToMarkdown
{
    public static void main(String[] args)
    {

        // Path to source presentation
        final String presentationName = RunExamples.getDataDir_Conversion() + "demo_2.pptx";
        final String outFilePath = RunExamples.getOutPath() + "output_markdown.md";
        final String imagesDir = RunExamples.getOutPath() + "ExportedImages/";

        // Check the catalog for images
        File imageDir = new File(imagesDir);
        if (!imageDir.exists()) {
            imageDir.mkdirs();
        }

        //ExStart:ConvertImagesToMarkdown
        MarkdownSaveOptions options = new MarkdownSaveOptions();
        options.setImagesSaveFolderName("Images");
        options.setExportType(MarkdownExportType.Visual);

        options.setImageSaving(new MarkdownSaveOptions.MarkdownImageSavingHandler() {
            @Override
            public boolean invoke(IImage image, int format, String[] link) {
                format = ImageFormat.Jpeg; //Force output format to JPEG for all images.
                String fileName = "Image_" + UUID.randomUUID() + ".jpg";

                link[0] = imagesDir + fileName;
                image.save(link[0], format);

                return true;
            }
        });

        options.setSvgImageSaving(new MarkdownSaveOptions.MarkdownSvgImageSavingHandler() {
            @Override
            public boolean invoke(ISvgImage svgImage, String[] link) {
                String fileName = "Svg_" + UUID.randomUUID() + ".svg";

                link[0] = imagesDir + fileName;
                try {
                    FileOutputStream f = new FileOutputStream(link[0]);
                    f.write(svgImage.getSvgData());
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return true;
            }
        });

        Presentation presentation = new Presentation(presentationName);
        try {
            presentation.save(outFilePath, SaveFormat.Md, options);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ConvertImagesToMarkdown
    }
}
