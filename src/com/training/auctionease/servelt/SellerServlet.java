package com.training.auctionease.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.auctionease.dao.AuctionDaoImpl;
import com.training.auctionease.model.Sellers;
@WebServlet("/AddSeller")
public class SellerServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
			
			String name=req.getParameter("fullname");
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			String phone=req.getParameter("phone");
            
		    Sellers seller=new Sellers();
		    seller.setFullName(name);
		    seller.setUserName(username);
		    seller.setPassword(password);
		    seller.setPhone(phone);
		    System.out.println(seller);
			AuctionDaoImpl dao=new AuctionDaoImpl();
			boolean flag=dao.sellerRegister(seller);
			HttpSession session=req.getSession();
			if(flag) {
				//System.out.println(" register Success");
				session.setAttribute("succMsg","registration Successfully");
				resp.sendRedirect("admin/admin.jsp");
			}
			else {
				System.out.println("something went wrong");
				session.setAttribute("failedMsg", "Something went wrong");
				resp.sendRedirect("admin/add_seller.jsp");
				
			}
		    
	}
}


