package com.master.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.master.dto.User;

@Service
public class UserValidator implements Validator  {

	@Override
	public boolean supports(Class<?> clazz) {


		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","unmKey", " username required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPass","passKey"," password required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobileNumber","mobileKey"," mobile number required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId","emailKey"," email is required");
		
		User user = (User)target;
		if(user.getUserPass()!= null) {
			
			if(user.getUserPass().length()<8) {
				
				errors.rejectValue("userPass", "passKey", "password Should be more than 8 character");
			}
		}
		
		if(user.getMobileNumber()!=null) {
			
			if(user.getMobileNumber().length() != 10) {
				
				errors.rejectValue("mobileNumber", "mobileKey", " should be 10 digits");
			}
		}
	
		
	}

}
