package com.ps.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.springmvc.dao.ContactDao;
import com.ps.springmvc.entity.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactDao contactDao;
	
	public int createContact(Contact contact) {
		return this.contactDao.saveContact(contact);
	}

}
