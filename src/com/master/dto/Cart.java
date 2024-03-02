package com.master.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Cart")
public class Cart {

	@Id
	@Column(name = "cart_id")
	@GeneratedValue
	private short cartId;

	@Column(name = "medicine_name")
	private String medicineName;
	
	@Column(name = "quantity")
	private String quantity;
	
	
	private int userId;
	
	
	public Cart() {
		super();
	}


	public Cart(short cartId) {
		
		super();
		this.cartId = cartId;
	}
	
	
	public Cart(int userId) {
		super();
		this.userId = userId;
	}


	public void setCartId(short cartId) {
		this.cartId = cartId;
	}

	public int getCartId() {
		return cartId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}	
	
}
