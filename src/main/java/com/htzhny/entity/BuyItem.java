package com.htzhny.entity;



public class BuyItem {
	private Goods goods;
	private int amount;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((goods == null) ? 0 : goods.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) 
			return false;
		BuyItem other = (BuyItem) obj;
		if (goods == null) {
			if (other.goods != null)
				return false;
		} else if (goods.getId()!=other.goods.getId())
			return false;
		return true;
	}
} 
