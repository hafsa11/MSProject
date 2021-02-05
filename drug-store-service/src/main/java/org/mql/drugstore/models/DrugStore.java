package org.mql.drugstore.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DrugStore {
    @Id
    private Long id;
    private String name;
    @Embedded
    private Address address;
}
