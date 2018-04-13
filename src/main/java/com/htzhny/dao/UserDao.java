package com.htzhny.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.htzhny.entity.User;

/**
 * 底层方法
 * @author Administrator
 *
 */
public interface UserDao {
    public abstract User findByUserId(@Param("userid")String userId);
    /**
     * 查询所有用户数据
     * @return
     */
    int selectCount();
    /**
     * 分页操作，调用findByPage limit分页方法
     * @param map
     * @return
     */
    List<User> findByPage(HashMap<String,Object> map);
}