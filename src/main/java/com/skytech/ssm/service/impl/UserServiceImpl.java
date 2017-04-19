package com.skytech.ssm.service.impl;

import com.skytech.ssm.entity.User;
import com.skytech.ssm.dao.IUserDao;
import com.skytech.ssm.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements IUserService {

	private Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> getAllUser() {
		List<User> users = null;
		try {
			users = userDao.queryForUser();
		} catch (Exception e) {
			logger.error(e);
	}
		return users;
	}

}
