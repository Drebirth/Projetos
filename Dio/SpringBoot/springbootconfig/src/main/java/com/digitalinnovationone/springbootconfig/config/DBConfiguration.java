package com.digitalinnovationone.springbootconfig.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDatabaseConnection(){
        System.out.println("DB connection for Dev - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Conncetion to H2_TEST - Test instance";
    }
    //DriverClassName não está sendo mostrado no console
    //alteração do database para datasource no application properties


    @Profile("prod")
    @Bean
    public String productionDatabaseConnection(){
        System.out.println("DB connection for Production - PostgreSql");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to Postgresql - Test instance";
    }


}
