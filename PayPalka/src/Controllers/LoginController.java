package Controllers;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.LoginModel;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
         
        try {
            if(name != null) {
        		RequestDispatcher dispatcher = request.getRequestDispatcher("Cards");
        		dispatcher.forward(request, response);
            } 
            else {
        		RequestDispatcher dispatcher = request.getRequestDispatcher("Views/login.jsp");
        		dispatcher.forward(request, response);
            }
        }
        catch (Exception e) {
        	
        }
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	  
    	response.setContentType("text/html");     
		String login = request.getParameter("login");  
	    String password = request.getParameter("password");  
	          
	    try {
			if(LoginModel.Validate(login, password)){  
		        HttpSession session = request.getSession();
		         
		        try {
	                session.setAttribute("name", login);
		        } 
		        finally {
				    RequestDispatcher rd=request.getRequestDispatcher("Welcome");  
				    rd.forward(request,response);  
		        }
			}  
			else{  
				request.setAttribute("data", "Неверный Логин или Пароль");
			    RequestDispatcher rd=request.getRequestDispatcher("Views/login.jsp");  
			    rd.forward(request,response);   
			}
		} catch (Exception e) {
			System.out.print(e);
			request.setAttribute("data", "Ошибка соединения с БД");
		    RequestDispatcher rd=request.getRequestDispatcher("Views/login.jsp");  
		    rd.forward(request,response);  
		}  


    }  

}
