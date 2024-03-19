package com.training.auctionease.model;

import java.util.Objects;

public class Admin {
	 private int adminId;
	    private String username;
	    private String password;
	    private static int nextId;
	    
	    static {
	        nextId = 1;
	    }

	    {
	        adminId = nextId++;
	    }

	    public Admin() {
	    }

	    public Admin(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    public int getAdminId() {
	        return adminId;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Admin admin = (Admin) o;
	        return adminId == admin.adminId &&
	                Objects.equals(username, admin.username) &&
	                Objects.equals(password, admin.password);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(adminId, username, password);
	    }

		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + "]";
		}
	    

}
