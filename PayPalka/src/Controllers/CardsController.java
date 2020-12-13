package Controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.CardModel;
import Models.DbModel;


@WebServlet("/Cards")
public class CardsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CardsController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	HttpSession session = request.getSession();
	        String name = (String) session.getAttribute("name");
	         
	        try {
	            if(name != null) {
	            	ArrayList<CardModel> cards = DbModel.GetCards(name);
	            	request.setAttribute("cards", cards);
	        		RequestDispatcher dispatcher = request.getRequestDispatcher("Views/cards.jsp");
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
