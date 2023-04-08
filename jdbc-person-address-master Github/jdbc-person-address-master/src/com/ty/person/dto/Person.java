package com.ty.person.dto;

public class Person 
{
	private int pid;
	private String name;
	private String email;
	private String phone;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString()
	{
		System.out.println("Person Id :"+pid);
		System.out.println("Person Name :"+name);
		System.out.println("Person Email :"+email);
		System.out.println("Person Phone :"+phone);
		System.out.println("----------------------------");
		return "";
	}
	
}
