package com.ty.person.Controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.person.Service.AddressService;
import com.ty.person.dao.AddressDao;
import com.ty.person.dto.Address;

public class TestAddress {
	
	public static void main(String[] args) {
		List<Address> list = new ArrayList();
		Address address = new Address();
//		address.setAid(3);
//		address.setStreet("GandiBazar");
//		address.setDoor_num("121");
//		address.setCity("Bangalore");
//		address.setPin(560020);
//		address.setPid(1);
		
		AddressService addressService = new AddressService();
		
//		int res = addressService.saveAddress(address);
//		if(res > 0) {
//			System.out.println("Data is inserted successfully");
//		}
//		else
//			System.out.println("No data is Exist");
		
		list=addressService.getAddressById(address, 1);
		System.out.println(list);
	}
}
