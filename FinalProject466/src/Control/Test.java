package Control;

import java.util.ArrayList;

import Model.Car;
//import Model.Parts;
import Model.Admin;
import Model.AdminAccount;
import Model.Customer;
import Model.CustomerAccount;
import Model.User;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<User> user = new ArrayList<User>(); 
		ArrayList<Admin> admin = new ArrayList<Admin>();
		ArrayList<Customer> customer = new ArrayList<Customer>();
		ArrayList<Car> car = new ArrayList<Car>();
		//ArrayList<Parts> part = new ArrayList<Parts>();
		ArrayList<CustomerAccount> cusa = new ArrayList<CustomerAccount>();
		ArrayList<AdminAccount> admacc = new ArrayList<AdminAccount>();
		user = ParseUser.getParseUser(); 
		admin = ParseAdmin.getParseAdmin();
		customer = ParseCustomer.getParseCustomer();
		car = ParseCar.getParseCar();
		//part = ParseParts.getParseParts();
		cusa = ParseCustomerAccount.getParseCustomerAccount();
		admacc = ParseAdminAccount.getParseAdminAccount();
		
		for(int i=0; i<user.size(); i++)  
		{             
			if (user.get(i) != null) {  
				Connector.writeToMysql(user.get(i));  
			} 
		}
		for(int i=0; i<admin.size(); i++) {
			if(admin.get(i) != null) {
				Connector.writeToMysql(admin.get(i));
			}
		}
		for(int i=0; i<customer.size(); i++) {
			if(customer.get(i) != null) {
				Connector.writeToMysql(customer.get(i));
			}
		}
		for(int i=0; i<car.size(); i++) {
			if(car.get(i) != null) {
				Connector.writeToMysql(car.get(i));
			}	       
		}
		/*for(int i=0; i<part.size(); i++) {
			if(part.get(i) != null) {
				Connector.writeToMysql(part.get(i));
			}	       
		}*/
		for(int i=0; i<cusa.size(); i++) {
			if(cusa.get(i) != null) {
				Connector.writeToMysql(cusa.get(i));
			}		
		}	
		for(int i=0; i<admacc.size(); i++) {
			if(admacc.get(i) != null) {
				//Connector.writeToMysql(admacc.get(i));
			}		
		}	
	}
}
