package Control;

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

import Model.AdminAccount;

public class ParseAdminAccount {
	
	public static ArrayList<AdminAccount> getParseAdminAccount() {  
		
        ArrayList<AdminAccount> list = new ArrayList<AdminAccount>();  
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        
        try {  
        	
        	builder = factory.newDocumentBuilder();  
        	Document doc;  
        	doc = builder.parse("File//AdminAccount.xml");  
        	NodeList admaccNodes = doc.getElementsByTagName("AdminAccount");  
        	
        	for(int i = 0; i<admaccNodes.getLength(); i++){  
        		
        		Element admaccElement = (Element) admaccNodes.item(i);  
        		AdminAccount admacc = new AdminAccount();  
        		NodeList childNodes = admaccElement.getChildNodes(); 
        		
                    for (int j = 0; j<childNodes.getLength(); j++) {  
                    	if(childNodes.item(j).getNodeType()==Node.ELEMENT_NODE) {  
                    		if("AdminAccountID".equals(childNodes.item(j).getNodeName())) {  
                    			admacc.setAccountid(childNodes.item(j).getFirstChild().getNodeValue());  
                    		} else if("UserID".equals(childNodes.item(j).getNodeName())) {  
                    			admacc.setUserid(childNodes.item(j).getFirstChild().getNodeValue());  
                    		} else if("SetCarPrice".equals(childNodes.item(j).getNodeName())) {
                    			admacc.setSetCarPrice(Integer.parseInt((childNodes.item(j).getFirstChild().getNodeValue())));	
                    		} else if("SetPartPrice".equals(childNodes.item(j).getNodeName())) {
                    			admacc.setSetPartPrice(Integer.parseInt((childNodes.item(j).getFirstChild().getNodeValue())));
                    		}  else if("Balance".equals(childNodes.item(j).getNodeName())) {
                    		 	admacc.setBalance(Double.parseDouble((childNodes.item(j).getFirstChild().getNodeValue())));
                    		}
                    	}  
                    }	  
                    list.add(admacc);  
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
}