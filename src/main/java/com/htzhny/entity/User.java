package com.htzhny.entity;

import java.util.Date;
/**
 * 
 * @author mEssA9e
 *
 *�û���
 */
public class User {
	private String id;
	private String user_name;//�û���
	private String password;//����
	private int user_type; // 1:����Ա 2���ͻ�
	private String user_phone;//�绰
	private int user_id_type; //1:���֤ 2������
	private String user_id_card;//֤������
	private String user_birthday;//����
	private String user_company;//������λ
	private Date create_time;//����ʱ��
	private Date user_last_login_time;//�ϴε�¼ʱ��
	private int status; //1:���� 2���쳣
	public User() {
	}
	public User(String id, String user_name, String password) {
		this.id=id;
		this.user_name=user_name;
		this.password=password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser_type() {
		return user_type;
	}
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
	public int getUser_id_type() {
		return user_id_type;
	}
	public void setUser_id_type(int user_id_type) {
		this.user_id_type = user_id_type;
	}
	public String getUser_id_card() {
		return user_id_card;
	}
	public void setUser_id_card(String user_id_card) {
		this.user_id_card = user_id_card;
	}
	public String getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUser_last_login_time() {
		return user_last_login_time;
	}
	public void setUser_last_login_time(Date user_last_login_time) {
		this.user_last_login_time = user_last_login_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", user_name=" + user_name + ", password=" + password + ", user_type=" + user_type
				+ ", userphone=" + user_phone + ", user_id_type=" + user_id_type + ", user_id_card=" + user_id_card
				+ ", user_birthday=" + user_birthday + ", user_company=" + user_company + ", create_time=" + create_time
				+ ", user_last_login_time=" + user_last_login_time + ", status=" + status + "]";
	}
	

	
	
}
