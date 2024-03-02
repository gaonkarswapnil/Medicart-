package com.master.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.master.dto.Cart;

@Service
public class CartValidator implements Validator  {

	@Override
	public boolean supports(Class<?> clazz) {


		return clazz.equals(Cart.class);
		
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"medicineName","medKey", " required field");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "quantity","queKey"," required field");		
	}

}
