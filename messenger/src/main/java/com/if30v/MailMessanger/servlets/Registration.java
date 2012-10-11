package com.if30v.MailMessanger.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.if30v.MailMessanger.beans.RegistredUser;
import com.if30v.MailMessanger.dao.HibernateUtil;
import com.if30v.MailMessanger.service.RegistrationService;

/**
 * Servlet implementation class Registration
 */
@WebServlet(urlPatterns = {"/registration"})
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String fio = request.getParameter("fio");
		String dateOfBirth = request.getParameter("dateOfBirth");
		String controlEmail = request.getParameter("controlEmail");
		String telephone = request.getParameter("telephone");
		
		System.out.println(fio);
		RegistrationService service = new RegistrationService();
		service.setFio(fio);
		service.setDateOfBirth(dateOfBirth);
		service.setLogin(login);
		service.setPassword(password);
		service.setControlEmail(controlEmail);
		service.setTelephone(telephone);
		
		try {
			if(service.register()){
				response.sendRedirect("index.jsp");
			}
			else{
				request.getSession().setAttribute("error", "Ошибка при регистрации. Проверьте валидность данных");
				response.sendRedirect("registration.jsp");
			}
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
