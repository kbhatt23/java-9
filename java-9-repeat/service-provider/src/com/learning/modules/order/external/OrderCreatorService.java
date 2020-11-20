package com.learning.modules.order.external;

import com.learning.modules.order.internal.Order;

public class OrderCreatorService {

	public  void createSampleOrder() {
		Order.placeOrder(order -> {
			order.addItem("iphone");
			order.addItem("lenovo laptop");
			order.addItem("dumbells");
			order.addItem("bluetooth keyboard");
			order.addAddress("delhi");
			return order;
		});
	}
}
