package com.dollop.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dollop.DAO.contactDAO;
import com.dollop.entity.contact;
import com.dollop.entity.user;
import com.dollop.util.Dbconnection;

public class contactDAOImpl implements contactDAO {
	private static final String create_Contact="INSERT INTO `contact`( `uid`, `name`, `email`, `mobile` ) VALUES (?,?,?,?)";
	private static final String UPDATE_CONTACT="UPDATE `contact6` SET `name`=?,`email`=?,`mobile`=? WHERE id=? AND uid=?";
	private static final String view_All_Contact="SELECT * FROM `contact`WHERE uid=?";
	private static final String DELETE_CONTACT="DELETE FROM `contact` WHERE id=? AND uid=?";
	private static final String view_Contact_By_Id="SELECT * FROM `contact` WHERE uid=? AND name=?";
	private static final String view_By_Id="SELECT * FROM `contact` WHERE id=?";

	private static Connection con=null;
	private static PreparedStatement psmt=null;
	private static ResultSet rs = null;

	public boolean createContact(contact Contact) throws Exception {
		con = Dbconnection.getConnection();
		
		psmt=con.prepareStatement(create_Contact);
		psmt.setInt(1, Contact.getuId());
		psmt.setString(2,Contact.getName());	
		psmt.setString(3,Contact.getEmail());
		psmt.setString(4,Contact.getMobile());
	
		
		int affesctedRows = psmt.executeUpdate();
		return affesctedRows>0?true:false;
	}

	public List<contact> viewContactById(contact Contact) throws Exception {
		List<contact>contactLists=new ArrayList<contact>();
		con=Dbconnection.getConnection();

			psmt=con.prepareStatement(view_Contact_By_Id);
			psmt.setInt(1,Contact.getuId());
			psmt.setString(2,Contact.getName());
			ResultSet rs = psmt.executeQuery();
			
			
			while (rs.next()) {
				contact Con=new contact();
				Con.setId(rs.getInt("id"));
				Con.setuId(rs.getInt("uid"));
				Con.setName(rs.getString("Name"));
				Con.setEmail(rs.getString("email"));
				Con.setMobile(rs.getString("mobile"));
	
				contactLists.add(Con);
				}
			
		return contactLists;
	}

	public boolean deleteContact(contact Contact) throws Exception {
		con=Dbconnection.getConnection();
		psmt=con.prepareStatement(DELETE_CONTACT);
		psmt.setInt(1, Contact.getId());
		psmt.setInt(2, Contact.getuId());
		int affesctedRows = psmt.executeUpdate();
		return affesctedRows>0?true:false;
	}

	public boolean updateContact(contact Contact) throws Exception {
		con=Dbconnection.getConnection();
		psmt=con.prepareStatement(UPDATE_CONTACT);
		psmt.setString(1,Contact.getName());
		psmt.setString(2,Contact.getEmail());
		psmt.setString(3,Contact.getMobile());
		psmt.setInt(4,Contact.getId());
		psmt.setInt(5, Contact.getuId());
		
		int affesctedRows = psmt.executeUpdate();
		return affesctedRows>0?true:false;
	}

	public List<contact> get() throws SQLException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<contact> viewAllContact(Integer uid) throws Exception {
		List<contact>contactLists=new ArrayList<contact>();
		con=Dbconnection.getConnection();

			psmt=con.prepareStatement(view_All_Contact);
			psmt.setInt(1, uid);
			ResultSet rs = psmt.executeQuery();
			
			
			while (rs.next()) {
				contact Contact=new contact();
				Contact.setId(rs.getInt("id"));
				Contact.setuId(rs.getInt("uid"));
				Contact.setName(rs.getString("Name"));
				Contact.setEmail(rs.getString("email"));
				Contact.setMobile(rs.getString("mobile"));
	
				contactLists.add(Contact);
				}
			
		return contactLists;
	}

	@Override
	public contact getSingleContact(Integer id) throws Exception {
		contact Contact=new contact();
		con=Dbconnection.getConnection();

			psmt=con.prepareStatement(view_By_Id);
			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();
			
			
			while (rs.next()) {
			
				Contact.setId(rs.getInt("id"));
				Contact.setuId(rs.getInt("uid"));
				Contact.setName(rs.getString("Name"));
				Contact.setEmail(rs.getString("email"));
				Contact.setMobile(rs.getString("mobile"));
	
			
				}
	
		return Contact;
	
		
	}

}
