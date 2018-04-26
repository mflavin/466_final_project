package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDao {
	 
    static Connection con = null;
    
		public static Connection getConnection(){
	    	
	        try {
	        	
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/CarService" + "&user=root&password=Tongky100%");
	            
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        }
	        return con;
	    }
		
	    public static void closeConnection(Connection con){

	    	if(con != null){
	    		try {
	    			con.close(); 
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	    	}
	    }
}



