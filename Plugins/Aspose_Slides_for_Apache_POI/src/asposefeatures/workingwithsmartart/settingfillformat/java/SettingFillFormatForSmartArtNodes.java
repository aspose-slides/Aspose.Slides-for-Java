package asposefeatures.workingwithsmartart.settingfillformat.java;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.ISmartArtNode;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class SettingFillFormatForSmartArtNodes
{
    public static void main(String[] args)
    {
	String dataPath = "src/asposefeatures/workingwithsmartart/settingfillformat/data/";

	//Instantiate the presentation
	Presentation pres = new Presentation();

	//Accessing the slide
	ISlide slide = pres.getSlides().get_Item(0);

	//Adding SmartArt shape and nodes
	ISmartArt chevron = slide.getShapes().addSmartArt(10, 10, 800, 60, com.aspose.slides.SmartArtLayoutType.ClosedChevronProcess);
	ISmartArtNode node = chevron.getAllNodes().addNode(); 
	node.getTextFrame().setText("Some text");

	//Setting node fill color
	for (IShape item : node.getShapes())
	{
	  item.getFillFormat().setFillType(FillType.Solid);
	  item.getFillFormat().getSolidFillColor().setColor(Color.RED);
	}

	//Save the presentation
	pres.save(dataPath + "AsposeTestSmart.pptx", SaveFormat.Pptx);
	System.out.println("AsposeTestSmart Saved.");
    }
}