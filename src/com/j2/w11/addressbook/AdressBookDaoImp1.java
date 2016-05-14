package com.j2.w11.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AdressBookDaoImp1 implements AdressBookDao {
	
	List<AdressBookData> people;
	
	public AdressBookDaoImp1(){
		people=new ArrayList<AdressBookData>();
		AdressBookData person1 =new AdressBookData("kim","010-1234-5678","freind");
		AdressBookData person2 =new AdressBookData("cho","010-1435-2145","freind");
		AdressBookData person3 =new AdressBookData("jang","010-1415-2645","freind");
		AdressBookData person4 =new AdressBookData("ryu","010-435-245","family");
		AdressBookData person5 =new AdressBookData("lim","010-1424-2545","senior");
		AdressBookData person6 =new AdressBookData("guan","010-135-2155","senior");
		AdressBookData person7 =new AdressBookData("gu","010-1135-1445","freind");
		AdressBookData person8 =new AdressBookData("chae","010-1225-2145","teacher");
		
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);
		people.add(person6);
		people.add(person7);
		people.add(person8);
		
	}

	public List<AdressBookData> getAllpeople(){
		return people;
	}
	public AdressBookData getPersonData(String name){
		AdressBookData s=null;
		for (int i=0; i<people.size(); i++){
			if (name.equals((people.get(i)).getName()))
				s=people.get(i);
		}
		return s;
	}


}

 