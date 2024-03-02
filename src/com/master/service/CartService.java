package com.master.service;

import java.util.List;

import com.master.dto.Cart;

public interface CartService {

	void addInCart(Cart cart);
	void removeFromCart(short cartId);
	List<Cart> ListOfCart(int userId);
	
	void removeAll(int userId);
	
}
