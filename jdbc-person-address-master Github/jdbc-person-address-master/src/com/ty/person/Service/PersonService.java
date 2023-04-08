package com.ty.person.Service;

import com.ty.person.dao.PersonDao;
import com.ty.person.dto.Person;

public class PersonService
{
	PersonDao dao = new PersonDao();
	
	public int savePersonService(Person person)
	{
		return dao.savePerson(person);
	}
}
