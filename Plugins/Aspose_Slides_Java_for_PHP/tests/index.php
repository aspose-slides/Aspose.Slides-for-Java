<?php

require_once("../../java/Java.inc");

require_once __DIR__ . '/../vendor/autoload.php'; // Autoload files using Composer autoload

use Aspose\Slides\IntroductionToPresentation\HelloWorld;
use Aspose\Slides\WorkingWithActiveXControls\AddActiveX;
use Aspose\Slides\WorkingWithCharts\ChartLegend;
use Aspose\Slides\WorkingWithCharts\ChartProperties;
use Aspose\Slides\WorkingWithCharts\ChartSeries;
use Aspose\Slides\WorkingWithCharts\ChartTrendLines;
use Aspose\Slides\WorkingWithCharts\CreateChart;
use Aspose\Slides\WorkingWithCharts\ErrorBars;
use Aspose\Slides\WorkingWithCharts\ExistingChart;
use Aspose\Slides\WorkingWithCharts\FormattingChartEntities;
use Aspose\Slides\WorkingWithCharts\SetLabelDistance;
use Aspose\Slides\WorkingWithCharts\SetPieChartColors;
use Aspose\Slides\WorkingWithPresentation\ConvertingToHtml;
use Aspose\Slides\WorkingWithPresentation\ConvertingToNotes;
use Aspose\Slides\WorkingWithPresentation\ConvertingToPdf;
use Aspose\Slides\WorkingWithPresentation\ConvertingToTiff;
use Aspose\Slides\WorkingWithPresentation\ConvertingToXps;
use Aspose\Slides\WorkingWithPresentation\OdpToPptx;
use Aspose\Slides\WorkingWithPresentation\PptToPptx;
use Aspose\Slides\WorkingWithPresentation\Properties;
use Aspose\Slides\WorkingWithPresentation\Zoom;
use Aspose\Slides\WorkingWithShapes\AddingLineShape;
use Aspose\Slides\WorkingWithShapes\FillingShapes;
use Aspose\Slides\WorkingWithShapes\FindShape;
use Aspose\Slides\WorkingWithShapes\FormatLines;
use Aspose\Slides\WorkingWithShapes\Frame;
use Aspose\Slides\WorkingWithShapes\RotatingShapes;
use Aspose\Slides\WorkingWithSlidesInPresentation\AccessSlides;
use Aspose\Slides\WorkingWithSlidesInPresentation\AddSlides;
use Aspose\Slides\WorkingWithSlidesInPresentation\Background;
use Aspose\Slides\WorkingWithSlidesInPresentation\ChangingPosition;
use Aspose\Slides\WorkingWithSlidesInPresentation\CloneSlides;
use Aspose\Slides\WorkingWithSlidesInPresentation\CreatingSvg;
use Aspose\Slides\WorkingWithSlidesInPresentation\Hyperlinks;
use Aspose\Slides\WorkingWithSlidesInPresentation\RemoveSlides;
use Aspose\Slides\WorkingWithSlidesInPresentation\SizeAndLayout;
use Aspose\Slides\WorkingWithSlidesInPresentation\Thumbnail;
use Aspose\Slides\WorkingWithSlidesInPresentation\Transitions;
use Aspose\Slides\WorkingWithSmartArt\AddSmartArt;
use Aspose\Slides\WorkingWithSmartArt\FillFormat;
use Aspose\Slides\WorkingWithTables\AddImage;
use Aspose\Slides\WorkingWithTables\AlignText;
use Aspose\Slides\WorkingWithTables\CloneRowColumn;
use Aspose\Slides\WorkingWithTables\CreateTable;
use Aspose\Slides\WorkingWithTables\RemoveRowColumn;
use Aspose\Slides\WorkingWithText\CreateTextBox;
use Aspose\Slides\WorkingWithText\ManageText;
use Aspose\Slides\WorkingWithText\ReplaceText;;
use Aspose\Slides\WorkingWithText\ShadowEffects;
use Aspose\Slides\WorkingWithText\TextFont;
use Aspose\Slides\WorkingWithText\WordArt;
use Aspose\Slides\WorkingWithVBAMacros\RemoveVBAMacro;


print "Running Aspose\\Slides\\IntroductionToPresentation\\HelloWorld::run()" . PHP_EOL;
HelloWorld::run(__DIR__ . '/data/IntroductionToPresentation/HelloWorld/');

print "Running Aspose\\Slides\\WorkingWithActiveXControls\\AddActiveX::run()" . PHP_EOL;
AddActiveX::run(__DIR__ . '/data/WorkingWithActiveXControls/AddActiveX/');

print "Running Aspose\\Slides\\WorkingWithCharts\\ChartLegend::run()" . PHP_EOL;
ChartLegend::run(__DIR__ . '/data/WorkingWithCharts/ChartLegend/');

print "Running Aspose\\Slides\\WorkingWithCharts\\ChartProperties::run()" . PHP_EOL;
ChartProperties::run(__DIR__ . '/data/WorkingWithCharts/ChartProperties/');

print "Running Aspose\\Slides\\WorkingWithCharts\\ChartSeries::run()" . PHP_EOL;
ChartSeries::run(__DIR__ . '/data/WorkingWithCharts/ChartSeries/');

print "Running Aspose\\Slides\\WorkingWithCharts\\ChartTrendLines::run()" . PHP_EOL;
ChartTrendLines::run(__DIR__ . '/data/WorkingWithCharts/ChartTrendLines/');

print "Running Aspose\\Slides\\WorkingWithCharts\\CreateChart::run()" . PHP_EOL;
CreateChart::run(__DIR__ . '/data/WorkingWithCharts/CreateChart/');

print "Running Aspose\\Slides\\WorkingWithCharts\\ErrorBars::run()" . PHP_EOL;
ErrorBars::run(__DIR__ . '/data/WorkingWithCharts/ErrorBars/');

print "Running Aspose\\Slides\\WorkingWithCharts\\ExistingChart::run()" . PHP_EOL;
ExistingChart::run(__DIR__ . '/data/WorkingWithCharts/ExistingChart/');

print "Running Aspose\\Slides\\WorkingWithCharts\\FormattingChartEntities::run()" . PHP_EOL;
FormattingChartEntities::run(__DIR__ . '/data/WorkingWithCharts/FormattingChartEntities/');

print "Running Aspose\\Slides\\WorkingWithCharts\\SetLabelDistance::run()" . PHP_EOL;
SetLabelDistance::run(__DIR__ . '/data/WorkingWithCharts/SetLabelDistance/');

print "Running Aspose\\Slides\\WorkingWithCharts\\ChartLegend::run()" . PHP_EOL;
SetPieChartColors::run(__DIR__ . '/data/WorkingWithCharts/SetPieChartColors/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\ConvertingToHtml::run()" . PHP_EOL;
ConvertingToHtml::run(__DIR__ . '/data/WorkingWithPresentation/ConvertingToHtml/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\ConvertingToNotes::run()" . PHP_EOL;
ConvertingToNotes::run(__DIR__ . '/data/WorkingWithPresentation/ConvertingToNotes/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\ConvertingToPdf::run()" . PHP_EOL;
ConvertingToPdf::run(__DIR__ . '/data/WorkingWithPresentation/ConvertingToPdf/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\ConvertingToTiff::run()" . PHP_EOL;
ConvertingToTiff::run(__DIR__ . '/data/WorkingWithPresentation/ConvertingToTiff/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\ConvertingToXps::run()" . PHP_EOL;
ConvertingToXps::run(__DIR__ . '/data/WorkingWithPresentation/ConvertingToXps/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\OdpToPptx::run()" . PHP_EOL;
OdpToPptx::run(__DIR__ . '/data/WorkingWithPresentation/OdpToPptx/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\PptToPptx::run()" . PHP_EOL;
PptToPptx::run(__DIR__ . '/data/WorkingWithPresentation/PptToPptx/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\Properties::run()" . PHP_EOL;
Properties::run(__DIR__ . '/data/WorkingWithPresentation/Properties/');

print "Running Aspose\\Slides\\WorkingWithPresentation\\Zoom::run()" . PHP_EOL;
Zoom::run(__DIR__ . '/data/WorkingWithPresentation/Zoom/');

print "Running Aspose\\Slides\\WorkingWithShapes\\AddingLineShape::run()" . PHP_EOL;
AddingLineShape::run(__DIR__ . '/data/WorkingWithShapes/AddingLineShape/');

print "Running Aspose\\Slides\\WorkingWithShapes\\FillingShapes::run()" . PHP_EOL;
FillingShapes::run(__DIR__ . '/data/WorkingWithShapes/FillingShapes/');

print "Running Aspose\\Slides\\WorkingWithShapes\\FindShape::run()" . PHP_EOL;
FindShape::run(__DIR__ . '/data/WorkingWithShapes/FindShape/');

print "Running Aspose\\Slides\\WorkingWithShapes\\FormatLines::run()" . PHP_EOL;
FormatLines::run(__DIR__ . '/data/WorkingWithShapes/FormatLines/');

print "Running Aspose\\Slides\\WorkingWithShapes\\Frame::run()" . PHP_EOL;
Frame::run(__DIR__ . '/data/WorkingWithShapes/Frame/');

print "Running Aspose\\Slides\\WorkingWithShapes\\RotatingShapes::run()" . PHP_EOL;
RotatingShapes::run(__DIR__ . '/data/WorkingWithShapes/RotatingShapes/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\AccessSlides::run()" . PHP_EOL;
AccessSlides::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/AccessSlides/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\AddSlides::run()" . PHP_EOL;
AddSlides::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/AddSlides/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\Background::run()" . PHP_EOL;
Background::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/Background/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\ChangingPosition::run()" . PHP_EOL;
ChangingPosition::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/ChangingPosition/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\CloneSlides::run()" . PHP_EOL;
CloneSlides::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/CloneSlides/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\CreatingSvg::run()" . PHP_EOL;
CreatingSvg::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/CreatingSvg/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\Hyperlinks::run()" . PHP_EOL;
Hyperlinks::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/Hyperlinks/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\RemoveSlides::run()" . PHP_EOL;
RemoveSlides::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/RemoveSlides/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\SizeAndLayout::run()" . PHP_EOL;
SizeAndLayout::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/SizeAndLayout/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\Thumbnail::run()" . PHP_EOL;
Thumbnail::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/Thumbnail/');

print "Running Aspose\\Slides\\WorkingWithSlidesInPresentation\\Transitions::run()" . PHP_EOL;
Transitions::run(__DIR__ . '/data/WorkingWithSlidesInPresentation/Transitions/');

print "Running Aspose\\Slides\\WorkingWithSmartArt\\AddSmartArt::run()" . PHP_EOL;
AddSmartArt::run(__DIR__ . '/data/WorkingWithSmartArt/AddSmartArt/');

print "Running Aspose\\Slides\\WorkingWithSmartArt\\FillFormat::run()" . PHP_EOL;
FillFormat::run(__DIR__ . '/data/WorkingWithSmartArt/FillFormat/');

print "Running Aspose\\Slides\\WorkingWithTables\\AddImage::run()" . PHP_EOL;
AddImage::run(__DIR__ . '/data/WorkingWithTables/AddImage/');

print "Running Aspose\\Slides\\WorkingWithTables\\AlignText::run()" . PHP_EOL;
AlignText::run(__DIR__ . '/data/WorkingWithTables/AlignText/');

print "Running Aspose\\Slides\\WorkingWithTables\\CloneRowColumn::run()" . PHP_EOL;
CloneRowColumn::run(__DIR__ . '/data/WorkingWithTables/CloneRowColumn/');

print "Running Aspose\\Slides\\WorkingWithTables\\CreateTable::run()" . PHP_EOL;
CreateTable::run(__DIR__ . '/data/WorkingWithTables/CreateTable/');

print "Running Aspose\\Slides\\WorkingWithTables\\RemoveRowColumn::run()" . PHP_EOL;
RemoveRowColumn::run(__DIR__ . '/data/WorkingWithTables/RemoveRowColumn/');

print "Running Aspose\\Slides\\WorkingWithText\\CreateTextBox::run()" . PHP_EOL;
CreateTextBox::run(__DIR__ . '/data/WorkingWithText/CreateTextBox/');

print "Running Aspose\\Slides\\WorkingWithText\\ManageText::run()" . PHP_EOL;
ManageText::run(__DIR__ . '/data/WorkingWithText/ManageText/');

print "Running Aspose\\Slides\\WorkingWithText\\ReplaceText::run()" . PHP_EOL;
ReplaceText::run(__DIR__ . '/data/WorkingWithText/ReplaceText/');

print "Running Aspose\\Slides\\WorkingWithText\\ShadowEffects::run()" . PHP_EOL;
ShadowEffects::run(__DIR__ . '/data/WorkingWithText/ShadowEffects/');

print "Running Aspose\\Slides\\WorkingWithText\\TextFont::run()" . PHP_EOL;
TextFont::run(__DIR__ . '/data/WorkingWithText/TextFont/');

print "Running Aspose\\Slides\\WorkingWithText\\WordArt::run()" . PHP_EOL;
WordArt::run(__DIR__ . '/data/WorkingWithText/WordArt/');
