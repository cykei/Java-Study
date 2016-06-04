package com.j2.w14.addressbookV2;

import java.util.List;

public interface AdressBookDao {
	public List<AdressBookData> getAllpeople();
	public AdressBookData getPersonData(String name);
	public AdressBookData updatePerson(String name,String pn);
	public void deletePerson(String person);

}
