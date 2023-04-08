package com.ty.person.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person.dto.Address;
import com.ty.person.util.ConnectionObject;

public class AddressDao {
	
	List<Address> list = new ArrayList();
	
	public int saveAddress(Address address) {
		Connection connection = ConnectionObject.getConnection();
		String sql = "Insert into address values (?,?,?,?,?,?)";
		int result = 0;
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, address.getAid());
			preparedstatement.setString(2,address.getStreet());
			preparedstatement.setString(3, address.getDoor_num());
			preparedstatement.setString(4, address.getCity());
			preparedstatement.setInt(5, address.getPin());
			preparedstatement.setInt(6,address.getPid());
			
			result = preparedstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Address> getAddressById(Address address, int id){
		Connection connection = ConnectionObject.getConnection();
		String sql = "select * from address where pid =?";
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			ResultSet resultSet = preparedstatement.executeQuery();
			
			while(resultSet.next()) {
				Address address1 = new Address();
				address1.setAid(resultSet.getInt(1));
				address1.setStreet(resultSet.getString(2));
				address1.setDoor_num(resultSet.getString(3));
				address1.setCity(resultSet.getString(4));
				address1.setPin(resultSet.getInt(5));
				address1.setPid(resultSet.getInt(6));
				
				list.add(address1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
