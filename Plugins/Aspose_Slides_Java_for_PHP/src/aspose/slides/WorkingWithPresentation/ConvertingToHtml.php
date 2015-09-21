<?php

namespace Aspose\Slides\WorkingWithPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\HtmlOptions as HtmlOptions;
use com\aspose\slides\HtmlFormatter as HtmlFormatter;


class ConvertingToHtml {

    public static function run($dataDir=null)
    {

        # Converting Presentation to HTML format
        ConvertingToHtml::convert_to_html($dataDir);
    }

    public static function convert_to_html($dataDir=null)
    {

        # Instantiate a Presentation object that represents a PPTX file
        $pres = new Presentation($dataDir . "Aspose.pptx");
        $html_opt = new HtmlOptions();
        $html_formatter = new HtmlFormatter();
        $html_opt->setHtmlFormatter($html_formatter->createDocumentFormatter("",false));

        # Saving the presentation to HTML format
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Aspose.html", $save_format->Html, $html_opt);

        print "Document has been converted, please check the output file.";

    }

}