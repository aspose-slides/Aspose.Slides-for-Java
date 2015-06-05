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
 * @author  Shoaib Khan <shoaib.khan@aspose.com>
 * @link    https://github.com/asposemarketplace/Aspose_for_Apache_POI
 */

package asposefeatures.workingwithmediacontrols.addingmediaplayer.java;

import com.aspose.slides.ControlType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeAddMediaPlayer
{
    public static void main(String[] args)
    {
	String dataPath = "src/asposefeatures/workingwithmediacontrols/addingmediaplayer/data/";
	
	// =================================================
	// Create empty presentation instance
	Presentation newPptx = new Presentation();

	// Adding the Media Player ActiveX control
	newPptx.getSlides().get_Item(0).getControls()
		.addControl(ControlType.WindowsMediaPlayer, 50, 50, 550, 300);

	// Access the Media Player ActiveX control and set the video path
	newPptx.getSlides().get_Item(0).getControls().get_Item(0).getProperties()
		.set_Item("URL", "Wildlife.wmv");

	// Save the Presentation
	newPptx.save(dataPath + "AsposeMediaPlayer.pptx", SaveFormat.Pptx);

	System.out.println("Media Player Added.");
    }
}