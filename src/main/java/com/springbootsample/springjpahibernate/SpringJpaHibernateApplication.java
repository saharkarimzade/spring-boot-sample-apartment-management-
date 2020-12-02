package com.springbootsample.springjpahibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringJpaHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaHibernateApplication.class, args);
    }

}
