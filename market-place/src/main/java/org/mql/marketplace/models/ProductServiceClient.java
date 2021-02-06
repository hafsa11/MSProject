package org.mql.marketplace.models;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="product")
public interface ProductServiceClient {

    @GetMapping("/products/{id}")
    Product getProduct(@PathVariable Long id);

    @GetMapping("/products")
    PagedModel<Product> getAllProducts();
}
