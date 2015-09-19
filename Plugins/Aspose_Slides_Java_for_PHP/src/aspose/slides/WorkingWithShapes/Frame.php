<?php

namespace Aspose\Slides\WorkingWithShapes;

use com\aspose\slides\Presentation as Presentation;
use com\aspose\slides\ShapeType as ShapeType;
use com\aspose\slides\SaveFormat as SaveFormat;
use com\aspose\slides\AudioPlayModePreset as AudioPlayModePreset;
use com\aspose\slides\AudioVolumeMode as AudioVolumeMode;
use com\aspose\slides\VideoPlayModePreset as VideoPlayModePreset;

use java\io\FileInputStream as FileInputStream;
use java\io\File as File;

class Frame {

    public static function run($dataDir=null)
    {
        # Adding Picture Frame to Slide
        Frame::add_picture_frame($dataDir);

        # Adding Audio Frame to Slide
        Frame::add_audio_frame($dataDir);

        # Adding Audio Frame to Slide
        Frame::add_video_frame($dataDir);

    }

    public static function add_picture_frame($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sId = $pres->getSlides()->get_Item(0);

        # Instantiate the Image class
        $imgx = $pres->getImages()->addImage(new FileInputStream(new File($dataDir . "aspose-logo.jpg")));

        # Add Picture Frame with height and width equivalent of Picture
        $shapeType = new ShapeType();
        $sId->getShapes()->addPictureFrame($shapeType->Rectangle, 50, 150, $imgx->getWidth(), $imgx->getHeight(), $imgx);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "RectPicFrame.pptx", $save_format->Pptx);

        print "Added picture frame to slide, please check the output file." . PHP_EOL;
    }

    public static function add_audio_frame($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sId = $pres->getSlides()->get_Item(0);

        # Load the wav sound file to stram
        $fstr = new FileInputStream(new File($dataDir . "Bass-Drum.wav"));

        # Add Audio Frame
        $af = $sId->getShapes()->addAudioFrameEmbedded(50, 150, 100, 100, $fstr);

        # Set Play Mode and Volume of the Audio
        $audioPlayModePreset = new AudioPlayModePreset();
        $audioVolumeMode = new AudioVolumeMode();
        $af->setPlayMode($audioPlayModePreset->Auto);
        $af->setVolume($audioVolumeMode->Loud);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "AudioFrameEmbed.pptx", $save_format->Pptx);

        print "Added audio frame to slide, please check the output file." . PHP_EOL;

    }

    public static function add_video_frame($dataDir=null)
    {

        # Create an instance of Presentation class
        $pres = new Presentation();

        # Get the first slide
        $sId = $pres->getSlides()->get_Item(0);

        # Add Video Frame
        $vf = $sId->getShapes()->addVideoFrame(50, 150, 300, 150, $dataDir . "Wildlife.mp4");

        # Set Play Mode and Volume of the Video
        $videoPlayModePreset = new VideoPlayModePreset();
        $audioVolumeMode = new AudioVolumeMode();

        $vf->setPlayMode($videoPlayModePreset->Auto);
        $vf->setVolume($audioVolumeMode->Loud);

        # Write the presentation as a PPTX file
        $save_format = new SaveFormat();
        $pres->save($dataDir . "VideoFrame.pptx", $save_format->Pptx);

        print "Added video frame to slide, please check the output file." . PHP_EOL;

    }

}