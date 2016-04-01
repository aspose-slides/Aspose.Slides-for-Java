/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 *
 * LICENSE: This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://opensource.org/licenses/gpl-3.0.html>;.
 *
 * @author  Shoaib Khan
 * 
 * @link	https://asposejavadocx4j.codeplex.com/
 * @link	https://sourceforge.net/projects/asposejavafordocx4j/
 * @link	https://github.com/asposemarketplace/Aspose_Java_for_Docx4j
 * @link    https://bitbucket.org/asposemarketplace/aspose-java-for-docx4j/
 */

package asposefeatures.workingwithmediacontrols.addaudioframe.java;

import java.io.File;
import java.io.FileInputStream;

import com.aspose.slides.AudioPlayModePreset;
import com.aspose.slides.AudioVolumeMode;
import com.aspose.slides.IAudioFrame;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeAudioFrame
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/asposefeatures/workingwithmediacontrols/addaudioframe/data/";
		
		//Instantiate Prsentation class that represents the PPTX
		Presentation pres = new Presentation();
		
		//Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);
		
		//Load the wav sound file to stram
		FileInputStream fstr = new FileInputStream(new File(dataPath + "logon.wav"));
		
		//Add Audio Frame
		IAudioFrame af = sld.getShapes().addAudioFrameEmbedded(50, 150, 100, 100, fstr);
		
		//Set Play Mode and Volume of the Audio
		af.setPlayMode(AudioPlayModePreset.Auto);
		af.setVolume(AudioVolumeMode.Loud);
		
		//Write the PPTX file to disk
		pres.save(dataPath + "AsposeAudio_Out.pptx", SaveFormat.Pptx);
		
		System.out.println("Audio Control Added.");
	}
}