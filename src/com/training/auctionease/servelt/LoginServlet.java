package com.training.auctionease.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.auctionease.dao.AuctionDaoImpl;
import com.training.auctionease.model.User;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			AuctionDaoImpl dao=new AuctionDaoImpl();
			HttpSession session=req.getSession();
			
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			
			if("ritesh@996".equals(username)&&"root".equals(password)) {
				User user=new User();
				session.setAttribute("userObj", user);
				resp.sendRedirect("admin/admin.jsp");
			}
			else {
			User user=dao.login(username,password);
            if(user!=null) {
            	session.setAttribute("userObj",user);
            	resp.sendRedirect("index.jsp");
            }
            else {
            	session.setAttribute("failedMsg","Email or Password invalid");
            	resp.sendRedirect("login.jsp");
            }
            resp.sendRedirect("index.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
