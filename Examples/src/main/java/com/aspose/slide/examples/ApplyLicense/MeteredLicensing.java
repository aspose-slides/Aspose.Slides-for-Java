package com.aspose.slide.examples.ApplyLicense;

import java.math.BigDecimal;



public class MeteredLicensing 
{

	public static void main(String[] args) 
        {
            //ExStart:MeteredLicensing 	
       com.aspose.slides.Metered metered=new com.aspose.slides.Metered();
     
        // Access the setMeteredKey property and pass public and private keys as parameters
        metered.setMeteredKey("<valid pablic key>", "<valid private key>");
        
        // Get consumed qantity value before accessing API
            BigDecimal quantityOld = com.aspose.slides.Metered.getConsumptionQuantity();
        System.out.println("Consumption quantity" + quantityOld);

      
        
        // Get consumed qantity value after accessing API
            BigDecimal quantity = com.aspose.slides.Metered.getConsumptionQuantity();
        System.out.println("Consumption quantity" + quantity());
		

	}

    private static String quantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //ExEnd:MeteredLicensing 
}
