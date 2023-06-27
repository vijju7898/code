package com.dollop.DAO;


import java.util.List;

import com.dollop.entity.contact;

public interface contactDAO {

	public boolean createContact(contact Contact) throws Exception;
	public List<contact> viewAllContact(Integer uid)throws Exception;
	public List<contact> viewContactById(contact Contact) throws Exception;
	public boolean deleteContact(contact Contact)throws Exception;
	public boolean updateContact(contact Contact)throws Exception;
	public contact getSingleContact(Integer id)throws Exception;
}
