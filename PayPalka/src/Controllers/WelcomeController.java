package Controllers;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Welcome")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public WelcomeController() {
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
        		RequestDispatcher dispatcher = request.getRequestDispatcher("Views/welcome.jsp");
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
