package com.mystarter.lengthvalidationspringbootstarter.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {FieldLengthValidator.class})
public @interface CheckLength {
	String message() default "Field length validation failed. Please, check the usages of @CheckLength annotation.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
