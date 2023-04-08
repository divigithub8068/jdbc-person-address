package com.ty.person.Controller;

import com.ty.person.Service.PersonService;
import com.ty.person.dto.Person;

public class TestPerson 
{
	public static void main(String[] args) 
	{
		Person person = new Person();
		person.setPid(1);
		person.setName("Prasi");
		person.setEmail("parshi@gmail.com");
		person.setPhone("23456787654");
		PersonService personService = new PersonService();
		int res = personService.savePersonService(person);
		if(res>0)
		{
			System.out.println("Addedd successfully");
		}
		else
			System.out.println("No data is Exist");
	}
}
