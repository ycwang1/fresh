package com.htzhny.entity;
/**
 * 
 * @author mEssA9e
 *�ۺ��¼�
 */
public class After_sale {
	private String id;
	private int order_id;//����id
	private String after_sale_reason;//�����ۺ�����
	private int handle_status; //1��δ���� 2�������� 3���������
	private String handle_way; //�ۺ���ʽ
	private String handle_person;//�ۺ�����
	private String handle_time; //����ʱ��
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getAfter_sale_reason() {
		return after_sale_reason;
	}
	public void setAfter_sale_reason(String after_sale_reason) {
		this.after_sale_reason = after_sale_reason;
	}
	public int getHandle_status() {
		return handle_status;
	}
	public void setHandle_status(int handle_status) {
		this.handle_status = handle_status;
	}
	public String getHandle_way() {
		return handle_way;
	}
	public void setHandle_way(String handle_way) {
		this.handle_way = handle_way;
	}
	public String getHandle_person() {
		return handle_person;
	}
	public void setHandle_person(String handle_person) {
		this.handle_person = handle_person;
	}
	public String getHandle_time() {
		return handle_time;
	}
	public void setHandle_time(String handle_time) {
		this.handle_time = handle_time;
	}
	@Override
	public String toString() {
		return "After_sale [id=" + id + ", order_id=" + order_id + ", after_sale_reason=" + after_sale_reason
				+ ", handle_status=" + handle_status + ", handle_way=" + handle_way + ", handle_person=" + handle_person
				+ ", handle_time=" + handle_time + "]";
	}
	
}
