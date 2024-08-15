package Assignment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StoreCookies")
public class StoreCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userInput=request.getParameter("userInput");
		
		Cookie userCookie=new Cookie("userInput", userInput);
		userCookie.setMaxAge(60*60*24*7);
		response.addCookie(userCookie);
		
		response.sendRedirect("Thanks.html");
	}

}
