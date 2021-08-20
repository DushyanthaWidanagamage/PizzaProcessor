package com.pizza.model;

import org.springframework.data.annotation.Id;


public class Order {

	@Id
	private String id;
	
	private String orderName;
	
	public Order(String id, String orderName) {
		this.id = id;
		this.orderName = orderName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	public String toString() {
		return this.id + " : " +this.orderName;
	}

}

