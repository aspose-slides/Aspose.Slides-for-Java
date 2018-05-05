package Aspose.Slides;

import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;


public class OrganizationChart {
public static void main(String[] args)  {
 
 
   //ExStart:OrganizationChart 
   String dataDir = Utils.getDataDir(OrganizationChart.class);
   Presentation pres = new Presentation();
 {
   ISmartArt smartArt = pres.getSlides().get_Item(0).getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.PictureOrganizationChart);
   pres.save("OrganizationChart.pptx", SaveFormat.Pptx);
 }
   pres.dispose();
 }

//ExEnd:OrganizationChart 
}