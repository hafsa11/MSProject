package org.mql.drugstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DrugStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrugStoreApplication.class, args);
    }

}
