package com.rays.auction;

import java.util.Set;

public class AuctionItem {
	
	private int id;
	private Set bids;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set getBids() {
		return bids;
	}
	public void setBids(Set bids) {
		this.bids = bids;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	private String decription;
	
	
	

}
