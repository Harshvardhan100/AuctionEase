package com.training.auctionease.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.training.auctionease.model.Sellers;
import com.training.auctionease.model.User;
import com.training.auctionease.util.DBConnection;


public class AuctionDaoImpl implements AuctionDao{
	
	private DBConnection dbConnection;
	
	public AuctionDaoImpl(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}
	public AuctionDaoImpl() {
		super();
	}



	@Override
	public boolean userRegister(User user) {
		boolean flag=false;
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","auction_project","root");
			PreparedStatement ps=connection.prepareStatement("insert into users(username,password,fullname,phone) values(?,?,?,?)");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFullName());
			ps.setString(4, user.getPhone());
			int i=ps.executeUpdate();
			if(i>0) {
				flag=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean sellerRegister(Sellers seller) {
		boolean flag=false;
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","auction_project","root");
			PreparedStatement ps=connection.prepareStatement("insert into sellers(username,password,fullname,phone) values(?,?,?,?)");
			ps.setString(1, seller.getUserName());
			ps.setString(2, seller.getPassword());
			ps.setString(3, seller.getFullName());
			ps.setString(4, seller.getPhone());
			int i=ps.executeUpdate();
			if(i>0) {
				flag=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
		
	

	@Override
	public User login(String username, String password) {
		User user=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","auction_project","root");
			String sql="select * from users where username=? &&password=?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				user=new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setPhone(rs.getString(4));
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
		
	}
	

}
