package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})*/
@SpringBootApplication
@MapperScan("com.example.mapper")
public class SpringThymeleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafDemoApplication.class, args);
	}

}
