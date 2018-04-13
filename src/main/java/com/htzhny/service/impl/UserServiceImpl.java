package com.htzhny.service.impl;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fresh.service.UserService;
import com.htzhny.dao.UserDao;
import com.htzhny.entity.User;
import com.htzhny.util.PageBean;

@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	private UserDao userdao;
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userdao.findByUserId(user.getId());
	}
	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return userdao.selectCount();
	}
	/**
	 * 分页查找
	 */
	@Override
	public PageBean<User> findByPage(int currentPage) {
		// TODO Auto-generated method stub
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<User> pageBean = new PageBean<User>();

        //封装当前页数
        pageBean.setCurrPage(currentPage);

        //每页显示的数据
        int pageSize=2;
        pageBean.setPageSize(pageSize);

        //封装总记录数
        int totalCount = userdao.selectCount();
        pageBean.setTotalCount(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        //封装每页显示的数据
        List<User> lists = userdao.findByPage(map);
        pageBean.setLists(lists);

	    return pageBean;
	}



}
