package com.sample.hospitalManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;
@Configuration
@ComponentScan(basePackages = "com.sample")
public class HospitalConfig {

	@Bean
	public Docket hospitalAPi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.sample.hospitalManagement"))
				//.paths(regex("/hospital.*"))
				.build().apiInfo(metaData());
	}
	
	public ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("Hosital Management System", "Patient Details and their Vital Information has been provided", "1.0",
				"Term and Services", "Ideas2IT", "Licence version 2008", "Ideas2IT.com");
		return apiInfo;
	}
	
	

}
