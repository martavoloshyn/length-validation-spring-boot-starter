package com.mystarter.lengthvalidationspringbootstarter.validation;

import org.springframework.stereotype.Component;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FieldLengthValidator implements ConstraintValidator<CheckLength, String> {

	private final int minLength;
	private final int maxLength;

	@Override
	public void initialize(CheckLength constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		System.out.println("Validating...");
		return value.length() >= minLength && value.length() <= maxLength;
	}
}
