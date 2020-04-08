package com.aspose.slides.examples.ApplyLicense;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MeteredLicensing {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(MeteredLicensing.class);

        //ExStart:MeteredLicensing
        com.aspose.slides.Metered metered = new com.aspose.slides.Metered();
        try {
            // Access the setMeteredKey property and pass public and private keys as parameters
            metered.setMeteredKey("<valid pablic key>", "<valid private key>");

            // Get consumed qantity value before accessing API
            double quantityOld = com.aspose.slides.Metered.getConsumptionQuantity();
            System.out.println("Consumption quantity" + quantityOld);

            Presentation pres = new Presentation(dataDir + "test.pptx");
            try {
                // Save the presentation to PDF
                pres.save(dataDir + "output.pdf", SaveFormat.Pdf);
            } finally {
                if (pres != null) pres.dispose();
            }

            // Get consumed qantity value after accessing API
            double quantity = com.aspose.slides.Metered.getConsumptionQuantity();
            System.out.println("Consumption quantity" + quantity);
        } catch (Exception ex) {
            Logger.getLogger(MeteredLicensing.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ExEnd:MeteredLicensing
    }

}
