package com.qa.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "order_ID")
	private Long id;

	@OneToOne
	private Customer customer;

	@OneToOne
	private OrderLine orderline;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderLine getOrderline() {
		return orderline;
	}

	public void setOrderline(OrderLine orderline) {
		this.orderline = orderline;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", orderline="
				+ orderline + "]";
	}

}
