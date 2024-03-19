/**
 * 
 */
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

/**
 * @author aradhana
 *
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			
			String name=req.getParameter("fullname");
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			String phone=req.getParameter("phone");

		    User user=new User();
		    user.setFullName(name);
		    user.setUserName(username);
		    user.setPassword(password);
		    user.setPhone(phone);
			AuctionDaoImpl dao=new AuctionDaoImpl();
			boolean flag=dao.userRegister(user);
			HttpSession session=req.getSession();
			if(flag) {
				//System.out.println("user register Success");
				session.setAttribute("succMsg","registration Successfully");
				resp.sendRedirect("createProfile.jsp");
			}
			else {
				//System.out.println("something went wrong");
				session.setAttribute("failedMsg", "createProfile.jsp");
			}
		    
	}

}
