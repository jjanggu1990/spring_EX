package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.service.LoginCommand;

public class LoginCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return LoginCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		/*
		 * required.loginCommand.userId
		 * 에러코드.객체타입.필드명
		 * 에러코드.필드명
		 * 에러코드
		 * 
		 */
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");
		/*
		 * required.password
		 */
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required");
	}
}