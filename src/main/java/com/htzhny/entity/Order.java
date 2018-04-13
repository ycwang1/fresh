package com.htzhny.entity;

import java.util.Date;

/**
 * 
 * @author mEssA9e
 *������
 */
public class Order {
	private String id;
	private int address_id;//�ջ���ַ
	private String delivery_time;//�ͻ�ʱ��
	private float order_low_price;//����������Ʒ�ܹ�����ͼ�
	private float order_high_price;//����������Ʒ�ܹ�����߼�
	private float order_real_price;//�����̸�����ʵ�ʱ���
	private int order_status;//1:������ 2����ȷ�� 3�������� 4�����ջ� 5���ۺ����� 6������� 
	private Date create_time;//����ʱ��
	private int user_id;//���������û�id
	private int pay_status;//֧��״̬
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}
	public float getOrder_low_price() {
		return order_low_price;
	}
	public void setOrder_low_price(float order_low_price) {
		this.order_low_price = order_low_price;
	}
	public float getOrder_high_price() {
		return order_high_price;
	}
	public void setOrder_high_price(float order_high_price) {
		this.order_high_price = order_high_price;
	}
	public float getOrder_real_price() {
		return order_real_price;
	}
	public void setOrder_real_price(float order_real_price) {
		this.order_real_price = order_real_price;
	}
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", address_id=" + address_id + ", delivery_time=" + delivery_time
				+ ", order_low_price=" + order_low_price + ", order_high_price=" + order_high_price
				+ ", order_real_price=" + order_real_price + ", order_status=" + order_status + ", create_time="
				+ create_time + ", user_id=" + user_id + "]";
	}
	
}
