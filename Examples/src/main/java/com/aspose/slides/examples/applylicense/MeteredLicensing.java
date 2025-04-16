package com.aspose.slides.examples.applylicense;

import com.aspose.slides.Metered;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MeteredLicensing
{

    public static void main(String[] args)
    {
        //ExStart:MeteredLicensing

        // Create an instance of CAD Metered class
        Metered metered = new Metered();

        try
        {
            // Access the setMeteredKey property and pass public and private keys as parameters
            metered.setMeteredKey("*****", "*****");

            // Get metered data amount before calling API
            double amountbefore = Metered.getConsumptionQuantity();

            // Display information
            System.out.println("Amount Consumed Before: " + amountbefore);
            // Get metered data amount After calling API
            double amountafter = Metered.getConsumptionQuantity();

            // Display information
            System.out.println("Amount Consumed After: " + amountafter);

            // Print status of a Metered license.
            System.out.println("Is metered license accepted: " + Metered.isMeteredLicensed());

        }
        catch (Exception ex)
        {
            Logger.getLogger(MeteredLicensing.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ExEnd:MeteredLicensing
    }

}

