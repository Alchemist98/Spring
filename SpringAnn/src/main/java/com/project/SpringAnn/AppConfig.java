package com.project.SpringAnn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//class responsible for configuration

@Configuration
@ComponentScan(basePackages="com.project.SpringAnn")
public class AppConfig {
	/*@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}*/
}
