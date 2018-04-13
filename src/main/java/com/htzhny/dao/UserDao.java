package com.htzhny.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.htzhny.entity.User;

/**
 * �ײ㷽��
 * @author Administrator
 *
 */
public interface UserDao {
    public abstract User findByUserId(@Param("userid")String userId);
    /**
     * ��ѯ�����û�����
     * @return
     */
    int selectCount();
    /**
     * ��ҳ����������findByPage limit��ҳ����
     * @param map
     * @return
     */
    List<User> findByPage(HashMap<String,Object> map);
}