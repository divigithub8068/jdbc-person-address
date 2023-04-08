package com.ty.person.dto;

public class Address {
	
	private int aid;
	private String street;
	private String door_num;
	private String city;
	private int pin;
	private int pid;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDoor_num() {
		return door_num;
	}
	public void setDoor_num(String door_num) {
		this.door_num = door_num;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		System.out.println("Address ID: "+aid);
		System.out.println("Street: "+street);
		System.out.println("Door Number: "+door_num);
		System.out.println("City: "+city);
		System.out.println("Pin code: "+pin);
		System.out.println("Person Id :"+pid);
		System.out.println("-------------------------");
		return "";
	}
}
