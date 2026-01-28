package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.ISensitivityLabel;
import com.aspose.slides.ISensitivityLabelCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SensitivityLabelAssignmentType;
import com.aspose.slides.SensitivityLabelContentType;
import com.aspose.slides.examples.RunExamples;
import java.util.UUID;

public class SensitivityLabelsExample
{
    public static void main(String[] args)
    {
        //Path for source presentation
        String pptxFile = RunExamples.getDataDir_PresentationProperties() + "OldSensitivitiLabels.pptx";

        //Out path
        String outPath = RunExamples.getOutPath() + "SensitivitiLabels_out.pptx";

        //ExStart:SensitivityLabelsExample
        String labelId = "{0372a796-4aa3-4c41-9a98-8232cac474f6}";
        String labelId2 = "{c0c0bc41-48d8-4bf2-a038-8ec8c93813b5}";
        UUID siteId = UUID.fromString("c336d4c6-89ce-480c-beb0-3bfa5538f186");

        Presentation pres = new Presentation(pptxFile);
        try {
            // Get sensitivity labels from the custom document properties
            ISensitivityLabel[] mipSensitivityLabels = pres.getDocumentProperties().getSensitivityLabels();

            ISensitivityLabelCollection sensitivityLabels = pres.getSensitivityLabels();
            for (ISensitivityLabel sensitivityLabel : mipSensitivityLabels)
            {
                // Add label to the collection
                sensitivityLabels.add(sensitivityLabel);
            }

            // Add sensitivity labels
            ISensitivityLabel label1 = sensitivityLabels.add(labelId, siteId, true, SensitivityLabelAssignmentType.Standard);
            label1.getContentMarkTypes().addItem(SensitivityLabelContentType.Header);
            label1.setRemoved(true);

            ISensitivityLabel label2 = sensitivityLabels.add(labelId2, siteId, true, SensitivityLabelAssignmentType.Privileged);
            label2.getContentMarkTypes().addItem(SensitivityLabelContentType.Footer);
            label2.getContentMarkTypes().addItem(SensitivityLabelContentType.Watermark);


            // Print sensitivity labels
            for (ISensitivityLabel sensitivityLabel : sensitivityLabels)
                System.out.println("Label Id " + sensitivityLabel.getId() + " from site " + sensitivityLabel.getSiteId());

            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SensitivityLabelsExample
    }
}
