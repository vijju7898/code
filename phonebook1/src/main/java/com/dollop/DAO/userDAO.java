package com.dollop.DAO;

import java.sql.SQLException;
import java.util.List;

import com.dollop.entity.user;


public interface userDAO {
	public List<user>get() throws SQLException, Exception;
	public boolean save(user user) throws SQLException ,Exception;
	public boolean update(user user)throws SQLException ,Exception ;
	public boolean delete(user user)throws SQLException ,Exception;
	//public user loginUser(user User)throws SQLException ,Exception;
	public Integer login(String email, String password );
	
}
