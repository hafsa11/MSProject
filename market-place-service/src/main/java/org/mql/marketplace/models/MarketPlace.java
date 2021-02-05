package org.mql.marketplace.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MarketPlace {
    @Id
    private Long id;
    private String name;
    @Embedded
    private Address address;
}
