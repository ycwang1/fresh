package com.htzhny.entity;

import java.util.Date;
/**
 * 
 * @author mEssA9e
 *�ջ���ַ��
 */
public class Address {
	private int id;
	private String receiver; //�ջ���
	private String address_detail;//s�ջ���ַ
	private Date create_time;//����ʱ��
	private int status; //1������ 2��ʧЧ
	private int userId;//�����û�
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
