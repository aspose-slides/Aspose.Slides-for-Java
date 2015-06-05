package featurescomparison.workingwithslides.addimages.java;

import java.awt.Color;
import java.io.FileOutputStream;

import org.apache.poi.hslf.model.AutoShape;
import org.apache.poi.hslf.model.Line;
import org.apache.poi.hslf.model.ShapeTypes;
import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.RichTextRun;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheAddImagesInSlides
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithslides/addimages/data/";
		
		SlideShow ppt = new SlideShow();
		
		Slide slide = ppt.createSlide();
		
		// Line shape
		Line line = new Line();
		line.setAnchor(new java.awt.Rectangle(50, 50, 100, 20));
		line.setLineColor(new Color(0, 128, 0));
		line.setLineStyle(Line.LINE_DOUBLE);
		slide.addShape(line);
		
		// TextBox
		TextBox txt = new TextBox();
		txt.setText("Hello, World!");
		txt.setAnchor(new java.awt.Rectangle(300, 100, 300, 50));
		
		// use RichTextRun to work with the text format
		RichTextRun rt = txt.getTextRun().getRichTextRuns()[0];
		rt.setFontSize(32);
		rt.setFontName("Arial");
		rt.setBold(true);
		rt.setItalic(true);
		rt.setUnderlined(true);
		rt.setFontColor(Color.red);
		rt.setAlignment(TextBox.AlignRight);
		
		slide.addShape(txt);
		
		// Autoshape
		// 32-point star
		AutoShape sh1 = new AutoShape(ShapeTypes.Star32);
		sh1.setAnchor(new java.awt.Rectangle(50, 50, 100, 200));
		sh1.setFillColor(Color.red);
		slide.addShape(sh1);
		
		// Trapezoid
		AutoShape sh2 = new AutoShape(ShapeTypes.Trapezoid);
		sh2.setAnchor(new java.awt.Rectangle(150, 150, 100, 200));
		sh2.setFillColor(Color.blue);
		slide.addShape(sh2);
		
		FileOutputStream out = new FileOutputStream(dataPath + "ImageInSlides_Apache_Out.ppt");
		ppt.write(out);
		out.close();
		
		//Print Message
        System.out.println("Shapes added successfully.");
	}
}
