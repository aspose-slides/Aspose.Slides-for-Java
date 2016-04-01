package featurescomparison.workingwithslides.addhyperlink.java;

import java.util.ArrayList;
import java.util.List;

import org.docx4j.XmlUtils;
import org.docx4j.openpackaging.packages.PresentationMLPackage;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.PresentationML.MainPresentationPart;
import org.docx4j.openpackaging.parts.PresentationML.SlideLayoutPart;
import org.docx4j.openpackaging.parts.PresentationML.SlidePart;
import org.docx4j.openpackaging.parts.relationships.Namespaces;
import org.pptx4j.jaxb.Context;
import org.pptx4j.pml.CTGraphicalObjectFrame;
import org.pptx4j.pml.Shape;


public class Pptx4jCreateHyperlink {
	/**
	 * @param args
	 * @throws Exception 
	 */
	static int rows = 1;
	static int columns = 2;
	static List<String> colColors = getCellColors();
	static List<String> colValues = getCellValues();
	
	public static void main(String[] args) throws Exception {
		startPptx();

	}
	private static void startPptx() throws Exception {
	
		// generate Ppt file
		String dataPath = "src/featurescomparison/workingwithslides/addhyperlink/data/";
		PresentationMLPackage presentationMLPackage = PresentationMLPackage.createPackage(); 
		MainPresentationPart pp = (MainPresentationPart)presentationMLPackage.getParts().getParts().get(
				new PartName("/ppt/presentation.xml"));		
		SlideLayoutPart layoutPart = (SlideLayoutPart)presentationMLPackage.getParts().getParts().get(
				new PartName("/ppt/slideLayouts/slideLayout1.xml"));
		
		// OK, now we can create a slide
				SlidePart slidePart = null;
				slidePart = presentationMLPackage.createSlidePart(pp, layoutPart,	new PartName("/ppt/slides/slide1.xml"));
		        
		        org.docx4j.relationships.ObjectFactory factory = new org.docx4j.relationships.ObjectFactory();
		        
		        //first Link relation
                org.docx4j.relationships.Relationship rel1 = factory.createRelationship();
                rel1.setType(Namespaces.PRESENTATIONML_SLIDE);
                rel1.setTarget("/ppt/slides/slide"+5+".xml");
                slidePart.getRelationshipsPart().addRelationship(rel1);
                
                String linkedTable = table1.replaceFirst("replaceID", rel1.getId());
                
               //second link relation
                org.docx4j.relationships.Relationship rel2 = factory.createRelationship();
                rel2.setType(Namespaces.PRESENTATIONML_SLIDE);
                rel2.setTarget("/ppt/slides/slide"+10+".xml");
                slidePart.getRelationshipsPart().addRelationship(rel2);
                
                linkedTable = linkedTable.replaceFirst("replaceID", rel2.getId());
                
                
                CTGraphicalObjectFrame graphicFrame2=(CTGraphicalObjectFrame) XmlUtils.unmarshalString(linkedTable, Context.jcPML,CTGraphicalObjectFrame.class);
		        slidePart.getJaxbElement().getCSld().getSpTree().getSpOrGrpSpOrGraphicFrame().add(graphicFrame2);
		        
		        for (int i=2;i<15;i++)
				{
		        	slidePart = presentationMLPackage.createSlidePart(pp, layoutPart,	new PartName("/ppt/slides/slide"+i+".xml"));
		        	 Shape sample = ((Shape)XmlUtils.unmarshalString(getTextData(i), Context.jcPML) );
				     slidePart.getJaxbElement().getCSld().getSpTree().getSpOrGrpSpOrGraphicFrame().add(sample);
				}
				presentationMLPackage.save(new java.io.File(dataPath + "PPTx4j-Hyperlink.pptx"));
			System.out.println("Done");


 }
	
	private static String getTextData(int i) {
		return "<p:sp xmlns:a=\"http://schemas.openxmlformats.org/drawingml/2006/main\" " +
	    		"xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\" " +
	    		"xmlns:p=\"http://schemas.openxmlformats.org/presentationml/2006/main\">"
	    					+ "<p:nvSpPr>"
	    					+ "<p:cNvPr id=\"5\" name=\"Rectangle 4\" />"
	    					+ "<p:cNvSpPr />"
	    					+ "<p:nvPr />"
	    				+ "</p:nvSpPr>"
	    				+ "<p:spPr>"
	    					+ "<a:xfrm>"
	    						+ "<a:off x=\"3865418\" y=\"602876\" />"
	    						+ "<a:ext cx=\"5286000\" cy=\"477054\" />"
	    					+ "</a:xfrm>"
	    					+ "<a:prstGeom prst=\"rect\">"
	    						+ "<a:avLst />"
	    					+ "</a:prstGeom>"
	    				+ "</p:spPr>"
	    				+ "<p:txBody>"
	    					+ "<a:bodyPr>"
	    						+ "<a:spAutoFit />"
	    					+ "</a:bodyPr>"
	    					+ "<a:lstStyle />"
	    					+ "<a:p>"
	    						+ "<a:pPr lvl=\"0\" />"
	    						+ "<a:r>"
	    							+ "<a:rPr smtClean=\"false\" err=\"true\" dirty=\"false\" noProof=\"false\" baseline=\"0\" normalizeH=\"false\" spc=\"0\" cap=\"none\" kern=\"0\" strike=\"noStrike\" u=\"sng\" i=\"false\" b=\"false\" sz=\"2000\" lang=\"en-US\" kumimoji=\"false\">"
	    								+ "<a:ln>"
	    									+ "<a:noFill />"
	    								+ "</a:ln>"
	    								+ "<a:solidFill>"
	    									+ "<a:srgbClr val=\"0070C0\" />"
	    								+ "</a:solidFill>"
	    								+ "<a:effectLst />"
	    								+ "<a:uLnTx />"
	    								+ "<a:uFillTx />"
	    							+ "</a:rPr>"
	    							+ "<a:t>"+ "Slide : "+ i +"</a:t>"
	    						+ "</a:r>"
	    						+ "<a:endParaRPr dirty=\"false\" noProof=\"false\" baseline=\"0\" normalizeH=\"false\" spc=\"0\" cap=\"none\" kern=\"0\" strike=\"noStrike\" u=\"sng\" i=\"false\" b=\"false\" sz=\"2000\" lang=\"en-US\" kumimoji=\"false\">"
	    							+ "<a:ln>"
	    								+ "<a:noFill />"
	    							+ "</a:ln>"
	    							+ "<a:solidFill>"
	    								+ "<a:srgbClr val=\"0070C0\" />"
	    							+ "</a:solidFill>"
	    							+ "<a:effectLst />"
	    							+ "<a:uLnTx />"
	    							+ "<a:uFillTx />"
	    						+ "</a:endParaRPr>"
	    					+ "</a:p>"
	    				+ "</p:txBody>"
	    			+ "</p:sp>";
		
	}
	private static List<String> getCellValues() {
		List<String> list = new ArrayList<String>();
		list.add("Link to slide 5");
		list.add("Link to slide 10");
		return list;
	}
	private static List<String> getCellColors() {
		List<String> list = new ArrayList<String>();
		list.add("ddddff");
		list.add("ffdddd");
		return list;
	}
	private static String table1 = "<p:graphicFrame xmlns:c=\"http://schemas.openxmlformats.org/drawingml/2006/chart\" " +
			"xmlns:r=\"http://schemas.openxmlformats.org/officeDocument/2006/relationships\" " +
			"xmlns:p=\"http://schemas.openxmlformats.org/presentationml/2006/main\" " +
			"xmlns:a=\"http://schemas.openxmlformats.org/drawingml/2006/main\" " +
			"xmlns:ns9=\"http://schemas.openxmlformats.org/drawingml/2006/spreadsheetDrawing\" " +
			"xmlns:wp=\"http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing\" " +
			"xmlns:pic=\"http://schemas.openxmlformats.org/drawingml/2006/picture\" " +
			"xmlns:ns5=\"http://schemas.openxmlformats.org/drawingml/2006/chartDrawing\" " +
			"xmlns:ns10=\"http://schemas.openxmlformats.org/drawingml/2006/compatibility\" " +
			"xmlns:ns11=\"http://schemas.openxmlformats.org/drawingml/2006/lockedCanvas\" " +
			"xmlns:dgm=\"http://schemas.openxmlformats.org/drawingml/2006/diagram\">"
		    + "<p:nvGraphicFramePr>"
	        + "<p:cNvPr name=\"Table 5\" id=\"6\"/>"
	        + "<p:cNvGraphicFramePr>"
	            + "<a:graphicFrameLocks noGrp=\"true\"/>"
	        + "</p:cNvGraphicFramePr>"
	        + "<p:nvPr/>"
	    + "</p:nvGraphicFramePr>"
	    + "<p:xfrm>"
	        + "<a:off y=\"2287800\" x=\"1524000\"/>"
	        + "<a:ext cy=\"228600\" cx=\"3352800\"/>"
	    + "</p:xfrm>"
	    + "<a:graphic>"
	        + "<a:graphicData uri=\"http://schemas.openxmlformats.org/drawingml/2006/table\">"
	            + "<a:tbl>"
	                + "<a:tblPr/>"
	                + "<a:tblGrid>"
	                + getColumnWidths()
	                + "</a:tblGrid>"
	              +  getColumnData()
	            + "</a:tbl>"
	        + "</a:graphicData>"
	    + "</a:graphic>"
	+ "</p:graphicFrame>";
	
	private static String getColumnWidths() {
		StringBuffer str = new StringBuffer("");
		for(int i = 0;i<columns;i++){
			str.append("<a:gridCol w=\"1000000\"/>");
		}
		
		return str.toString();
	}
	private static String getColumnData() {
		int counter = -1;
		StringBuffer str = new StringBuffer("");
		for(int r = 0;r<rows;r++){
			str.append("<a:tr h=\"228600\">");
			
			for(int c = 0;c<columns;c++){
				counter++;
				str.append("<a:tc>"
					    + "<a:txBody>"
				        + "<a:bodyPr/>"
				        + "<a:lstStyle/>"
				        + "<a:p>"
				            + "<a:pPr hangingPunct=\"true\" latinLnBrk=\"false\" fontAlgn=\"auto\" eaLnBrk=\"true\" rtl=\"false\" defTabSz=\"914400\" algn=\"l\" indent=\"0\" marR=\"0\" marL=\"0\">"
				                + "<a:lnSpc>"
				                    + "<a:spcPct val=\"115000\"/>"
				                + "</a:lnSpc>"
				                + "<a:spcBef>"
				                    + "<a:spcPts val=\"0\"/>"
				                + "</a:spcBef>"
				                + "<a:spcAft>"
				                    + "<a:spcPts val=\"0\"/>"
				                + "</a:spcAft>"
				                + "<a:buClrTx/>"
				                + "<a:buSzTx/>"
				                + "<a:buFontTx/>"
				                + "<a:buNone/>"
				                + "<a:tabLst/>"
				                + "<a:defRPr/>"
				            + "</a:pPr>"
				            + "<a:r>"
				                + "<a:rPr smtClean=\"false\" dirty=\"false\" sz=\"1100\" lang=\"en-US\">"
				                    + "<a:latin typeface=\"+mn-lt\"/>"
				                    + "<a:ea typeface=\"Calibri\"/>"
				                    + "<a:cs typeface=\"Times New Roman\"/>"
				                    + "<a:hlinkClick r:id=\"replaceID\" action=\"ppaction://hlinksldjump\"/>"
				                + "</a:rPr>"
				                + "<a:t>"+ colValues.get(counter) +"</a:t>"
				            + "</a:r>"
				            + "<a:endParaRPr dirty=\"false\" sz=\"1100\" lang=\"en-US\">"
				                + "<a:latin typeface=\"Calibri\"/>"
				                + "<a:ea typeface=\"Calibri\"/>"
				                + "<a:cs typeface=\"Times New Roman\"/>"
				            + "</a:endParaRPr>"
				        + "</a:p>"
				    + "</a:txBody>"
				    + "<a:tcPr marB=\"0\" marT=\"0\" marR=\"68580\" marL=\"68580\">"
				        + "<a:lnL algn=\"ctr\" cmpd=\"sng\" cap=\"flat\" w=\"12700\">"
				            + "<a:solidFill>"
				                + "<a:srgbClr val=\"BFBFBF\"/>"
				            + "</a:solidFill>"
				            + "<a:prstDash val=\"solid\"/>"
				            + "<a:round/>"
				            + "<a:headEnd len=\"med\" w=\"med\" type=\"none\"/>"
				            + "<a:tailEnd len=\"med\" w=\"med\" type=\"none\"/>"
				        + "</a:lnL>"
				        + "<a:lnR algn=\"ctr\" cmpd=\"sng\" cap=\"flat\" w=\"12700\">"
				            + "<a:solidFill>"
				                + "<a:srgbClr val=\"BFBFBF\"/>"
				            + "</a:solidFill>"
				            + "<a:prstDash val=\"solid\"/>"
				            + "<a:round/>"
				            + "<a:headEnd len=\"med\" w=\"med\" type=\"none\"/>"
				            + "<a:tailEnd len=\"med\" w=\"med\" type=\"none\"/>"
				        + "</a:lnR>"
				        + "<a:lnT algn=\"ctr\" cmpd=\"sng\" cap=\"flat\" w=\"12700\">"
				            + "<a:solidFill>"
				                + "<a:srgbClr val=\"BFBFBF\"/>"
				            + "</a:solidFill>"
				            + "<a:prstDash val=\"solid\"/>"
				            + "<a:round/>"
				            + "<a:headEnd len=\"med\" w=\"med\" type=\"none\"/>"
				            + "<a:tailEnd len=\"med\" w=\"med\" type=\"none\"/>"
				        + "</a:lnT>"
				        + "<a:lnB algn=\"ctr\" cmpd=\"sng\" cap=\"flat\" w=\"12700\">"
				            + "<a:solidFill>"
				                + "<a:srgbClr val=\"BFBFBF\"/>"
				            + "</a:solidFill>"
				            + "<a:prstDash val=\"solid\"/>"
				            + "<a:round/>"
				            + "<a:headEnd len=\"med\" w=\"med\" type=\"none\"/>"
				            + "<a:tailEnd len=\"med\" w=\"med\" type=\"none\"/>"
				        + "</a:lnB>"
				        + "<a:solidFill>"
				            + "<a:srgbClr val=\""+ colColors.get(counter) +"\"/>"
				        + "</a:solidFill>"
				    + "</a:tcPr>"
				+ "</a:tc>");
				
			}
			str.append("</a:tr>");
		}
		
		return str.toString();
	}
}
