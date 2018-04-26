package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDao {
	
	public static void addCar(Car car) {
		Connection con = null;  
        PreparedStatement pstmt = null;
        
        try {  
            con = DBDao.getConnection();  
              
            String SQL  = "INSERT INTO car(Id, Name, Type, BuyPrice, RentPrice)"
           		 	   + "VALUES(?, ?, ?, ?, ?);";
              
            pstmt = con.prepareStatement(SQL);
              
            pstmt.setString(1, car.getId());  
            pstmt.setString(2, car.getName());  
            pstmt.setString(3, car.getType());
            pstmt.setDouble(4, car.getBuyPrice());  
            pstmt.setDouble(5, car.getRentPrice());
            pstmt.executeUpdate(); 
            
       } catch (SQLException e) {   
           e.printStackTrace();  
       } finally {  
            DBDao.closeConnection(con);
       }
	}
	public static void deleteCar(Car car) {
    	Connection con = null;
		PreparedStatement pstmt = null;
    	
    	try {
    		con = DBDao.getConnection();
    		String SQL = "DELETE FROM car WHERE id = ?";
    		pstmt = con.prepareStatement(SQL);
    		pstmt.executeUpdate();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		DBDao.closeConnection(con);
    	}
    }
	public static void buyCar(Car car) {
		Connection con = null;
		PreparedStatement pstmt = null;
    	
    	try {
			con = DBDao.getConnection();
			String SQL = "INSERT INTO car VALUES id = ?";
			pstmt = con.prepareStatement(SQL);
			pstmt.executeUpdate();
    		
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		DBDao.closeConnection(con);
    	}
	}
	public static void rentCar(Car car) {
		Connection con = null;
		PreparedStatement pstmt = null;
    	
    	try {
			con = DBDao.getConnection();
			String SQL = "INSERT INTO car VALUES id = ?, ?";
			pstmt = con.prepareStatement(SQL);
			pstmt.executeUpdate();

    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		DBDao.closeConnection(con);
    	}
	}
}
