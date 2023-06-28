package com.ruoyi.begin.Dao;

import com.ruoyi.begin.bean.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
     User getUserByMassage(@Param("username")String username,@Param("password")String password);

}
