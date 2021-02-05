package org.market.product;

import org.market.product.resources.MarketDao;
import org.market..models.Market;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class MarketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner create(MarketDao dao) {
        return args -> Stream.of(
                new Market(1L, "PC", 13000),
                new Market(2L, "Clavier", 200),
                new Market(3L, "Souris", 170)
        ).forEach(dao::save);
    }
}
