package com.example.event;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.event.pojo.Data;
import com.example.event.service.impl.ConnectionsServiceImpl;
import com.example.event.util.Constant;
import com.google.gson.Gson;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EventApplication {

	public static Data data;

	@Autowired
	private ConnectionsServiceImpl connectionsServiceImpl;

	private static Logger logger = Logger.getLogger(EventApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);
	}

	@PostConstruct
	public void load() {
		try {
			data = connectionsServiceImpl.loadData(Constant.FACLET_QUERY);
		} catch (Exception e) {
			logger.info(
					"There is some issue while loading application, Please check network connection with eventful.com");
		}
	}

	public Gson gson() {
		return new Gson();
	}

	@Bean
	public Docket eventApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.event"))
				// .paths(paths())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Event Management Rest APIs")
				.description("This page lists all the rest apis for Event Management app.").version("1.0-SNAPSHOT")
				.build();
	}

}
