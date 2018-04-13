package com.fresh.service;

import com.htzhny.entity.User;
import com.htzhny.util.PageBean;
/**
 * 用户服务
 * @author Administrator
 *
 */
public interface UserService {
	
	User login(User user);
	int selectCount();
	PageBean<User> findByPage(int currentPage);
}
