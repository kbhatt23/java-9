package com.learning.modules.client;

import com.learning.modules.order.external.OrderCreatorService;

public class OrderCleint {
public static void main(String[] args) {
	new OrderCreatorService()
	.createSampleOrder();
	System.out.println("jai shree ram says jlinker");
	
	new com.learning.modules.order.externalcustomized.OrderCreatorService().createSampleOrder();
	
}
}
