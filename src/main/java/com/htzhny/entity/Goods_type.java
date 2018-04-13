package com.htzhny.entity;

import java.util.Date;
/**
 * 
 * @author mEssA9e
 *商品类型
 */
public class Goods_type {
	private int id;
	private String goods_type_name; //商品类型名
	private Date create_time;//创建时间
	private int status;//1:使用中 2：已失效
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoods_type_name() {
		return goods_type_name;
	}
	public void setGoods_type_name(String goods_type_name) {
		this.goods_type_name = goods_type_name;
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
	@Override
	public String toString() {
		return "Goods_type [id=" + id + ", goods_type_name=" + goods_type_name + ", create_time=" + create_time
				+ ", status=" + status + "]";
	}
	
}
