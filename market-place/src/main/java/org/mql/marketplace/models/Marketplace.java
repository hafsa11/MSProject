package org.mql.marketplace.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Marketplace {
    @Id
    private Long id;
    private String name;
    private String city;
    @ElementCollection
    private List<Long> productsId;
    @Transient
    private List<Product> products;

    public Marketplace() {
        productsId = new ArrayList<>();
        products = new ArrayList<>();
    }

    public Marketplace(Long id, String name, String city) {
        this();
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Long> getProductsId() {
        return productsId;
    }

    public void setProductsId(List<Long> productsId) {
        this.productsId = productsId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p){
        products.add(p);
        productsId.add(p.getId());
    }
}
