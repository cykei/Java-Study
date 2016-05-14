package com.j2.w11.addressbook;

import java.util.List;

public interface AdressBookDao {
	public List<AdressBookData> getAllpeople();
	public AdressBookData getPersonData(String name);
}
