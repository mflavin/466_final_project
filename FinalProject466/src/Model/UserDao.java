package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public static void addUser(User user) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
             con = DBDao.getConnection();

             String SQL  = "INSERT INTO user(UserId, FName, LName, PassWord, Email, State, StreetAddress, City, Zip, Sex, Role)"
            		 	   + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

             pstmt = con.prepareStatement(SQL);

             pstmt.setString(1, user.getId());
             pstmt.setString(2, user.getFname());
             pstmt.setString(3, user.getLname());
             pstmt.setString(4, user.getPassword());
             pstmt.setString(5, user.getEmail());
             pstmt.setString(6, user.getState());
             pstmt.setString(7, user.getStreetaddress());
             pstmt.setString(8, user.getCity());
             pstmt.setString(9, user.getZip());
             pstmt.setString(10, user.getSex());
             pstmt.setString(11, "customer");
             pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
             DBDao.closeConnection(con);
        }
    }
    public static void deleteUser(User user) {
    	Connection con = null;
        PreparedStatement pstmt = null;

    	try {
    		con = DBDao.getConnection();
    		String SQL = "DELETE FROM user WHERE email = ?";
    		pstmt = con.prepareStatement(SQL);
    		pstmt.executeUpdate();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	} finally {
    		DBDao.closeConnection(con);
    	}
    }
}