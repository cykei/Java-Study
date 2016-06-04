package com.j2.w14.addressbookV2;

import java.util.ArrayList;
import java.util.List;

//data base
public class AdressBookDaoImp1 implements AdressBookDao {
	
	List<AdressBookData> people; //return값이 주소록 데이타인 list"people" 생성
	
	public AdressBookDaoImp1(){ //"people"에 데이타 입력
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
	public AdressBookData getPersonData(String name){ //name에 해당하는 "people"의 index값을 반환
		AdressBookData s=null;
		for (int i=0; i<people.size(); i++){
			if (name.equals((people.get(i)).getName()))
				s=people.get(i);
		}
		return s;
	}
	
	public AdressBookData updatePerson(String name,String pn){
		AdressBookData s=getPersonData(name);
		s.setPhoneNo(pn);
		System.out.println("Person: "+name+",updated in the database");
		return s;
	}
	public void deletePerson(String person){ 
		AdressBookData p=getPersonData(person);
		people.remove(p);
		System.out.println("Person: "+person+", deleted a from database");
	}
}

 