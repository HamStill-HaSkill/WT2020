package Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Exit")
public class ExitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExitController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
	        String name = (String) session.getAttribute("name");
	         
	        try {
	            if(name != null) {
	            	session.removeAttribute("name");
	        		RequestDispatcher dispatcher = request.getRequestDispatcher("Welcome");
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
		doGet(request, response);
	}

}
