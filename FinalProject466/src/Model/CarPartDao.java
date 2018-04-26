package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarPartDao {
	
	public static void addCarPart(CarPart carpart) {
		
		Connection con = null;  
        PreparedStatement pstmt = null; 
        
        try {  
            con = DBDao.getConnection();  
              
            String SQL  = "INSERT INTO carpart(Id, Name, Type, BuyPrice)"
           		 	   + "VALUES(?, ?, ?, ?);";  
              
            pstmt = con.prepareStatement(SQL);
              
            pstmt.setString(1, carpart.getId());  
            pstmt.setString(2, carpart.getName());  
            pstmt.setString(3, carpart.getType());
            pstmt.setDouble(4, carpart.getBuyPrice());  
            pstmt.executeUpdate(); 
            
       } catch (SQLException e) {   
           e.printStackTrace();  
       } finally {  
            DBDao.closeConnection(con);
       }
	}
	public static void deleteCarPart(CarPart carpart) {
    	Connection con = null;
		PreparedStatement pstmt = null;
    	
    	try {
    		con = DBDao.getConnection();
    		String SQL = "DELETE FROM carpart WHERE id = ?";
    		pstmt = con.prepareStatement(SQL);
    		pstmt.executeUpdate();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		DBDao.closeConnection(con);
    	}
    }
	public static void buyCarPart(CarPart carpart) {
		Connection con = null;
		PreparedStatement pstmt = null;
    	
    	try {
			con = DBDao.getConnection();
			String SQL = "DELETE FROM carpart WHERE id = ?, ?";
			pstmt = con.prepareStatement(SQL);
			pstmt.executeUpdate();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		DBDao.closeConnection(con);
    	}
	}
}