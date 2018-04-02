package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class CheckPresentationModified {

	public static void main(String[] args) {

	//ExStart:CheckPresentationModified
	// The path to the documents directory.
          String dataDir = Utils.getDataDir(CheckPresentationModified.class);
          IPresentationInfo info=PresentationFactory.getInstance().getPresentationInfo( dataDir+"props.pptx");
          IDocumentProperties props = info.readDocumentProperties();
            String app = props.getNameOfApplication();
            String ver = props.getAppVersion();

          //ExEnd:CheckPresentationModified
        }     }