package com.if30v.MailMessanger.servlets;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;
import com.if30v.MailMessanger.service.AuthenticationService;


/**
 * Servlet implementation class Authentication
 */
@WebServlet(urlPatterns = {"/authentification"})
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().print("In servlet");
		request.setCharacterEncoding("CP1251");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		if(login!=null && password!=null)
		{
			AuthenticationService service = new AuthenticationService();
			RegistredUser user = service.authenticate(login, password);
			if(user == null){
				response.sendRedirect("index.jsp");
			}
			else
			{
				System.out.println(user.get_fIO());
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				response.sendRedirect("account.jsp");
			}
		}
		
	}

}
