package com.skytech.ssm.dao;


import com.skytech.ssm.entity.User;

import java.util.List;

public interface IUserDao {

	List<User> queryForUser();
}
