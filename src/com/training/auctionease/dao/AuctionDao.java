package com.training.auctionease.dao;

import com.training.auctionease.model.Sellers;
import com.training.auctionease.model.User;

public interface AuctionDao {
	
	public boolean userRegister(User user);
	
	public User login(String email,String password);
	
	
	public boolean sellerRegister(Sellers seller);
	
	

}
