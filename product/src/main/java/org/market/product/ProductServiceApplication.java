package org.market.product;

import org.market.product.models.Product;
import org.market.product.resources.ProductDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner create(ProductDao dao,RepositoryRestConfiguration config) {
        config.exposeIdsFor(Product.class);
        return args -> {
            dao.save(new Product(1L, "PC", 13000));
            dao.save(new Product(2L, "Clavier", 200));
            dao.save(new Product(3L, "Souris", 170));
            dao.save(new Product(4L, "Ecran 15°", 550));
            dao.save(new Product(5L, "Ecran 17°", 750));
        };
    }

}
