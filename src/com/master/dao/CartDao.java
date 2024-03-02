package com.master.dao;

import java.util.List;

import com.master.dto.Cart;

public interface CartDao {

	void addToCart(Cart cart);
	void deleteFromCart(short cartId);
	List<Cart> selectAll(int userId);
	
	void deleteAll(int userId); 
}
