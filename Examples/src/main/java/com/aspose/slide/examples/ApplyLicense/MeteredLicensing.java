package com.aspose.slide.examples.ApplyLicense;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MeteredLicensing {

	public static void main(String[] args) 
        {
            //ExStart:MeteredLicensing
	
       com.aspose.slides.Metered metered=new com.aspose.slides.Metered();
     
            try {
                // Access the setMeteredKey property and pass public and private keys as parameters
                metered.setMeteredKey("<valid pablic key>", "<valid private key>");
           
                   // Get consumed qantity value before accessing API
            double quantityOld = com.aspose.slides.Metered.getConsumptionQuantity();
        System.out.println("Consumption quantity" + quantityOld);

        
        // Get consumed qantity value after accessing API
            double quantity = com.aspose.slides.Metered.getConsumptionQuantity();
        System.out.println("Consumption quantity" + quantity());
		

            } catch (Exception ex) {
                Logger.getLogger(MeteredLicensing.class.getName()).log(Level.SEVERE, null, ex);
            }
        
 
	}

    private static String quantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //ExEnd:MeteredLicensing
}
