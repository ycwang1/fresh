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
	 * ��ҳ����
	 */
	@Override
	public PageBean<User> findByPage(int currentPage) {
		// TODO Auto-generated method stub
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<User> pageBean = new PageBean<User>();

        //��װ��ǰҳ��
        pageBean.setCurrPage(currentPage);

        //ÿҳ��ʾ������
        int pageSize=2;
        pageBean.setPageSize(pageSize);

        //��װ�ܼ�¼��
        int totalCount = userdao.selectCount();
        pageBean.setTotalCount(totalCount);

        //��װ��ҳ��
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);//����ȡ��
        pageBean.setTotalPage(num.intValue());

        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        //��װÿҳ��ʾ������
        List<User> lists = userdao.findByPage(map);
        pageBean.setLists(lists);

	    return pageBean;
	}



}
