package com.training.auctionease.servelt;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.training.auctionease.dao.AddItemDao;
import com.training.auctionease.model.Item;
import com.training.auctionease.util.DBConnection;

@WebServlet("/AdminAddItem")
@MultipartConfig
public class ItemsAdd extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          try {
        	  String itemName=req.getParameter("itemName");
        	  int sellerId=Integer.parseInt(req.getParameter("sellerId"));
        	  Double initialPrice=Double.parseDouble(req.getParameter("reservePrice"));
        	  Double startingPrice=Double.parseDouble(req.getParameter("price"));
        	  String status=req.getParameter("status");
      	      Part part=req.getPart("upload");
      	      byte[] fileName=part.getSubmittedFileName();
        	  String description=req.getParameter("description");
        	  LocalDate startDate=LocalDate.parse(req.getParameter("startDate"));
        	  LocalDate endDate=LocalDate.parse(req.getParameter("endDate"));
        	  Item it=new Item(itemName,description, startDate,endDate,initialPrice,
        			startingPrice,fileName, status,sellerId);
        	  System.out.println(it);
        	  AddItemDao dao=new AddItemDao();
        	  boolean flag=dao.newAuction(it);
        	  HttpSession session=req.getSession();
        	  if(flag) {
        		  session.setAttribute("succMsg","item Add Successfully");
        		  resp.sendRedirect("admin/new_auction.jsp");
        	  }
        	  else {
        		  session.setAttribute("failedMsg","Something went wrong");
        		  resp.sendRedirect("admin/new_auction.jsp");
        		  
        	  }
        	  
        	  
        	  
          }
          catch(Exception e) {
        	  e.printStackTrace();
          }
	}

}
