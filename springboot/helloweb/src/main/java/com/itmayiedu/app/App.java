package com.itmayiedu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages ={"com.itmayiedu" })
//@EnableAutoConfiguration
//@ComponentScan("com.itmayiedu")
@EnableJpaRepositories("com.itmayiedu.dao")
@EntityScan("com.itmayiedu.entity")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
