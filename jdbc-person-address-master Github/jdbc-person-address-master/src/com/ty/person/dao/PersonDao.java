package com.ty.person.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.person.dto.Person;
import com.ty.person.util.ConnectionObject;

public class PersonDao 
{
	public int savePerson(Person person)
	{
		Connection connection = ConnectionObject.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into person values(?,?,?,?)");
			preparedStatement.setInt(1, person.getPid());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3,person.getEmail());
			preparedStatement.setString(4,person.getPhone());
			
			return preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				connection.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return 0;
	}
}
