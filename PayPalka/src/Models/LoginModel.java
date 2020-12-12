package Models;

import java.math.BigInteger;
import java.security.MessageDigest;

public class LoginModel {
	
	public static Boolean Validate(String login, String password) throws Exception {
		return (DbModel.Login(login, getMd5(password)));
	}
	public static Boolean Register(String login, String password, String email) throws Exception {
		return (DbModel.Register(login, getMd5(password), email));
	}
	public static String getMd5(String input) 
    { 
        try { 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
  
        catch (Exception e) { 
            throw new RuntimeException(e); 
        } 
    } 
}
