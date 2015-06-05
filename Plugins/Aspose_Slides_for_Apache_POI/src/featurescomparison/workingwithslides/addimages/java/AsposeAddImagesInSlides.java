package featurescomparison.workingwithslides.addimages.java;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.LineArrowheadLength;
import com.aspose.slides.LineArrowheadStyle;
import com.aspose.slides.LineDashStyle;
import com.aspose.slides.LineStyle;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresetColor;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;

/**
 * 
 * @author Shoaib Khan
 *
 */
public class AsposeAddImagesInSlides
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithslides/addimages/data/";
		
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation(dataPath + "presentation.ppt");
		
		//Accessing a slide using its slide position
		ISlide slide = pres.getSlides().get_Item(0);
		
		//===========================================================
		// Plain Line
		//===========================================================
		//Adding a line shape into the slide with its start and end points
		slide.getShapes().addAutoShape(ShapeType.Line, 50, 50, 400, 0);
		
		//===========================================================
		// Adding Simple Ellipse in the Slide
		//============================================================
		//Adding an ellipse shape into the slide by defining its X,Y postion, width and height
		slide.getShapes().addAutoShape(ShapeType.Ellipse, 270, 150, 350, 50);
		   
		//============================================================
		// Adding Simple Rectangle in the Slide
		//============================================================
		
		//Adding a rectangle shape into the slide by defining its X,Y position, width and height
		slide.getShapes().addAutoShape(ShapeType.Rectangle, 50, 150, 200, 100);
		
		//===========================================================
		// Arrow Shaped Line
		//============================================================
		///Add an autoshape of type line
		
		IAutoShape shp = slide.getShapes().addAutoShape(ShapeType.Line, 50, 130, 300, 0);
		
		//Apply some formatting on the line
		shp.getLineFormat().setStyle (LineStyle.ThickBetweenThin);
		shp.getLineFormat().setWidth ( 10);
		
		shp.getLineFormat().setDashStyle  (LineDashStyle.DashDot);
		
		shp.getLineFormat().setBeginArrowheadLength(LineArrowheadLength.Short);
		shp.getLineFormat().setBeginArrowheadStyle (LineArrowheadStyle.Oval);
		
		shp.getLineFormat().setEndArrowheadLength (LineArrowheadLength.Long);
		shp.getLineFormat().setEndArrowheadStyle (LineArrowheadStyle.Triangle);
		
		shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
		shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(new Color(com.aspose.slides.PresetColor.Maroon));
		   
		//===========================================================
		// Adding Formatted Ellipse in the Slide
		//============================================================
		//Add autoshape of ellipse type
		shp = slide.getShapes().addAutoShape(ShapeType.Ellipse, 270, 350, 350, 50);
		
		//Apply some formatting to ellipse shape
		shp.getFillFormat().setFillType(FillType.Solid);
		shp.getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Chocolate));
		
		//Apply some formatting to the line of Ellipse
		shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
		shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
		shp.getLineFormat().setWidth(5);
		
		//============================================================
		// Adding Formatted Rectangle to Slide
		//============================================================
		//Adding a rectangle shape into the slide by defining its X,Y position, width and height
		shp = slide.getShapes().addAutoShape(ShapeType.Rectangle, 50, 350, 200, 100);
		
		//Apply some formatting to ellipse shape
		shp.getFillFormat().setFillType(FillType.Solid);
		shp.getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Chocolate));
		
		//Apply some formatting to the line of Ellipse
		shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
		shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);
		shp.getLineFormat().setWidth(5);
		
		//Writing the presentation as a PPT file
		pres.save(dataPath + "ImageInSlides_Aspose_Out.pptx", SaveFormat.Pptx);
        
        //Print Message
        System.out.println("Shapes added successfully.");
	}
}
