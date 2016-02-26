from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ChartType
from com.aspose.slides import SaveFormat

class SetLabelDistance:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/SetLabelDistance/'
        
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Adding a chart on slide
        chartType=ChartType
        ch = sld.getShapes().addChart(chartType.ClusteredColumn, 20, 20, 500, 300)

        # Setting the position of label from axis
        ch.getAxes().getHorizontalAxis().setLabelOffset(500)

        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "Position.pptx", save_format.Pptx)

        print "Set label distance, please check the output file."

if __name__ == '__main__':        
    SetLabelDistance()