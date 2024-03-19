package com.training.auctionease.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.training.auctionease.model.Item;
import com.training.auctionease.util.DBConnection;

public class AddItemDao implements AdminDao{
    private DBConnection dbConnection;
	public AddItemDao() {
		super();
	}
	public AddItemDao(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}
	@Override
	public boolean newAuction(Item item) {
		boolean flag=false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","auction_project","root");
		 String sql = "INSERT INTO items (ITEMNAME, DESCRIPTION, STARTDATE, ENDDATE, INITIALPRICE, STARTINGPRICE,SELLER_ID,STATUS,Images) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setString(1, item.getItemName());
		ps.setString(2,item.getDescription() );
		ps.setObject(3,java.sql.Date.valueOf(item.getStartDate()));
		ps.setObject(4,java.sql.Date.valueOf(item.getEndDate()));
		ps.setDouble(5,item.getInitialPrice() );
		ps.setDouble(6, item.getStartingPrice());
		ps.setObject(7,item.getImages() );
		ps.setInt(8,item.getSellerId());
		ps.setString(9,item.getStatus());
		int i=ps.executeUpdate();
		 if (i>0) {
             System.out.println("Item added successfully.");
             flag=true;
         } else {
             System.out.println("Failed to add item.");
         }
		}
		catch(Exception e) {
			
		}
		return flag;
	}

    
	

}
