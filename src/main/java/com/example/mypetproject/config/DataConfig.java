package com.example.mypetproject.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@EnableTransactionManagement
@ComponentScan("com.example.mypetproject")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("com.example.mypetproject.model")
public class DataConfig {

    private static final String PROP_DATABASE_DRIVER = "spring.dataSource.driver-class-name";
    private static final String PROP_DATABASE_PASSWORD = "spring.dataSource.password";
    private static final String PROP_DATABASE_URL = "spring.dataSource.url";
    private static final String PROP_DATABASE_USERNAME = "spring.dataSource.username";

    @Resource
    private Environment env;

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(env.getRequiredProperty(PROP_DATABASE_DRIVER));
        dataSource.setUrl(env.getRequiredProperty(PROP_DATABASE_URL));
        dataSource.setUsername(env.getRequiredProperty(PROP_DATABASE_USERNAME));
        dataSource.setPassword(env.getRequiredProperty(PROP_DATABASE_PASSWORD));

        return dataSource;
    }
}
