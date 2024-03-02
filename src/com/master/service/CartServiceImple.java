package com.master.service;

import java.util.List;

import com.master.dto.Cart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.dao.CartDao;


@Service
public class CartServiceImple implements CartService {

	@Autowired
	private CartDao cartDao;

	@Override
	public void addInCart(Cart cart) {

		cartDao.addToCart(cart);
		
	}

	@Override
	public void removeFromCart(short cartId) {
		
		cartDao.deleteFromCart(cartId);
	}

	@Override
	public List<Cart> ListOfCart(int userId) {

		return cartDao.selectAll(userId);
	}

	@Override
	public void removeAll(int userId) {
		
		cartDao.deleteAll(userId);
		
	} 
	
}
