package com.capgemini.onlinebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Order_Details")
public class OrderDetails {

	@Id
	@Column(name = "Order_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer OrderId;
	
	@Column(name = "Quantity")
	private Integer qty;
	
	@Column(name = "SubTotal")
	private float subtotal;
	
	@Column(name = "Total")
	private float total;
	
	@Column(name = "Order_Status")
	private Integer status;
	
	@Column(name = "Payment_Method")
	private Integer payment;
	@ManyToOne
	private CustomerDetails customer;
	
	@ManyToOne
	private BookDetails bookDetails;

	public BookDetails getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	public OrderDetails(BookDetails bookDetails) {
		super();
		this.bookDetails = bookDetails;
	}

	public OrderDetails(CustomerDetails customer) {
		super();
		this.customer = customer;
	}

	public CustomerDetails getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}

	public OrderDetails(Integer orderId, 
			 Integer qty, float subtotal, float total, Integer status, Integer payment) {
		super();
		OrderId = orderId;
		this.qty = qty;
		this.subtotal = subtotal;
		this.total = total;
		this.status = status;
		this.payment = payment;
	}

	public Integer getOrderId() {
		return OrderId;
	}

	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPayment() {
		return payment;
	}

	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	
	

}