package com.itmayiedu.dao;

import com.itmayiedu.entity.User;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface UserDao extends JpaRepository<User, Integer>{

}
