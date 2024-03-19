package com.training.auctionease.model;

import java.sql.Date;

import java.time.LocalDate;

public class Item {
	private int itemId;
    private String itemName;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double initialPrice;
    private Double startingPrice;
    private byte[] images;
    private String status;
    private int sellerId;
    
    
    private static int counter=0;
    {
    	this.itemId=++counter;
    }
	
	public Item(String itemName, String description, LocalDate startDate, LocalDate endDate, Double initialPrice,
			Double startingPrice, byte[] images, String status, int sellerId) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.initialPrice = initialPrice;
		this.startingPrice = startingPrice;
		this.images = images;
		this.status = status;
		this.sellerId = sellerId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Double getInitialPrice() {
		return initialPrice;
	}
	public void setInitialPrice(Double initialPrice) {
		this.initialPrice = initialPrice;
	}
	public Double getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(Double startingPrice) {
		this.startingPrice = startingPrice;
	}
	
	public byte[] getImages() {
		return images;
	}
	public void setImages(byte[] images) {
		this.images = images;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((images == null) ? 0 : images.hashCode());
		result = prime * result + ((initialPrice == null) ? 0 : initialPrice.hashCode());
		result = prime * result + itemId;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + sellerId;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((startingPrice == null) ? 0 : startingPrice.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (images == null) {
			if (other.images != null)
				return false;
		} else if (!images.equals(other.images))
			return false;
		if (initialPrice == null) {
			if (other.initialPrice != null)
				return false;
		} else if (!initialPrice.equals(other.initialPrice))
			return false;
		if (itemId != other.itemId)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (sellerId != other.sellerId)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (startingPrice == null) {
			if (other.startingPrice != null)
				return false;
		} else if (!startingPrice.equals(other.startingPrice))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", startDate="
				+ startDate + ", endDate=" + endDate + ", initialPrice=" + initialPrice + ", startingPrice="
				+ startingPrice + ", images=" + images + ", status=" + status + ", sellerId=" + sellerId + "]";
	}
	

}
