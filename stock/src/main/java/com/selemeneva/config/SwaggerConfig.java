package com.selemeneva.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//http://localhost:8092/api/customer/swagger-ui/index.html#/
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(
                        new Info()
                                .title("Customer Api")
                                .version("1.0").contact(
                                        new Contact()
                                                .email("nselemeneva@yahoo.com")
                                                .name("NSelemeneva")
                                )
                );
    }
}


