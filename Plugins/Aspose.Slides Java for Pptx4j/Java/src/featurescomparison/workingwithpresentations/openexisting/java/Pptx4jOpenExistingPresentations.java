package featurescomparison.workingwithpresentations.openexisting.java;

import org.docx4j.openpackaging.packages.OpcPackage;
import org.docx4j.openpackaging.packages.PresentationMLPackage;

public class Pptx4jOpenExistingPresentations 
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentations/openexisting/data/";
		
		String inputfilepath = dataPath + "presentation.pptx";
		
		PresentationMLPackage presentationMLPackage = 
			(PresentationMLPackage)OpcPackage.load(new java.io.File(inputfilepath));
				
		System.out.println("\n\n saving .. \n\n");
		presentationMLPackage.save(new java.io.File(dataPath + "Pptx4j-Duplicate.pptx"));

		System.out.println("\n\n done .. \n\n");	
	}
}