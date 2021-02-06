package org.mql.marketplace;

import org.mql.marketplace.dao.MarketPlaceDao;
import org.mql.marketplace.models.ProductServiceClient;
import org.mql.marketplace.models.Marketplace;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MarketPlaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketPlaceApplication.class, args);
    }

    @Bean
    CommandLineRunner create(MarketPlaceDao dao, ProductServiceClient productServiceClient) {
        return args -> {
            final Marketplace market1 = new Marketplace(1L, "Baghdad Computers", "Fès");
            market1.addProduct(productServiceClient.getProduct(1L));
            System.out.println("____________________________________________"+productServiceClient.getProduct(1L));
            market1.addProduct(productServiceClient.getProduct(2L));
            market1.addProduct(productServiceClient.getProduct(3L));
            market1.addProduct(productServiceClient.getProduct(4L));
            dao.save(market1);

            final Marketplace market2 = new Marketplace(2L, "Casa Computers", "Casablanca");
            market2.addProduct(productServiceClient.getProduct(1L));
            market2.addProduct(productServiceClient.getProduct(5L));
            dao.save(market2);
        };
    }

}
