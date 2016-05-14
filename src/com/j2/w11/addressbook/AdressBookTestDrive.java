package com.j2.w11.addressbook;

public class AdressBookTestDrive {
	public static void main(String [] args){
		AdressBookDao abd=new AdressBookDaoImp1();
		System.out.println("show all contains of address book");
		for (AdressBookData person : abd.getAllpeople()){
			System.out.println(person.getName()+":"+person.getPhoneNo()+":"+person.getAffiliation());
		}
		System.out.println();
		
		System.out.println("search gu's phone number");
		AdressBookData person=abd.getPersonData("gu");
		System.out.println(person.getPhoneNo());
		System.out.println();
		
		System.out.println("serach about gu");
		System.out.println("["+person.getName()+":"+person.getPhoneNo()+":"+person.getAffiliation()+"]");
		
		
	}
}
