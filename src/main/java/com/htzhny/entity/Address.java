package com.htzhny.entity;

import java.util.Date;
/**
 * 
 * @author mEssA9e
 *收货地址类
 */
public class Address {
	private int id;
	private String receiver; //收货人
	private String address_detail;//s收货地址
	private Date create_time;//创建时间
	private int status; //1：正常 2：失效
	private int userId;//所属用户
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "address [id=" + id + ", receiver=" + receiver + ", address_detail=" + address_detail + ", create_time="
				+ create_time + ", status=" + status + ", userId=" + userId + "]";
	}
	
}
