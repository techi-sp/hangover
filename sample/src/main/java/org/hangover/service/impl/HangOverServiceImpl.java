package org.hangover.service.impl;

import java.util.List;

import org.hangover.dao.impl.UserDaoImpl;
import org.hangover.model.User;
import org.hangover.services.HangOverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HangOverServiceImpl implements HangOverService{

	@Autowired
	private UserDaoImpl daoImpl;
	
	@Override
	public List<User> getAllUsers() {
		return daoImpl.getUsersList();
	}

}
