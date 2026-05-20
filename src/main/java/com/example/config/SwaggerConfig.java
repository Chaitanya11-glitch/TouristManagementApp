package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
    public OpenAPI touristAppOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Tourist Management API")
                        .description("REST API for managing tourist packages and profiles")
                        .version("1.0.0"));
    }
	
}
