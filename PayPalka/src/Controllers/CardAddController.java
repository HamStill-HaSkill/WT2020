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
import Models.LoginModel;


@WebServlet("/CardAdd")
public class CardAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CardAddController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
         
        try {
            if(name != null) {
        		RequestDispatcher dispatcher = request.getRequestDispatcher("Views/addCard.jsp");
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
		String number = request.getParameter("number");  
	    String cardNumber = request.getParameter("card_number");  
	    String date = request.getParameter("date");  
	    HttpSession session = request.getSession();
        String name = (String)session.getAttribute("name"); 
	    int max = 100000;
	    int money = (int) (Math.random() * ++max);
   
	    try {
			if(DbModel.AddCard(cardNumber, number, date, name, money)){  
				    RequestDispatcher rd=request.getRequestDispatcher("Cards");  
				    rd.forward(request,response);  
			}  
			else{  
				request.setAttribute("data", "Эта карта уже добавлена");
			    RequestDispatcher rd=request.getRequestDispatcher("Views/addCard.jsp");  
			    rd.forward(request,response);   
			}
		} catch (Exception e) {
			System.out.print(e);
			request.setAttribute("data", "Ошибка соединения с БД");
		    RequestDispatcher rd=request.getRequestDispatcher("Views/addCard.jsp");  
		    rd.forward(request,response);  
		}  
	}

}
