package com.learning.modules.order.internalcustomized;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Order {
	private static int CURRENT_ORDER_ID=0;
	private int id;
	private List<String> items;
	private String address;
	
	private Order() {
		id = ++CURRENT_ORDER_ID;
	}
	
	public void addItem(String item) {
		if(items ==null) {
			items= new ArrayList<String>();
		}
		System.out.println(String.format("Adding item %s in order: %s", item,id));
		items.add(item);
	}
	
	public void addAddress(String address) {
		System.out.println(String.format("Adding adress %s in order: %s", address,id));
		this.address=address;
	}
	
	public static void placeOrder(Function<Order, Order> orderFunction) {
		Order order = new Order();
		orderFunction.apply(order);
		System.out.println(String.format("Order placed %s", order));
	}

	
	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", items=" + items + ", address=" + address + "]";
	}
	
	
}
