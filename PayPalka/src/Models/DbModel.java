package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



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
	public static Boolean AddCard(String cardNumber, String cashAccount, String cardDate, String cardUser, int money ) throws Exception {
	   	 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)){
            	Statement stmt = connection.createStatement(); 
        		ResultSet rs = stmt.executeQuery(String.format("SELECT Card_number FROM cards WHERE Card_number = '%s' and Card_user_name = '%s'", cardNumber, cardUser));  
        		if (rs.next() == true)
		    		if (!rs.getString(1).isEmpty())
		    			return false;
        		PreparedStatement ps = connection.prepareStatement(String.format("INSERT INTO cards (Cash_account, Card_number, Card_date, Card_user_name, Card_money) "
        										+ "VALUES('%s', '%s', '%s', '%s', %d)", cashAccount, cardNumber, cardDate, cardUser, money));   
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
    public static ArrayList<CardModel> GetCards(String userName) throws Exception {
   	 
    	ArrayList<CardModel> cards = new ArrayList<CardModel>(); 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)){
        		PreparedStatement ps=connection.prepareStatement(String.format("select * from cards where Card_user_name='%s'", userName));  
				ResultSet rs = ps.executeQuery();  
				while(rs.next()) {
					CardModel card = new CardModel();
					card.CardDate = rs.getString(4);
					card.CardUser = rs.getString(5);
					card.CardNum = rs.getString(3);
					card.money = rs.getInt(6);
					cards.add(card);
				}
				connection.close();
				return cards;
            }
        }
        catch(Exception ex){
        	throw ex;
        }
    }
	public static Boolean AddMoney(String cardNumber, int money, String name ) throws Exception {
	   	 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)){
            	Statement stmt = connection.createStatement(); 
        		ResultSet rs = stmt.executeQuery(String.format("SELECT Card_money FROM cards WHERE Card_number = '%s'and Card_user_name = '%s'", cardNumber, name));  
        		int currentMoney = 0;
        		if (rs.next() == true)
		    		currentMoney = (int)rs.getInt(1);
        		currentMoney += money;
        		PreparedStatement ps = connection.prepareStatement(String.format("UPDATE cards SET Card_money = %d WHERE Card_number = '%s' and Card_user_name = '%s'", currentMoney, cardNumber, name));   
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
    public static boolean Remove(String cardNumber, String name ) throws Exception {
   	 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)){
            	Statement stmt = connection.createStatement();
            	      
            	stmt.executeUpdate(String.format("DELETE FROM cards WHERE Card_number = '%s' and Card_user_name = '%s'", cardNumber, name));
				connection.close();
				return true;
            }
        }
        catch(Exception ex){
        	throw ex;
        }
    }
}
