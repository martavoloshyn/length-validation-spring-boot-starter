package com.mystarter.lengthvalidationspringbootstarter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mystarter.lengthvalidationspringbootstarter.validation.FieldLengthValidator;

@Configuration
@EnableConfigurationProperties(LengthValidationProperties.class)
public class LengthValidationAutoConfiguration {

	@Autowired
	private LengthValidationProperties lengthValidationProperties;

	@Bean
	FieldLengthValidator fieldLengthValidator() {
		return new FieldLengthValidator(lengthValidationProperties.getMinLength(), lengthValidationProperties.getMaxLength());
	}
}
