package asposefeatures.workingwithcharts.charttrendlines.java;

import java.awt.Color;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.ITrendline;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TrendlineType;

public class AddChartTrendLines
{
    public static void main(String[] args)
    {
    	String dataPath = "src/asposefeatures/workingwithcharts/charttrendlines/data/";
	
	//Creating empty presentation//Creating empty presentation
	Presentation pres = new Presentation();

	//Creating a clustered column chart
	IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 20, 20, 500, 400);

	//Adding potential trend line for chart series 1
	ITrendline tredLinep = chart.getChartData().getSeries().get_Item(0).getTrendLines().add(TrendlineType.Exponential);
	tredLinep.setDisplayEquation(false);
	tredLinep.setDisplayRSquaredValue(false);

	//Adding Linear trend line for chart series 1
	ITrendline tredLineLin = chart.getChartData().getSeries().get_Item(0).getTrendLines().add(TrendlineType.Linear);
	tredLineLin.setTrendlineType(TrendlineType.Linear);
	tredLineLin.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
	tredLineLin.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.RED);


	//Adding Logarithmic trend line for chart series 2
	ITrendline tredLineLog = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(TrendlineType.Logarithmic);
	tredLineLog.setTrendlineType(TrendlineType.Logarithmic);
	tredLineLog.addTextFrameForOverriding("New log trend line");

	//Adding MovingAverage trend line for chart series 2
	ITrendline tredLineMovAvg = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(TrendlineType.MovingAverage);
	tredLineMovAvg.setTrendlineType(TrendlineType.MovingAverage);
	tredLineMovAvg.setPeriod((byte)3);
	tredLineMovAvg.setTrendlineName("New TrendLine Name");

	//Adding Polynomial trend line for chart series 3
	ITrendline tredLinePol = chart.getChartData().getSeries().get_Item(2).getTrendLines().add(TrendlineType.Polynomial);
	tredLinePol.setTrendlineType(TrendlineType.Polynomial);
	tredLinePol.setForward(1);
	tredLinePol.setOrder ((byte)3);

	//Adding Power trend line for chart series 3
	ITrendline tredLinePower = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(TrendlineType.Power);
	tredLinePower.setTrendlineType(TrendlineType.Power);
	tredLinePower.setBackward(1);

	//Saving presentation
	pres.save(dataPath + "AsposeChartTrendLines.pptx", SaveFormat.Pptx);
	System.out.println("AsposeChartTrendLines Saved.");
    }
}