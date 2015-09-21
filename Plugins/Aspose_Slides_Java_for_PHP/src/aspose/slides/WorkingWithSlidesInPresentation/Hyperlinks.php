<?php

namespace Aspose\Slides\WorkingWithSlidesInPresentation;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\SaveFormat as SaveFormat;


class Hyperlinks {

    public static function run($dataDir=null)
    {

        # Instantiate Presentation class that represents the presentation file
        $pres = new Presentation($dataDir . 'demo.pptx');

        # Removing the hyperlinks from presentation
        $pres->getHyperlinkQueries()->removeAllHyperlinks();

        # Saving the presentation
        $save_format = new SaveFormat();
        $pres->save($dataDir . "Hyperlinks.pptx", $save_format->Pptx);

        print "Removed hyperlinks successfully, please check the output file." . PHP_EOL;
    }

}