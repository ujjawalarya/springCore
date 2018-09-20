package com.ujjawal.spring.springCore.shoppingCart;

public class ShoppingCart {

	private Item item;

	@Override
	public String toString() {
		return "ShoppingCart [item=" + getItem() + "]";
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
