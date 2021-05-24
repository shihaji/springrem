package com.cts;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String validateUser(String name,String password) {
		
		String sql="select password from user where name=?";
		
		try {	
	   return jdbcTemplate.queryForObject(sql,(rs,rowNum)-> rs.getString("password"), name);
		}catch(Exception e) {
			return "";
		}
	
		
	}
	
     public boolean registerEmp(Employee employee) {
		
		String sql="insert into employee values(?,?,?)";
    	 
		try {
    	 jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getSalary());
    	 
		}catch(Exception e) {
			return false;
		}
    	 return true;
	}
	
	

}
