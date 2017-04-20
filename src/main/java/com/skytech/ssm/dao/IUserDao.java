package com.skytech.ssm.dao;


import com.skytech.ssm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {

    List<User> queryForUser();
    List<User> selectForUser();
}
