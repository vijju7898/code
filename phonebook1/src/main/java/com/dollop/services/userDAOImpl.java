package com.dollop.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dollop.DAO.userDAO;
import com.dollop.entity.user;
import com.dollop.util.Dbconnection;






public class userDAOImpl implements userDAO {
		
	 private static final String INSERT_USER="INSERT INTO `user`(`name`, `email`, `password`, `contact`) VALUES (?,?,?,?)";
		private static final String UPDATE_USER="UPDATE `user` SET `name`=?,`email`=?,`password`=?,`contact`=? WHERE uid=?";
		private static final String SELECT_USER="SELECT * FROM `user` WHERE email=? AND password=?";
		private static final String DELETE_USER="DELETE FROM `user` WHERE uid=?";
		private static Connection con=null;
		private static PreparedStatement psmt=null;
		private static ResultSet rs = null;

	public List<user> get() throws SQLException, Exception {

		List<user>UserLists=new ArrayList<user>();
		con=Dbconnection.getConnection();
		if(con!=null) {
			psmt=con.prepareStatement(SELECT_USER);
			ResultSet rs = psmt.executeQuery();
			
			
			while (rs.next()) {
				user User=new user();
			//	user.setuId(rs.getInt("uid"));
				User.setName(rs.getString("Name"));
				User.setEmail(rs.getString("email"));
				User.setPassword(rs.getString("password"));
				User.setContact(rs.getString("contact"));
	
				UserLists.add(User);
				}
			//return userLists;
		}
		return UserLists;
	}

	public boolean save(user User) throws SQLException, Exception {
		int affesctedRows=0;
		try {
		con=Dbconnection.getConnection();
		psmt=con.prepareStatement(INSERT_USER);
		psmt.setString(1,User.getName());	
		psmt.setString(2,User.getEmail());
		psmt.setString(3,User.getPassword());
		psmt.setString(4,User.getContact());
		 affesctedRows = psmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return affesctedRows>0?true:false;
	}

	public boolean update(user user) throws SQLException, Exception {
		con=Dbconnection.getConnection();
		psmt=con.prepareStatement(UPDATE_USER);
		psmt.setString(1,user.getName());
		psmt.setString(2,user.getEmail());
		psmt.setString(3,user.getContact());
		psmt.setInt(4, user.getuId());
		
		int affesctedRows = psmt.executeUpdate();
		return affesctedRows>0?true:false;
	}

	public boolean delete(user User) throws SQLException, Exception {
		
		con=Dbconnection.getConnection();
		psmt=con.prepareStatement(DELETE_USER);
		psmt.setInt(1, user.getuId());
		int affesctedRows = psmt.executeUpdate();
		return affesctedRows>0?true:false;
	}

	public Integer login(String email, String password) {
	
		ResultSet rs=null;
	
		try {
			con=Dbconnection.getConnection();
			psmt=con.prepareStatement(SELECT_USER);
			psmt.setString(1,email);
			psmt.setString(2,password);
			rs= psmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("uid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	 
	}


