package Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.DbModel;

@WebServlet("/Remove")
public class RemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RemoveController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
         
        try {
            if(name != null) {
            	RequestDispatcher dispatcher = request.getRequestDispatcher("Views/remove.jsp");
        		dispatcher.forward(request, response);
            } 
            else {
            	RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome");
        		dispatcher.forward(request, response);
            }
        }
        catch (Exception e) {
        	
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");     
	    String cardNumber = request.getParameter("card_num");  
	    HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");

   
	    try {
			if(DbModel.Remove(cardNumber, name)){  
				    RequestDispatcher rd=request.getRequestDispatcher("Cards");  
				    rd.forward(request,response);  
			}  
			else{  
				request.setAttribute("data", "Нет такой карты");
			    RequestDispatcher rd=request.getRequestDispatcher("Views/remove.jsp");  
			    rd.forward(request,response);   
			}
		} catch (Exception e) {
			System.out.print(e);
			request.setAttribute("data", "Ошибка соединения с БД");
		    RequestDispatcher rd=request.getRequestDispatcher("Views/remove.jsp");  
		    rd.forward(request,response);  
		} 
	}

}
