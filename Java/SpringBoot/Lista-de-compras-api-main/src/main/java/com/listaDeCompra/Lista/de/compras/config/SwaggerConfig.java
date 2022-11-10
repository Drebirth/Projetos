package com.listaDeCompra.Lista.de.compras.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	  @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.listaDeCompra.Lista.de.compras"))//pacote com todas as classes java
	                .paths(regex("/api.*"))//caminho que ele vai poder acessar definido no controller
	                .build()
	                .apiInfo(metaInfo());
	    }
	    private ApiInfo metaInfo() {
	        ApiInfo apiInfo = new ApiInfo(
	        		 "Lista de Compras API",
	                 "API REST de Lista de compras",
	                 "1.0",
	                 "Terms of Service",
	                 new Contact("Daniel Silva", "",
	                         "danielll98@outlook.com.br"),
	                 "Apache License Version 2.0",
	                 "https://www.apache.org/license.html", new ArrayList<VendorExtension>()
	         );
	        return apiInfo;
	    }


}
