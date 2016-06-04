package com.j2.w14.addressbookV2;

public class AdressBookData {
	private String name;
	private String pN;
	private String affiliation;
	
	AdressBookData(String name, String pN, String affiliation){
		this.name=name;
		this.pN=pN;
		this.affiliation=affiliation;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPhoneNo(){
		return pN;
	}
	public void setPhoneNo(String pN){
		this.pN=pN;
	}
	public String getAffiliation(){
		return affiliation;
	}
	public void setAffiliation(String affiliation){
		this.affiliation=affiliation;
	}
}
