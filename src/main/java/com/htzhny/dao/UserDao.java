package com.htzhny.dao;

import org.apache.ibatis.annotations.Param;

import com.htzhny.entity.User;

/**
 * µ×²ã·½·¨
 * @author Administrator
 *
 */
public interface UserDao {
    public abstract User findByUserId(@Param("userid")int userId);
}