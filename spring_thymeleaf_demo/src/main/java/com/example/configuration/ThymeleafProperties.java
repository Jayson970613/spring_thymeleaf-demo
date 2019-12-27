package com.example.configuration;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.thymeleaf")
public class ThymeleafProperties {

	 private static final Charset DEFAULT_ENCODING = StandardCharsets.UTF_8;
	 
	 private static final String DEFAULT_PREFIX = "classpath:/tempplates/";
	 
	 private static final String DEFAULT_SUFFIX = ".html";
	 
}
