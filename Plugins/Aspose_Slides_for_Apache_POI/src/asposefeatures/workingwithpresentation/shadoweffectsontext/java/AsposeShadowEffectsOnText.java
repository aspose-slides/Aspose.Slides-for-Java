package asposefeatures.workingwithpresentation.shadoweffectsontext.java;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.OuterShadow;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresetColor;
import com.aspose.slides.RectangleAlignment;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;

public class AsposeShadowEffectsOnText
{
    public static void main(String[] args)
    {
	String dataPath = "src/asposefeatures/workingwithpresentation/shadoweffectsontext/data/";
	
	// instantiate a Presentation Object
	Presentation pres = new Presentation();

	// Get first slide
	ISlide sld = pres.getSlides().get_Item(0);

	// Add an AutoShape of Rectangle type
	IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

	// Add TextFrame to the Rectangle
	ashp.addTextFrame("Aspose TextBox");

	// Disable shape fill in case we want to get shadow of text.
	ashp.getFillFormat().setFillType(FillType.NoFill);

	// Add outer shadow and set all necessary parameters
	new com.aspose.slides.
	OuterShadow shadow = new OuterShadow();
	ashp.getEffectFormat().setOuterShadowEffect(shadow);
	shadow.setBlurRadius(4.0);
	shadow.setDirection(45);
	shadow.setDistance(3);
	shadow.setRectangleAlign(RectangleAlignment.TopLeft);
	shadow.getShadowColor().setPresetColor(PresetColor.Black);

	// Write the presentation to disk
	pres.save(dataPath + "AsposeTextShadow.pptx", SaveFormat.Pptx);
	System.out.println("Done");
	
    }
}
