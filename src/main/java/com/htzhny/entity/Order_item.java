package com.htzhny.entity;
/**
 * 
 * @author mEssA9e
 *订单项
 */
public class Order_item {
	private int id;
	private int goods_id;//商品ID
	private int order_id;//订单ID
	private float goods_amount;//商品数量
	private float item_low_price;//订单项商品总共的最低价
	private float item_high_price;//订单项商品总共的最高价
	private float item_real_price;//单个商品实际报价
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public float getGoods_amount() {
		return goods_amount;
	}
	public void setGoods_amount(float goods_amount) {
		this.goods_amount = goods_amount;
	}
	public float getItem_low_price() {
		return item_low_price;
	}
	public void setItem_low_price(float item_low_price) {
		this.item_low_price = item_low_price;
	}
	public float getItem_high_price() {
		return item_high_price;
	}
	public void setItem_high_price(float item_high_price) {
		this.item_high_price = item_high_price;
	}
	public float getItem_real_price() {
		return item_real_price;
	}
	public void setItem_real_price(float item_real_price) {
		this.item_real_price = item_real_price;
	}
	@Override
	public String toString() {
		return "Order_item [id=" + id + ", goods_id=" + goods_id + ", order_id=" + order_id + ", goods_amount="
				+ goods_amount + ", item_low_price=" + item_low_price + ", item_high_price=" + item_high_price
				+ ", item_real_price=" + item_real_price + "]";
	}
	
}
