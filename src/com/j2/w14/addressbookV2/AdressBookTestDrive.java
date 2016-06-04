package com.j2.w14.addressbookV2;

public class AdressBookTestDrive {
	public static void main(String [] args){
		AdressBookDao abd=new AdressBookDaoImp1();
		
		//전체 주소록을 보인다.
		System.out.println("Show all contains of address book");
		for (AdressBookData person : abd.getAllpeople()){
			System.out.println(person.getName()+":"+person.getPhoneNo()+":"+person.getAffiliation());
		}
		System.out.println();
		
		//"gu"씨의 전화번호를 반환한다.
		System.out.println("Search Gu's phone number");
		AdressBookData person=abd.getPersonData("gu");
		System.out.println(person.getPhoneNo());
		System.out.println();
		
		//"gu"씨에 대해 주소록에 들어있는 모든 정보를 반환한다.
		System.out.println("Serach about Gu");
		System.out.println("["+person.getName()+":"+person.getPhoneNo()+":"+person.getAffiliation()+"]");
		System.out.println();
		
		//"gu"씨의 전화번호를 수정한다.
		System.out.println("Change Gu's phone number");
		person=abd.updatePerson("gu","010-2314-1342");
		person=abd.getPersonData("gu");
		System.out.println("["+person.getName()+":"+person.getPhoneNo()+":"+person.getAffiliation()+"]");
		System.out.println();
		
		//"gu"씨의 전화번호를 삭제한다.
		System.out.println("Remove a data about Gu");
		abd.deletePerson("gu");
		System.out.println();
		System.out.println("Show all contains of address book");
		for (AdressBookData person2 : abd.getAllpeople()){
			System.out.println(person2.getName()+":"+person2.getPhoneNo()+":"+person2.getAffiliation());
		}
		System.out.println();
	}
}
