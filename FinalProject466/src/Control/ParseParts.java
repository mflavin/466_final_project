/*package Control;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Model.Parts;

public class ParseParts {
	
	public static ArrayList<Parts> getParseParts() {  
		
		ArrayList<Parts> list= new ArrayList<Parts>();  
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        
        try {  
        	
        	builder = factory.newDocumentBuilder();  
        	Document doc;  
        	doc = builder.parse("File//Parts.xml");  
        	NodeList carNodes = doc.getElementsByTagName("Parts"); 

        	for(int i = 0; i<partNodes.getLength();i++){  
        		
        		Element partElement = (Element) partNodes.item(i);  
        		Parts part = new Parts();
        		NodeList childNodes = partElement.getChildNodes();  
        		
        		for (int j = 0; j<childNodes.getLength(); j++) {  
        			if(childNodes.item(j).getNodeType()==Node.ELEMENT_NODE){  
        				if("PartID".equals(childNodes.item(j).getNodeName())){  
                    		part.setId((childNodes.item(j).getFirstChild().getNodeValue()));  
                    	} else if("PartName".equals(childNodes.item(j).getNodeName())){  
                    		part.setName((childNodes.item(j).getFirstChild().getNodeValue()));  
                        } else if("PartType".equals(childNodes.item(j).getNodeName())) {
                        	part.setType((childNodes.item(j).getFirstChild().getNodeValue()));	
                        } else if("BuyPrice".equals(childNodes.item(j).getNodeName())) {
                        	part.setBuyPrice(Double.parseDouble((childNodes.item(j).getFirstChild().getNodeValue())));
                        }
        			}  
                }  
        		list.add(part);  
        	}  
        } catch (SAXException e) {  
        	e.printStackTrace();  
        } catch (IOException e) {  
        	e.printStackTrace();          
        } catch (ParserConfigurationException e) {  
        	e.printStackTrace();  
        }  
        return list;            
    }  
}*/