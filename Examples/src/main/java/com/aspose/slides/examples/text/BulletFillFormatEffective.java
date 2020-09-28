package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class BulletFillFormatEffective {

    public static void main(String[] args) {
        //ExStart:BulletFillFormatEffective
        String dataDir = RunExamples.getDataDir_Text();
        String pptxFile = dataDir + "BulletData.pptx";

        Presentation pres = new Presentation(pptxFile);
        try {
            AutoShape autoShape = (AutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            for (IParagraph para : autoShape.getTextFrame().getParagraphs()) {
                IBulletFormatEffectiveData bulletFormatEffective = para.getParagraphFormat().getBullet().getEffective();
                System.out.println("Bullet type: " + bulletFormatEffective.getType());
                if (bulletFormatEffective.getType() != BulletType.None) {
                    System.out.println("Bullet fill type: " + bulletFormatEffective.getFillFormat().getFillType());
                    switch (bulletFormatEffective.getFillFormat().getFillType()) {
                        case FillType.Solid:
                            System.out.println(
                                    "Solid fill color: " + bulletFormatEffective.getFillFormat().getSolidFillColor());
                            break;
                        case FillType.Gradient:
                            System.out.println("Gradient stops count: " +
                                    bulletFormatEffective.getFillFormat().getGradientFormat().getGradientStops().size());
                            for (IGradientStopEffectiveData gradStop : bulletFormatEffective.getFillFormat()
                                    .getGradientFormat().getGradientStops())
                                System.out.println(gradStop.getPosition() + ": " + gradStop.getColor());
                            break;
                        case FillType.Pattern:
                            System.out.println("Pattern style: " +
                                    bulletFormatEffective.getFillFormat().getPatternFormat().getPatternStyle());
                            System.out.println("Fore color: " +
                                    bulletFormatEffective.getFillFormat().getPatternFormat().getForeColor());
                            System.out.println("Back color: " +
                                    bulletFormatEffective.getFillFormat().getPatternFormat().getBackColor());
                            break;
                    }
                }

                System.out.println();
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:BulletFillFormatEffective
    }
}
