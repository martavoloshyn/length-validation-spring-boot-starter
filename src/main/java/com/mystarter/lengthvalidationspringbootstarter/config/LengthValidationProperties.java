package com.mystarter.lengthvalidationspringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "length.validation")
public class LengthValidationProperties {
	private int minLength;
	private int maxLength;
}
