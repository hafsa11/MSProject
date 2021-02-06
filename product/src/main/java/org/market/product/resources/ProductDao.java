package org.market.product.resources;

import org.market.product.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductDao extends JpaRepository<Product, Long> {

}
