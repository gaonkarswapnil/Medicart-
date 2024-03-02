package com.master.cntr;

import java.util.List;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.master.dto.Cart;

import com.master.dto.User;
import com.master.service.CartService;
import com.master.service.MedicineService;
import com.master.valid.CartValidator;


@Controller
@Scope("session")
public class CartController {

	@Autowired
	private CartService cartService;
	
	
	@Autowired
	private MedicineService medicineService;
	
	
	
	@RequestMapping(value ="/prep_cart_add_form.htm", method = RequestMethod.GET)
	public String prepMedicineAddForm(ModelMap map, HttpSession session) {
		
		
			map.put("cart",new Cart());
			return "add_to_cart";	
			
		
	}
	
	@RequestMapping(value = "/cart_add.htm",method = RequestMethod.POST)
	
	
	public String expenseAdd(Cart cart,HttpSession session) {
		

			int userId = ((User)session.getAttribute("user")).getUserId();
			
			cart.setUserId(userId); 
			
			cartService.addInCart(cart);
			
			return "add_to_cart";

	}
	
	
	@RequestMapping(value = "/prep_cart_list.htm",method = RequestMethod.GET)
	public String allCart(ModelMap map,HttpSession session) {


			int userId = ((User)session.getAttribute("user")).getUserId();
			List<Cart> li = cartService.ListOfCart(userId);
			map.put("cartList", li);
			return "cart_list";

	}
	
	
	@RequestMapping(value = "/cart_delete.htm",method = RequestMethod.GET)
	
	public String cartDelete(@RequestParam short cartId,ModelMap map,HttpSession session) {
		
		cartService.removeFromCart(cartId);
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Cart> li = cartService.ListOfCart(userId);
		map.put("cartList",li);
		return "cart_list";	
	}
	
	
	@RequestMapping(value = "/cart_delete_all.htm",method = RequestMethod.GET)
	
	public String cartDeleteAll(ModelMap map,HttpSession session) {

		int userId = ((User)session.getAttribute("user")).getUserId();
		cartService.removeAll(userId);			
		return "requested";	
			
	}
	
}
