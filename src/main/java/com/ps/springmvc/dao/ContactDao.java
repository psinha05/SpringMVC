package com.ps.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ps.springmvc.entity.Contact;


@Repository
public class ContactDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveContact(Contact contact) {
		int id = (Integer) this.hibernateTemplate.save(contact);
		return id;
	}

}
