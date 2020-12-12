package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class DbModel {
	private static String url = "jdbc:mysql://localhost/paypalka?serverTimezone=Europe/Moscow&useSSL=false";
	private static String username = "root";
	private static String password = "root";
	
	public static Boolean Register(String userName, String userPassword, String userEmail) throws Exception {
   	 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)){
            	Statement stmt = connection.createStatement(); 
        		ResultSet rs = stmt.executeQuery(String.format("SELECT User_name FROM users WHERE User_name = '%s'", userName));  
        		if (rs.next() == true)
		    		if (!rs.getString(1).isEmpty())
		    			return false;
        		PreparedStatement ps = connection.prepareStatement(String.format("INSERT INTO users (User_name, User_password, User_email) "
        										+ "VALUES('%s', '%s', '%s')", userName, userPassword, userEmail));   
        		int result = ps.executeUpdate();
        		connection.close();
        		if (result > 0)
        			return true;
        		else
        			return false;
            }
        }
        catch(Exception ex){
        	throw ex;
        }
    }
	
    public static boolean Login(String userName, String userPassword) throws Exception {
    	 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)){
        		PreparedStatement ps=connection.prepareStatement(String.format("select * from users where User_name='%s'"
        																	+ " and User_password='%s'", userName, userPassword));  
				ResultSet rs = ps.executeQuery();  
				boolean status = rs.next();
				connection.close();
				return status;
            }
        }
        catch(Exception ex){
        	throw ex;
        }
    }
    
}
