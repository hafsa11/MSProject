package org.mql.drugstore.models;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {
    private final String city;
    private final String street;
    private final String n;

    public Address(String city, String street, String n) {
        this.city = city;
        this.street = street;
        this.n = n;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getN() {
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!Objects.equals(city, address.city)) return false;
        if (!Objects.equals(street, address.street)) return false;
        return Objects.equals(n, address.n);
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (n != null ? n.hashCode() : 0);
        return result;
    }
}
