package Control;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import Model.Customer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Model.Admin;

public class ParseAdmin {
	
	public static ArrayList<Admin> getParseAdmin() {  
		
		ArrayList<Admin> list= new ArrayList<Admin>();  
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        
        try {  
        	
        	builder = factory.newDocumentBuilder();  
        	Document doc;  
        	doc = builder.parse("File//Admin.xml");  
        	NodeList admNodes = doc.getElementsByTagName("Admin");  
        	
        	for(int i = 0; i<admNodes.getLength(); i++){  
        		
        		Element admElement = (Element) admNodes.item(i);  
        		Admin admin = new Admin();
        		Customer customer = new Customer();
        		NodeList childNodes = admElement.getChildNodes();  
        		
        		for (int j = 0; j < childNodes.getLength(); j++) {  
        			if(childNodes.item(j).getNodeType()==Node.ELEMENT_NODE) {  
        				if("UserID".equals(childNodes.item(j).getNodeName())) {  
                        	customer.setId(childNodes.item(j).getFirstChild().getNodeValue());  
        				} else if("FName".equals(childNodes.item(j).getNodeName())) {  
        					customer.setFname(childNodes.item(j).getFirstChild().getNodeValue());  
           	            } else if("LName".equals(childNodes.item(j).getNodeName())) {
           	            	customer.setLname(childNodes.item(j).getFirstChild().getNodeValue());
           	            } else if("PassWord".equals(childNodes.item(j).getNodeName())) {
           	            	customer.setPassword(childNodes.item(j).getFirstChild().getNodeValue());	
           	            } else if("isAdmin".equals(childNodes.item(j).getNodeName())) {
           	            	customer.setIsadmin(childNodes.item(j).getFirstChild().getNodeValue());
           	            } else if("Email".equals(childNodes.item(j).getNodeName())) {
                        	customer.setEmail(childNodes.item(j).getFirstChild().getNodeValue());
           	            } else if("Balance".equals(childNodes.item(j).getNodeName())) {
                        	customer.setBalance(Double.parseDouble(childNodes.item(j).getFirstChild().getNodeValue()));
           	            } else if("StreetAddress".equals(childNodes.item(j).getNodeName())) {
                        	customer.setStreetaddress(childNodes.item(j).getFirstChild().getNodeValue());
           	            } else if("City".equals(childNodes.item(j).getNodeName())) {
           	            	customer.setCity(childNodes.item(j).getFirstChild().getNodeValue());
           	            } else if("State".equals(childNodes.item(j).getNodeName())) {
           	            	customer.setState(childNodes.item(j).getFirstChild().getNodeValue());
           	            } else if("Sex".equals(childNodes.item(j).getNodeName())) {
           	            	customer.setSex(childNodes.item(j).getFirstChild().getNodeValue());
           	            } else if("Zip".equals(childNodes.item(j).getNodeName())) {
           	            	customer.setZip(childNodes.item(j).getFirstChild().getNodeValue());
           	            }
        			}  
        		} 
        		list.add(admin);  
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