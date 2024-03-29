package com.homework.jeremy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class JeremyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeremyApplication.class, args);
    }

}
