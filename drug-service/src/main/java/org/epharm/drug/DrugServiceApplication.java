package org.epharm.drug;

import org.epharm.drug.crud.DrugDao;
import org.epharm.drug.models.Drug;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class DrugServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrugServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner create(DrugDao dao) {
        return args -> Stream.of(
                new Drug(1L, "Doliprane", 13),
                new Drug(2L, "Aspro", 20),
                new Drug(3L, "Aspegine", 17)
        ).forEach(dao::save);
    }
}
