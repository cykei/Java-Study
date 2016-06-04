package com.j2.w14.addressbookV2;

public class AdressBookTestDrive {
	public static void main(String [] args){
		AdressBookDao abd=new AdressBookDaoImp1();
		
		//��ü �ּҷ��� ���δ�.
		System.out.println("Show all contains of address book");
		for (AdressBookData person : abd.getAllpeople()){
			System.out.println(person.getName()+":"+person.getPhoneNo()+":"+person.getAffiliation());
		}
		System.out.println();
		
		//"gu"���� ��ȭ��ȣ�� ��ȯ�Ѵ�.
		System.out.println("Search Gu's phone number");
		AdressBookData person=abd.getPersonData("gu");
		System.out.println(person.getPhoneNo());
		System.out.println();
		
		//"gu"���� ���� �ּҷϿ� ����ִ� ��� ������ ��ȯ�Ѵ�.
		System.out.println("Serach about Gu");
		System.out.println("["+person.getName()+":"+person.getPhoneNo()+":"+person.getAffiliation()+"]");
		System.out.println();
		
		//"gu"���� ��ȭ��ȣ�� �����Ѵ�.
		System.out.println("Change Gu's phone number");
		person=abd.updatePerson("gu","010-2314-1342");
		person=abd.getPersonData("gu");
		System.out.println("["+person.getName()+":"+person.getPhoneNo()+":"+person.getAffiliation()+"]");
		System.out.println();
		
		//"gu"���� ��ȭ��ȣ�� �����Ѵ�.
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
