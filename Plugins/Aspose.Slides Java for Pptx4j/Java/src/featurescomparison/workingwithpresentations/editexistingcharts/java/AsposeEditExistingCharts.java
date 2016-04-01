package featurescomparison.workingwithpresentations.editexistingcharts.java;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeEditExistingCharts
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithpresentations/editexistingcharts/data/";
		
		//Instantiate Presentation class that represents PPTX file
		Presentation pres = new Presentation(dataPath + "AsposeChart.pptx");

		//Access first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add chart with default data
		IChart chart = (IChart)sld.getShapes().get_Item(0);

		//Setting the index of chart data sheet
		int defaultWorksheetIndex = 0;

		//Getting the chart data worksheet
		IChartDataWorkbook fact = chart.getChartData().getChartDataWorkbook();

		//Changing chart Category Name
		fact.getCell(defaultWorksheetIndex, 1, 0, "Modified Category 1");
		fact.getCell(defaultWorksheetIndex, 2, 0, "Modified Category 2");


		//Take first chart series
		IChartSeries series = chart.getChartData().getSeries().get_Item(0);

		//Now updating series data
		fact.getCell(defaultWorksheetIndex, 0, 1, "New_Series1");//modifying series name
		series.getDataPoints().get_Item(0).getValue().setData (90);
		series.getDataPoints().get_Item(1).getValue().setData ( 123);
		series.getDataPoints().get_Item(2).getValue().setData ( 44);

		//Take Second chart series
		series = chart.getChartData().getSeries().get_Item(1);

		//Now updating series data
		fact.getCell(defaultWorksheetIndex, 0, 2, "New_Series2");//modifying series name
		series.getDataPoints().get_Item(0).getValue().setData (23);
		series.getDataPoints().get_Item(1).getValue().setData ( 67);
		series.getDataPoints().get_Item(2).getValue().setData ( 99);


		//Now, Adding a new series
		chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 3, "Series 3"), chart.getType());

		//Take 3rd chart series
		series = chart.getChartData().getSeries().get_Item(2);

		//Now populating series data
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 1, 3, 20));
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 2, 3, 50));
		series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 3, 3, 30));

		chart.setType(ChartType.ClusteredCylinder);

		// Save presentation with chart
		pres.save(dataPath + "ChartModified-Aspose.pptx", SaveFormat.Pptx);	
		System.out.println("Done");
	}
}